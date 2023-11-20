package org.com;

public class Array {
	public static void main(String[] args) {
		int[][] marks = {{50,56,60,35,42},{60,36,50,85,92},{51,58,68,45}};
//		System.out.println(marks.length);
	   
		for (int exam = 0; exam < marks.length; exam++) {
			
			int total =0;
		for (int sub = 0; sub < marks[exam].length; sub++) {
			System.out.print(marks[exam][sub]+" ");
		    total+=marks[exam][sub];
		}
		    System.out.println();
		    System.out.println(total);
		//    System.out.println();
//			exam++;   
//		}
	}

}}
