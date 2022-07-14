package com.syntax.class13;

public class Stringdemo1 {

	public static void main(String[] args) {
		
		String str="Batch 13 is good not great";
		System.out.println(str.replace("good", "great")); // to replace
		System.out.println(str.replace("g","G"));
		System.out.println(str.replaceFirst("g","G"));
	}

}
