package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.WindowConstants;

import controller.ProfesoriController;
import model.BazaPredmeta;
import model.BazaProfesora;
import model.BazaStudenata;
import model.Profesor;


public class MainClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		MainFrame.getInstance();
		MainFrame.getInstance().setLocationRelativeTo(null);
		MainFrame.getInstance().setVisible(true);
		MainFrame.getInstance().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		try {
			Path path1 = Paths.get("ser" + File.separator + "profesoriData.ser");
			Path path2 = Paths.get("ser" + File.separator + "studentiData.ser");
			Path path3 = Paths.get("ser" + File.separator + "predmetiData.ser");
 
			try {
 
				Files.createDirectories(path1.getParent());
				Files.createFile(path1);
				Files.createDirectories(path2.getParent());
				Files.createFile(path2);
				Files.createDirectories(path3.getParent());
				Files.createFile(path3);
			}catch (IOException i) {
				i.printStackTrace();
			} finally {
 
				FileOutputStream profOutFile = new FileOutputStream(path1.toString());
				FileOutputStream studentiOutFile = new FileOutputStream(path2.toString());
				FileOutputStream predmetiOutFile = new FileOutputStream(path3.toString());
				System.out.println(path1.toString());
 
				ObjectOutputStream profOut = new ObjectOutputStream(profOutFile);
				ObjectOutputStream studentiOut = new ObjectOutputStream(studentiOutFile);
				ObjectOutputStream predmetiOut = new ObjectOutputStream(predmetiOutFile);
				profOut.writeObject(BazaProfesora.getInstance().getProfesori());
				profOut.close();
				profOutFile.close();
				studentiOut.writeObject(BazaStudenata.getInstance().getStudenti());
				studentiOut.close();
				studentiOutFile.close();
				predmetiOut.writeObject(BazaPredmeta.getInstance().getPredmeti());
				predmetiOut.close();
				predmetiOutFile.close();
			}
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
