package com.ruster.test;

import java.util.concurrent.TimeUnit;

public class MyOtherThread implements Runnable {
    private String threadName;
    private int duration;
	public MyOtherThread(String name,int sleepduration) {
		threadName=name;
		duration=sleepduration;
	}

	@Override
	public void run() {
		
		try{	
			System.out.println("MyOtherThread "+ threadName+" sleep");
			TimeUnit.SECONDS.sleep(duration);
			}
			catch(InterruptedException e)
			{			System.out.println("MyOtherThread Interrupt exception catch block");		}
			
		
		
		int i=10;
		while(i>0){
			i--;
		try{	
		System.out.println("MyOtherThread "+ threadName+" running");
		TimeUnit.SECONDS.sleep(3);
		}
		catch(InterruptedException e)
		{			System.out.println("MyOtherThread exception catch block");		}
		
		/*try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.currentThread().yield();*/
		}


	}

}
