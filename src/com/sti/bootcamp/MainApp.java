package com.sti.bootcamp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamal ikan = new Paus();
		
		System.out.println("Ini Data Paus");
		System.out.println("Bernafas");
		ikan.breathe();
		System.out.println("berkembang biak");
		ikan.birth();
		System.out.println("Bejalan");
		ikan.walk();
		System.out.println("***************");
		
		System.out.println("Ini Data Ikan Manusia");
		Mamal manusia = new Human();
		System.out.println("Bernafas");
		manusia.breathe();
		System.out.println("berkembang biak");
		manusia.birth();
		System.out.println("Bejalan");
		manusia.walk();
		System.out.println("***************");
		
		
	}

}
