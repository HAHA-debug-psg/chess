package chessssss;

public class Knight {
	public static boolean knight(int my,int mx,int xzy,int xzx) {
	if(Math.abs(xzx-mx)==1&&Math.abs(xzy-my)==2)
    {
    	return true;
    }
    if(Math.abs(xzx-mx)==2&&Math.abs(xzy-my)==1)
    {
    	return true;
    }
    return false;}
}
