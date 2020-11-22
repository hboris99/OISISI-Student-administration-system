package paket;
import javax.swing.*;  
import java.awt.*;  
import java.text.*;  
import java.util.*;  

public class CurrentTime implements Runnable{
	
	Thread t=null;  
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";
	JLabel l;

	public CurrentTime(JLabel l) {
		 t = new Thread(this);  
	     t.start(); 
	     this.l = l;
	};
	
	 public void run() {  
	      try {  
	         while (true) {  
	  
	            Calendar cal = Calendar.getInstance();  
	            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm dd.MM.YYYY.");  
	            Date date = cal.getTime();  
	            timeString = formatter.format( date );  
	  
	            l.setText(timeString);  
	  
	            t.sleep( 1000 );  // interval given in milliseconds  
	         }  
	      }  
	      catch (Exception e) { }  
	 }  
	  

	  

}
