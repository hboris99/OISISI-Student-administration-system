package controller;

public class ProfesoriController {
	
	private static ProfesoriController instance = null;
	
	private ProfesoriController() {} 
	
	public static ProfesoriController getInstance(){
		
        if (instance == null) 
            instance = new ProfesoriController(); 
  
        return instance; 
	}
	
	public void dodajProf() {}
	
	public void obrisiProf(int rowSelectedIndex) {}
}
