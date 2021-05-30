package chessssss;

public class Check {
public static boolean checkw(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1) {
	int a=0;
	int b=0;
	boolean c=false;
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
		if (sj[i][o]==1)
			{a=i;
		    b=o;}
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
			if(sj[i][o]>=6)
		       if(Rule.rules(a, b, i, o, sj,false, U, x1))
			      c=true;
	if(c==true)
			 System.out.println("checkw");
	return c;
			
			
}
public static boolean checkb(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1) {
	int a=0;
	int b=0;
	boolean c=false;
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
		 if (sj[i][o]==7)
		 {	a=i;
		    b=o;}
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
			if(sj[i][o]>=0&&sj[i][o]<=5)
		      if(Rule.rules(a, b, i ,o, sj,true, U, x1))
	               c=true;
		if(c==true)
				 System.out.println("checkb");
		
			return c;
			
}
public static boolean checkbs(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1) {
	
	boolean c=false;
	int a=my;
	int b=mx;
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
			if(sj[i][o]>=0&&sj[i][o]<=5)
		      if(Rule.rules(a, b, i ,o, sj,true, U, x1))
	               c=true;
		
			return c;
			
}
public static boolean checkws(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1) {
	
	boolean c=false;
	int a=my;
	int b=mx;
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
			if(sj[i][o]>=6)
		       if(Rule.rules(a, b, i, o, sj,false, U, x1))
			      c=true;
	
	return c;
			
			
}
public static boolean checkwss(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1) {
	int a=0;
	int b=0;
	boolean c=false;
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
		if (sj[i][o]==1)
			{a=i;
		    b=o;}
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
			if(sj[i][o]>=6)
		       if(Rule.rules(a, b, i, o, sj,false, U, x1))
			      c=true;
	return c;
			
			
}
public static boolean checkbss(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1) {
	int a=0;
	int b=0;
	boolean c=false;
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
		 if (sj[i][o]==7)
		 {	a=i;
		    b=o;}
	for(int i=0;i<8;i++)
		for(int o=0;o<8;o++)
			if(sj[i][o]>=0&&sj[i][o]<=5)
		      if(Rule.rules(a, b, i ,o, sj,true, U, x1))
	               c=true;
		
			return c;
			
}
}
