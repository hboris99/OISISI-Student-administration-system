package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import model.Baza;
import model.BazaPredmeta;
import model.BazaProfesora;
import model.BazaStudenata;
import model.Ocena;
import model.Predmet;
import model.Profesor;
import model.Student;

public class Serijalizacija {
	
	static Path path = Paths.get("ser" + File.separator + "data.ser");
	
	public Serijalizacija() {}
	
	public static void deserijalizuj() {
		
		try {
			
			FileInputStream fis = new FileInputStream(path.toString());
			ObjectInputStream in = new ObjectInputStream(fis);
			
			Baza.setInstance((Baza)in.readObject());
			
			BazaProfesora.getInstance().setProfesori(Baza.getInstance().getProfesori());
			BazaStudenata.getInstance().setStudenti(Baza.getInstance().getStudenti());
			BazaPredmeta.getInstance().setPredmeti(Baza.getInstance().getPredmeti());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void serijalizuj() {
		
		
		Baza.getInstance().setProfesori((ArrayList<Profesor>)BazaProfesora.getInstance().getProfesori());
		Baza.getInstance().setStudenti((ArrayList<Student>)BazaStudenata.getInstance().getStudenti());
		Baza.getInstance().setPredmeti((ArrayList<Predmet>)BazaPredmeta.getInstance().getPredmeti());
		
		try {
 
			try {
 
				Files.createDirectories(path.getParent());
				Files.createFile(path);
			}catch (IOException i) {
				//i.printStackTrace();
			} finally {
 
				FileOutputStream fos = new FileOutputStream(path.toString());
 
				ObjectOutputStream out = new ObjectOutputStream(fos);
				out.writeObject(Baza.getInstance());

				out.close();
				fos.close();
			}
		} catch (IOException i) {
			i.printStackTrace();
		}
		
	}

	
}
