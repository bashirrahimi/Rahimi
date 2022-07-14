package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		
		int time=10;
		
		if (time<12) {
			System.out.println("Morning");
			
			while(time<12) {
				System.out.println("Morning");
				time++;// to stop
			}
			System.out.println("Hello");
		}
	}

}
