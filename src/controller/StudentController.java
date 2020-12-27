package controller;

public class StudentController {
	
	
	private static StudentController instance = null;
	
	private StudentController() {} 
	
	public static StudentController getInstance(){
		
        if (instance == null) 
            instance = new StudentController(); 
  
        return instance; 
	}
	
	public void dodajStudenta() {
		
	}
	public void obrisiStudenta(int rowSelectedIndex) {
		
	}
}
