package chessssss;

public class Queen {
	
	public static boolean queen(int my,int mx,int xzy,int xzx, int sj[][]) {
		
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
			
			   if(roadblock.roadblock_y(xzy,my,sj,mx))
				
			   {
				
				   return true;
					
			   }else{
				
				   
							return false;
						}
					}	
					
		   if(my!=xzy&&mx!=xzx)
			
		   {  
			
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
		   
return false;
	}}
