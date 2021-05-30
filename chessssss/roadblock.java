package chessssss;

public class roadblock {
	  public static boolean roadblock_x(int xzx,int mx,int sj[][],int my)
		{  
					int xq=xzx;
					int xz=mx;
					if(xq>xz)
					{
						xq=mx;
						xz=xzx;
					}
					for(int i=xq+1;i<xz;i++)
					{
						if(sj[my][i]!=-1)
						{    
							return false;
						}
					}
					return true;
					
				
		}
	  public static boolean roadblock_y(int xzy,int my,int sj[][],int mx)
		{		
		       	    int yq=xzy;
					int yz=my;
					if(yq>yz)
					{
						yq=my;
						yz=xzy;
					}
					for(int i=yq+1;i<yz;i++)
					{
						if(sj[i][mx]!=-1)
						{    
							return false;
						}
					}
					return true;
		}

}