package com.ruster.test;

import java.util.HashMap;
import java.util.HashSet;

import com.ruster.accesstest.PackagePrivate;

public class Test {
	final static HashSet<Integer> testHashSet;
     static int inttest;
     static int i=0;
     
   // myClass my;
   static
    {
    	testHashSet=new HashSet<Integer>();
    	//inttest=1/i;
    	;
    	
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
	public static void main(String[] args) {
		
		System.out.println("Hello     World");


		System.out.println("Hello     World");
		try{
			myClass myclassobject1=new myClass();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
		//myClass myclassobject2=myclassobject1;
		myClass myclassobject2=new myClass();
		HashMap<String,Integer> dir= new HashMap<String,Integer>();
		dir.put("Test",12333);
		dir.put("Test",11199);
		System.out.println(dir.get("Test"));
		System.out.println(dir);
		PackagePrivate test= new PackagePrivate();
		try{
		Test t=new Test();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	
	}

}
class TestPr {

	public TestPr() {
		// TODO Auto-generated constructor stub
	}
 }
