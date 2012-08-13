package com.ruster.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import com.ruster.accesstest.PackagePrivate;


public class Test {
	final static HashSet<Integer> testHashSet;
     static int inttest;
     static int i=0;
      
   // myClass my;
   static
    {
	    
    	testHashSet=new HashSet<Integer>();
    	try{
    		;
    	}
    	//inttest=1/i;}
    	catch(Exception e){
    	e.printStackTrace();
    	}
    	
    	
    }
	public Test() {
		// TODO Auto-generated constructor stub
		//testHashSet=new HashSet<Integer>();
		//inttest=0;
		//testHashSet=myHashSet;
	}
	protected static void ProtectedMethod(){
		testHashSet.add(6666);
		testHashSet.add(555);
		//HashSet<Integer> myHashSet=new HashSet<Integer>();
	}

	protected static void ProtectedMethod(String str){
		str="test";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		System.out.println("Hello     World");
		System.out.println("Hello     World");
		
			
		//myClass myclassobject2=myclassobject1;
	
		HashMap<String,Integer> dir= new HashMap<String,Integer>();
		dir.put("Test",12333);
		dir.put("Test",11199);
		System.out.println(dir.get("Test"));
		System.out.println(dir);
		PackagePrivate packpriv= new PackagePrivate();
		//PackagePrivate.Inner inn=packpriv.new Inner(); 
		String strtr="tttt";
		//System.out.println(null);
		System.out.println(strtr.intern());
		System.out.println(strtr);
		float p=0.81f;
		//MyThread myThread=new MyThread();
		//myThread.run();
		Common com=new Common();
		Thread t=new Thread(new MyThread(com));
		Thread h=new Thread(new MyOtherThread("SuperOther",100));
		//t.setDaemon(true);
		t.start();
		//h.start();
		
		
		System.out.println("Main Thread");

		try{	
			TimeUnit.SECONDS.sleep(5);
		}
		catch(InterruptedException e)
		{			System.out.println("Thread exception catch block");		}
		
		//t.interrupt();
		while(true){
			synchronized (com) {
				//com.commonfield=2;
				com.notifyAll();
				}
			
		}
		/*while(true){
		synchronized (com) {
			com.commonfield=2;
			com.notifyAll();
		    //com.wait();
		}*/
		
		
		
		
		//}
		
	   // while(true);
	
		
		
		
		
		
	
	}

}
class TestPr {

	public TestPr() {
		// TODO Auto-generated constructor stub
	}
 }
