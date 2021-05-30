package chessssss;

import javax.swing.JOptionPane;
public class Pawn {
		  static String text="";
	public static boolean pawn_w(int my,int mx,int xzy,int xzx,int sj[][],int U[][][],int x1) {
	if(xzy==3&&xzx==0)
		if(U[x1][3][1]==0&&U[x1-1][1][1]==0)
			if(my==2&&mx==1)
			{sj[3][1]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
	
	
	if(xzy==3&&xzx==1)
		{if(U[x1][3][0]==0&&U[x1-1][1][0]==0)
			if(my==2&&mx==0)
			{sj[3][0]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		if(U[x1][3][2]==0&&U[x1-1][1][2]==0)
			if(my==2&&mx==2)
			{sj[3][2]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		}
	
	
	if(xzy==3&&xzx==2)
	{if(U[x1][3][1]==0&&U[x1-1][1][1]==0)
		if(my==2&&mx==1)
		{sj[3][1]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	if(U[x1][3][3]==0&&U[x1-1][1][3]==0)
		if(my==2&&mx==3)
		{sj[3][3]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	}
	
	if(xzy==3&&xzx==3)
	{if(U[x1][3][2]==0&&U[x1-1][1][2]==0)
		if(my==2&&mx==2)
		{sj[3][2]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	if(U[x1][3][4]==0&&U[x1-1][1][4]==0)
		if(my==2&&mx==4)
		{sj[3][4]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	}
	
	if(xzy==3&&xzx==4)
	{if(U[x1][3][3]==0&&U[x1-1][1][3]==0)
		if(my==2&&mx==3)
		{sj[3][3]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	if(U[x1][3][5]==0&&U[x1-1][1][5]==0)
		if(my==2&&mx==5)
		{sj[3][5]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	}
	if(xzy==3&&xzx==5)
	{if(U[x1][3][4]==0&&U[x1-1][1][4]==0)
		if(my==2&&mx==4)
		{sj[3][4]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	if(U[x1][3][6]==0&&U[x1-1][1][6]==0)
		if(my==2&&mx==6)
		{sj[3][6]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	}
	
	if(xzy==3&&xzx==6)
	{if(U[x1][3][5]==0&&U[x1-1][1][5]==0)
		if(my==2&&mx==5)
		{sj[3][5]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	if(U[x1][3][7]==0&&U[x1-1][1][7]==0)
		if(my==2&&mx==7)
		{sj[3][7]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	}
	
	if(xzy==3&&xzx==7)
	if(U[x1][3][6]==0&&U[x1-1][1][6]==0)
		if(my==2&&mx==6)
		{sj[3][6]=-1;
		System.out.println("Crossing the soldiers");
		return true;}
	
	
	if((xzx==mx)&&(my-xzy==-1)&&(sj[my][mx]==-1))
	{ if(my==0)
	{text = JOptionPane.showInputDialog("Type something.(Q - Queen ,K - Knight ,R - Rock ,B - Bishop)");
    if ( text.equals("Q") )   
	sj[xzy][xzx]=8;
    else if (text.equals("K"))
    sj[xzy][xzx]=11;
    else if (text.equals("R"))
    sj[xzy][xzx]=10;
    else if(text.equals("B"))
    sj[xzy][xzx]=9;
    else 
    	{System.out.print("Wrong,rechoose");
        return false;
    	}System.out.println("promotion");}
	    
		return true;}
	
	if((my-xzy==-1)&&(Math.abs(mx-xzx)==1)&&(sj[my][mx]!=-1))
		{if(my==0)
		{text = JOptionPane.showInputDialog("Type something.(Q - Queen ,K - Knight ,R - Rock ,B - Bishop)");
	    if (text.equals("Q") )   
		sj[xzy][xzx]=8;
	    else if (text.equals("K"))
	    sj[xzy][xzx]=11;
	    else if (text.equals("R"))
	    sj[xzy][xzx]=10;
	    else if(text.equals("B"))
	    sj[xzy][xzx]=9;
	    else 
	    	{System.out.print("Wrong,rechoose");
	        return false;
	    	}
	    System.out.println("promotion");}
			return true;}
		
	if((xzx==mx)&&(my-xzy==-2)&&(sj[my][mx]==-1)&&(xzy==6)&&(sj[my+1][mx]==-1))
	{if(my==0)
	{text = JOptionPane.showInputDialog("Type something.(Q - Queen ,K - Knight ,R - Rock ,B - Bishop)");
    if (text.equals("Q") )   
	sj[xzy][xzx]=8;
    else if (text.equals("K"))
    sj[xzy][xzx]=11;
    else if (text.equals("R"))
    sj[xzy][xzx]=10;
    else if(text.equals("B"))
    sj[xzy][xzx]=9;
    else 
    	{System.out.print("Wrong,rechoose");
        return false;
    	}
	    System.out.println("promotion");}
		return true;}
	return false;}
	
	public static boolean pawn_b(int my,int mx,int xzy,int xzx,int sj[][],int U[][][],int x1) {
		if(xzy==4&&xzx==0)
			if(U[x1][4][1]==6&&U[x1-1][6][1]==6)
				if(my==5&&mx==1)
				{sj[4][1]=-1;
				System.out.println("Crossing the soldiers");
				return true;}
		
		
		if(xzy==4&&xzx==1)
			{if(U[x1][4][0]==6&&U[x1-1][6][0]==6)
				if(my==5&&mx==0)
				{sj[4][0]=-1;
				System.out.println("Crossing the soldiers");
				return true;}
			if(U[x1][4][2]==6&&U[x1-1][6][2]==6)
				if(my==5&&mx==2)
				{sj[4][2]=-1;
				System.out.println("Crossing the soldiers");
				return true;}
			}
		
		
		if(xzy==4&&xzx==2)
		{if(U[x1][4][1]==6&&U[x1-1][6][1]==6)
			if(my==5&&mx==1)
			{sj[4][1]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		if(U[x1][4][3]==6&&U[x1-1][6][3]==6)
			if(my==5&&mx==3)
			{sj[4][3]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		}
		
		if(xzy==4&&xzx==3)
		{if(U[x1][4][2]==6&&U[x1-1][6][2]==6)
			if(my==5&&mx==2)
			{sj[4][2]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		if(U[x1][4][4]==6&&U[x1-1][6][4]==6)
			if(my==5&&mx==4)
			{sj[4][4]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		}
		
		if(xzy==4&&xzx==4)
		{if(U[x1][4][3]==6&&U[x1-1][6][3]==6)
			if(my==5&&mx==3)
			{sj[4][3]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		if(U[x1][4][5]==6&&U[x1-1][6][5]==6)
			if(my==5&&mx==5)
			{sj[4][5]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		}
		if(xzy==4&&xzx==5)
		{if(U[x1][4][4]==6&&U[x1-1][6][4]==6)
			if(my==5&&mx==4)
			{sj[4][4]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		if(U[x1][4][6]==6&&U[x1-1][6][6]==6)
			if(my==5&&mx==6)
			{sj[4][6]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		}
		
		if(xzy==4&&xzx==6)
		{if(U[x1][4][5]==6&&U[x1-1][6][5]==6)
			if(my==5&&mx==5)
			{sj[4][5]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		if(U[x1][4][7]==6&&U[x1-1][6][7]==6)
			if(my==5&&mx==7)
			{sj[4][7]=-1;
			System.out.println("Crossing the soldiers");
			return true;}
		}
		
		if(xzy==4&&xzx==7)
		if(U[x1][4][6]==6&&U[x1-1][6][6]==6)
			if(my==5&&mx==6)
			{sj[4][6]=-1;
			System.out.println("Crossing passing soldier");
			return true;}
		
		
		
		
		
		
		if((xzx==mx)&&(my-xzy==1)&&(sj[my][mx]==-1))
		{if(my==7)
		{text = JOptionPane.showInputDialog("Type something.(Q - Queen ,K - Knight ,R - Rock ,B - Bishop)");
	    if ( text.equals("Q") )   
		sj[xzy][xzx]=2;
	    else if (text.equals("K"))
	    sj[xzy][xzx]=5;
	    else if (text.equals("R"))
	    sj[xzy][xzx]=4;
	    else if(text.equals("B"))
	    sj[xzy][xzx]=3;
	    else 
	    	{System.out.print("Wrong,rechoose");
	        return false;
	    	}
	    System.out.println("promotion");}
			return true;}
		if((my-xzy==1)&&(Math.abs(mx-xzx)==1)&&(sj[my][mx]!=-1))
		{if(my==7)
		{text = JOptionPane.showInputDialog("Type something.(Q - Queen ,K - Knight ,R - Rock ,B - Bishop)");
	    if ( text.equals("Q") )   
		sj[xzy][xzx]=2;
	    else if (text.equals("K"))
	    sj[xzy][xzx]=5;
	    else if (text.equals("R"))
	    sj[xzy][xzx]=4;
	    else if(text.equals("B"))
	    sj[xzy][xzx]=3;
	    else 
	    	{System.out.print("Wrong,rechoose");
	        return false;
	    	}
	    System.out.println("promotion");}
			return true;}
		if((xzx==mx)&&(my-xzy==2)&&(sj[my][mx]==-1)&&(xzy==1)&&(sj[xzy+1][mx]==-1))
		{if(my==7)
		{text = JOptionPane.showInputDialog("Type something.(Q - Queen ,K - Knight ,R - Rock ,B - Bishop)");
	    if (text.equals("Q"))   
		sj[xzy][xzx]=2;
	    else if (text.equals("K"))
	    sj[xzy][xzx]=5;
	    else if (text.equals("R"))
	    sj[xzy][xzx]=4;
	    else if(text.equals("B"))
	    sj[xzy][xzx]=3;
	    else 
	    	{System.out.print("Wrong,rechoose");
	        return false;
	    	}
	    System.out.println("promotion");}
			return true;}
	return false;
	}	
	public static boolean pawn_ws(int my,int mx,int xzy,int xzx,int sj[][],int U[][][],int x1) {
		
		
		if((xzx==mx)&&(my-xzy==-1)&&(sj[my][mx]==-1))
		{ 
		    
			return true;}
		
		if((my-xzy==-1)&&(Math.abs(mx-xzx)==1)&&(sj[my][mx]!=-1))
		{
				return true;}
			
		if((xzx==mx)&&(my-xzy==-2)&&(sj[my][mx]==-1)&&(xzy==6)&&(sj[my+1][mx]==-1))
		{
			return true;}
		return false;}
		
		public static boolean pawn_bs(int my,int mx,int xzy,int xzx,int sj[][],int U[][][],int x1) {
			
			
			
			if((xzx==mx)&&(my-xzy==1)&&(sj[my][mx]==-1))
			{
				return true;}
			if((my-xzy==1)&&(Math.abs(mx-xzx)==1)&&(sj[my][mx]!=-1))
			{
				return true;}
			if((xzx==mx)&&(my-xzy==2)&&(sj[my][mx]==-1)&&(xzy==1)&&(sj[xzy+1][mx]==-1))
			{
				return true;}
		return false;
		}	
		

}

      