package chessssss;

public class Rule {
	
	public static boolean rule(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1)
	{
		if(player&&sj[my][mx]<6&&sj[my][mx]>=0)
		{ 
			return false;
		}
		if(!player&&sj[my][mx]>5)
		{   
			return false;
		}
		switch(sj[xzy][xzx])
		{
			case 0:
			return Pawn.pawn_b(my, mx, xzy, xzx, sj,U,x1);
			case 6:
			return Pawn.pawn_w(my, mx, xzy, xzx, sj,U,x1);
			case 4:
			case 10:
			return Rook.rook(my, mx, xzy, xzx, sj);
		    case 5:
		    case 11:
		    return Knight.knight(my, mx, xzy, xzx);
		    case 2:
		    case 8:
		    return Queen.queen(my, mx, xzy, xzx, sj);
		    case 3:
		    case 9:
		    return Bishop.bishop(my, mx, xzy, xzx, sj);
	        default:		
	        return King.king(my, mx, xzy, xzx,U,sj,x1);
		   
	}}
		public static boolean rules(int my,int mx,int xzy,int xzx, int sj[][],boolean player,int[][][] U,int x1)
		{
			if(player&&sj[my][mx]<6&&sj[my][mx]>=0)
			{ 
				return false;
			}
			if(!player&&sj[my][mx]>5)
			{   
				return false;
			}
			switch(sj[xzy][xzx])
			{
				case 0:
				return Pawn.pawn_bs(my, mx, xzy, xzx, sj,U,x1);
				case 6:
				return Pawn.pawn_ws(my, mx, xzy, xzx, sj,U,x1);
				case 4:
				case 10:
				return Rook.rook(my, mx, xzy, xzx, sj);
			    case 5:
			    case 11:
			    return Knight.knight(my, mx, xzy, xzx);
			    case 2:
			    case 8:
			    return Queen.queen(my, mx, xzy, xzx, sj);
			    case 3:
			    case 9:
			    return Bishop.bishop(my, mx, xzy, xzx, sj);
		        default:		
		        return King.king(my, mx, xzy, xzx,U,sj,x1);
			   
		}
	}
			


			

	
}
