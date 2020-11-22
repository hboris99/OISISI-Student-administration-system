package paket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;  

public class CurrentTime implements Runnable{
	
	Thread thread = null;  
	String timeString = "";
	JLabel l;

	public CurrentTime(JLabel l) {
		 thread = new Thread(this);  
	     thread.start(); 
	     this.l = l;
	};
	
	 public void run() {  
	      try {  
	         while (true) {  
	  
	            Calendar calendar = Calendar.getInstance();  
	            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm  dd.MM.YYYY.");  
	            Date date = calendar.getTime();  
	            timeString = formatter.format( date );  
	  
	            l.setText(timeString);  
	  
	            thread.sleep(1000);  // interval given in milliseconds  
	         }  
	      }  
	      catch (Exception e) { }  
	 }  
	  

	  

}
