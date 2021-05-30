package chessssss;

public class King {
	public static boolean king(int my,int mx,int xzy,int xzx,int[][][] U,int[][] sj,int x1)
	
	{
		if(Math.abs(xzx-mx)<=1&&Math.abs(xzy-my)<=1)
        {
        	return true;
        }
		int a=0;
		for(int i=0;i<=x1;i++)
			if(U[i][0][0]!=4)
				a=3;
		for(int i=0;i<=x1;i++)
			if(U[i][0][3]!=1)
				a=3;
		
	    if(sj[xzy][xzx]==1)
	    	if(sj[0][1]==-1&&sj[0][2]==-1)
	    		if(a==0)
	    			if(my==0&&mx==1)
	    				if(!(Check.checkws(0, 3, xzy, xzx, sj, false, U, x1)||Check.checkws(0, 2, xzy, xzx, sj, false, U, x1)||Check.checkws(0, 1, xzy, xzx, sj, false, U, x1)))
	    			   {sj[0][0]=-1;
	    				sj[0][2]=4;
	    				System.out.println("Castling");
	    				return true;
	    				}
	    int b=0;
		for(int i=0;i<=x1;i++)
			if(U[i][0][7]!=4)
				b=3;
		for(int i=0;i<=x1;i++)
			if(U[i][0][3]!=1)
				b=3;
		
	    if(sj[xzy][xzx]==1)
	    	if(sj[0][4]==-1&&sj[0][5]==-1&&sj[0][6]==-1)
	    		if(b==0)
	    			if(my==0&&mx==5)
	    				if(!(Check.checkws(0, 3, xzy, xzx, sj, false, U, x1)||Check.checkws(0, 4, xzy, xzx, sj, false, U, x1)||Check.checkws(0, 5, xzy, xzx, sj, false, U, x1)))
	    			   {sj[0][7]=-1;
	    				sj[0][4]=4;

	    				System.out.println("Castling");
	    				return true;
	    				}
	

		int c=0;
		for(int i=0;i<=x1;i++)
			if(U[i][7][0]!=10)
				c=3;
		for(int i=0;i<=x1;i++)
			if(U[i][7][3]!=7)
				c=3;
		
	    if(sj[xzy][xzx]==7)
	    	if(sj[7][1]==-1&&sj[7][2]==-1)
	    		if(c==0)
	    			if(my==7&&mx==1)
	    				if(!(Check.checkbs(7, 3, xzy, xzx, sj, true, U, x1)||Check.checkbs(7, 2, xzy, xzx, sj, true, U, x1)||Check.checkbs(7, 1, xzy, xzx, sj, true, U, x1)))
	    			   {sj[0][0]=-1;
	    				sj[0][2]=10;
	    				System.out.println("Castling");
	    				return true;
	    				}
	    int d=0;
	 		for(int i=0;i<=x1;i++)
	 			if(U[i][7][7]!=10)
	 				d=3;
	 		for(int i=0;i<=x1;i++)
	 			if(U[i][7][3]!=7)
	 				d=3;
	 		
	 	    if(sj[xzy][xzx]==7)
	 	    	if(sj[7][4]==-1&&sj[7][5]==-1&&sj[7][6]==-1)
	 	    		if(d==0)
	 	    			if(my==7&&mx==5)
	 	    				if(!(Check.checkbs(7, 3, xzy, xzx, sj, false, U, x1)||Check.checkbs(7, 4, xzy, xzx, sj, false, U, x1)||Check.checkbs(7, 5, xzy, xzx, sj, false, U, x1)))
	 	    			   {sj[7][7]=-1;
	 	    				sj[7][4]=10;

	 	    				System.out.println("Castling");
	 	    				return true;
	 	    				}
	 	
	    
	return false;
	}
	
}
