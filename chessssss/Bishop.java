package chessssss;

public class Bishop {
	
public static boolean bishop(int my,int mx,int xzy,int xzx, int sj[][]) {

	int xq=mx;
		
    	int xz=xzx;

    	if((xzx-mx)==(xzy-my))
    {
    		
        if(xq>xz)
    	{
        	
    		xq=xzx;
    		
    		xz=mx;
    	}
        
    	for(int i=xq+1;i<xz;i++)
    
    	{
    	
    		if(sj[i-mx+my][i]!=-1)
    	    
    		{
    	
    			return false;
    	    
    		}
    	}
    	
    	return true;
    }
    
    	if((xzx+xzy)==(mx+my))
    {
    	
    	for(int i=xq+1;i<xz;i++)
    	{
    	
    		if(sj[mx+my-i][i]!=-1)
    	
    	
    		{
    		
    			return false;
    		
    		}
    	
    	}
    	
    	return true;
    	
    }
    	
    return false;
	}
}
