package chessssss;

import javax.swing.JOptionPane;

public class Copyright {
	private static Copyright singletonInstance;
	
	private Copyright() {}
	
	 public static Copyright getSingletonInstance() {
	        if (singletonInstance == null) {
	            singletonInstance = new Copyright();
	        }
	        return singletonInstance;
	    }
	 public void copyrightout() {
		 JOptionPane.showMessageDialog(null, "如有侵权，将追究法律责任", "版权声明",JOptionPane.WARNING_MESSAGE); 
	 }
}
