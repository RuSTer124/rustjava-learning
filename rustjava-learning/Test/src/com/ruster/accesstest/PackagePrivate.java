package com.ruster.accesstest;

public class PackagePrivate {
	private int t=2;
	private static String str="EnvirClass";
	
	
}

 class A{
	 String str="Hello";
	 final int p=2;
	void g(){
	     final int methodvar=1;
		PackagePrivate pack=new PackagePrivate(){
			int i=0;
			int y=p;
			String str1=str;
			
		};
	}
}
