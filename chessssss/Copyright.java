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
		 JOptionPane.showMessageDialog(null, "������Ȩ����׷����������", "��Ȩ����",JOptionPane.WARNING_MESSAGE); 
	 }
}
