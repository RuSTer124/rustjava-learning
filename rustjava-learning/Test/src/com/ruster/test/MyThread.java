package com.ruster.test;

import java.util.concurrent.TimeUnit;

public class MyThread implements Runnable {
    Common comlink;
	public MyThread(Common com) {
		comlink=com;
	}

	@Override
	public void run() throws RuntimeException {
		int i=1000;
		int y=0;
		int n=1/0;
		int t= comlink.getCommonField();
		
		while(i>0){
			i--;
			synchronized (comlink) {
				try {
					comlink.commonfield=1;
					comlink.notifyAll();
					comlink.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Thread exception wait() interrupt");	
					e.printStackTrace();
				}
			}
		try{	
		System.out.println("MyThread running");
		TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e)
		{			System.out.println("Thread exception catch block");		}
		
		
		
		}

	}

}
