package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String country,language;

		System.out.println("Where are you from?");
		
		language=input.next();
		switch(language) {
		
		case ("afghanistan"):
		language="Dari";
		break;
		
		case ("Uzbekistan"):
			language="Uzbek";
		break;
		
		case("Saudi Arabia"):
			language="arabic";
		break;
		default:
			language="Diffrent language";
		
		}
	
		
		System.out.println("user speaks "+language);
	}	
		
				
	}	
		

	


