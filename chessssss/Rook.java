package chessssss;

public class Rook {
	public static boolean rook(int my,int mx,int xzy,int xzx, int sj[][]) {
		if(my==xzy)
		{ 
			if(roadblock.roadblock_x(xzx, mx, sj, my))
			{
				return true;
			}else{
				return false;
			}
		}
		if(mx==xzx)
		{
			if(roadblock.roadblock_y(xzy, my, sj, mx))
			{
				return true;
			}else{
				return false;
			}
		}	
		return false;
	}
}
