package chessssss;

public class Reopen {
	public static int[][][] reopen(int x1,int[][][] U,int[][] sj) {
		int x2=0;
		int x3=0;
		
		 for(x2=0;x2<8;x2++)
			  for(x3=0;x3<8;x3++)
		         U[x1][x2][x3]=U[0][x2][x3];
		return U;
		
	
	}

}