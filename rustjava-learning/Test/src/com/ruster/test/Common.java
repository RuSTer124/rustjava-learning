package com.ruster.test;

public class Common {
	int commonfield=4;
    public synchronized void setCommonField(int t){
  	  commonfield=t;
    }
    public synchronized int getCommonField(){
    	
			
		
  	 return commonfield; 
    }
  
	public Common() {
		// TODO Auto-generated constructor stub
	}

}
