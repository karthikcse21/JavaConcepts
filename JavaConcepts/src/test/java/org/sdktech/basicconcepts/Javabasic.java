package org.sdktech.basicconcepts;

public class Javabasic {
	
	public void printdiff()
	{
		System.out.println("I am smart");
		System.out.println("I am smart");
		System.out.print("I am smart");
		System.out.print("I am smart");
		
	}
	public void numberprint() {
		System.out.println(3);
	}
	public void printcalculation() {
		System.out.println(3+3);
	}

	public static void main(String args[]) {
		
		Javabasic obj=new Javabasic();
		obj.numberprint();
		obj.printcalculation();
		obj.printdiff();
	}

}
