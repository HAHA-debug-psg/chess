package chessssss;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Over {
	public static void over(boolean over,Graphics g)
	{ 
		if(over) {
		g.setColor(Color.black);
		g.setFont(new Font("����",1,140));
		g.drawString("��Ϸ����",120,400);
		
	}}
}
