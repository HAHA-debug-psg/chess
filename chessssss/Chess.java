package chessssss;
import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.event.*;
public class Chess extends Frame
{   boolean player=true; 
	boolean xz=false;
	boolean over=false;
	int tempx=-1;
	int tempy=-1;
	int mx=0;
	int my=0;
	int xzx=0;
	int xzy=0;
	
	int x1=0;
	int x2=0;
	int x3=0;
	Image ii[]=new Image[12];
	int sj[][]={
	{4,5,3,1,2,3,5,4},
	{0,0,0,0,0,0,0,0},
	{-1,-1,-1,-1,-1,-1,-1,-1},
	{-1,-1,-1,-1,-1,-1,-1,-1},
	{-1,-1,-1,-1,-1,-1,-1,-1},
	{-1,-1,-1,-1,-1,-1,-1,-1},
	{6,6,6,6,6,6,6,6},
	{10,11,9,7,8,9,11,10}};
	int[][][] U = new int[99999][8][8]; 

	int ou[][] = new int[8][8]; 
	public Chess()
	{
		 for(x2=0;x2<8;x2++)
			  for(x3=0;x3<8;x3++)
		         U[x1][x2][x3]=sj[x2][x3];
		
	    this.setTitle(" 请黑方落子！");
		ii[0]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\b0.png").getImage();
		ii[1]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\b1.png").getImage();
		ii[2]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\b2.png").getImage();
		ii[3]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\b3.png").getImage();
		ii[4]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\b4.png").getImage();
		ii[5]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\b5.png").getImage();
		ii[6]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\w0.png").getImage();
		ii[7]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\w1.png").getImage();
		ii[8]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\w2.png").getImage();
		ii[9]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\w3.png").getImage();
		ii[10]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\w4.png").getImage();
		ii[11]=new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\w5.png").getImage();
	    this.addWindowListener(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0); 
				}
			}
			);
		this.addMouseListener(
			new MouseAdapter()
			{
				public void mousePressed(MouseEvent e)
				{
					int i=(e.getX()-8)/100;
					int j=(e.getY()-23)/100;
					
					if(xz)
					{
						if(!Rule.rule( my, mx, xzy, xzx, sj, player,U,x1)){
                           
						   xz=false;
						   return;	
						}
						for(int k=0;k<8;k++)
							for(int q=0;q<8;q++)
							 ou[k][q]=sj[k][q];
						ou[j][i]=ou[xzy][xzx];

						ou[xzy][xzx]=-1;
						if((player&&Check.checkwss(my, mx, xzy, xzx, ou, player,U,x1))||(!player&&Check.checkbss(my, mx, xzy, xzx, ou, player,U,x1)))
						{xz=false;
						System.out.println("TO GET CHECK");
						return;}
						
						mx=i;
						my=j;
						
						if(player)
						System.out.println("Black"+":"+"("+xzx+","+xzy+")"+"-"+"("+mx+","+my+")");
						else
						System.out.println("White"+":"+"("+xzx+","+xzy+")"+"-"+"("+mx+","+my+")");	
						tempx=mx;tempy=my;
					
						if(sj[my][mx]==1||sj[my][mx]==7)
						{
							over=true;
						}
						sj[j][i]=sj[xzy][xzx];
						sj[xzy][xzx]=-1;
						x1++;

						
						 for(x2=0;x2<8;x2++)
							  for(x3=0;x3<8;x3++)
						         U[x1][x2][x3]=sj[x2][x3];
						xz=false;
						player=!player;

						Check.checkw(my, mx, xzy, xzx, sj, player,U,x1);


					
						Check.checkb(my, mx, xzy, xzx, sj, player,U,x1);						
					
						
					}else
					{
						 if(sj[j][i]==-1)
			     	     {
			     		     return;
				         }
				          if(player&&sj[j][i]>5)
				          {
				           	return;
				          }
				         if(!player&&sj[j][i]<6)
				         {
				    	   return;
				         }

				        xzx=i;
				       	xzy=j;
				       	xz=true;
					}
					repaint();
				}
			}
			);
		this.addMouseMotionListener(
			new MouseAdapter()
			{
				public void mouseMoved(MouseEvent e)
				{
					int i=(e.getX()-8)/100;
					int j=(e.getY()-23)/100;
             		mx=i;
					my=j;
					repaint();
					
				}
			}
			
			);
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				char charA=e.getKeyChar();
				if (charA=='R')
				{ if(x1>=2)
				{U=Regret.regret(x1,U,sj);
				System.out.println("悔棋");
				 for(x2=0;x2<8;x2++)
					  for(x3=0;x3<8;x3++)
						  sj[x2][x3]=U[x1][x2][x3];}
				}
				 if (charA=='T')
					{System.out.println("和棋 重新开始");
					 player=true; 
					 U=Reopen.reopen(x1,U,sj);
					 for(x2=0;x2<8;x2++)
						  for(x3=0;x3<8;x3++)
							  sj[x2][x3]=U[x1][x2][x3];}
				 if (charA=='Y')
					{if(player)
					 System.out.println("黑方认输");
					if(!player)
						 System.out.println("白方认输");
					over=Surrender.surrender(over);
				
				}
				 repaint();}
				
		});
		
		this.setBounds(0,0,800+16,800+33);
        this.setVisible(true);
	}


	public void update(Graphics g)
	{
			paint(g);
	}
    public void paint(Graphics g)
	{
        if(player)
		{
							
			setTitle(" 请黑方落子！");
		}else
		{
			setTitle(" 请白方落子！");
		}
		Image ibuffer=this.createImage(800+16,800+33);
		Graphics gg=ibuffer.getGraphics();
		myPaint(gg);
		g.drawImage(ibuffer,0,0,null);
	}
	public void myPaint(Graphics g)
	{
		g.setColor(new Color(252,160,105));
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i+j)%2==0)
				{
					g.setColor(new Color(190,135,10));
				}else{
				    g.setColor(Color.white);
			    }
			    g.fillRect(8+i*100,23+j*100,100,100);
		}
	}
	
	for(int i=0;i<8;i++)
	{
		for(int j=0;j<8;j++)
		{
			if(sj[j][i]==-1)
			{
			   continue;	
			}
			g.drawImage(ii[sj[j][i]],8+23+i*100,23+j*100,null);
		}
	}
	
    if(xz)
    {
    g.setColor(new Color(21,255,0,140));
	g.fillRect(8+xzx*100,23+xzy*100,100,100);
	g.setColor(Color.green);
	 
	}
    Over.over(over,g);
}
	
public static void main(String args[])
{   Copyright.getSingletonInstance().copyrightout();
   System.out.println("R-悔棋");
   System.out.println("T-和棋");
   System.out.println("Y-认输");
	new Chess();
}


}