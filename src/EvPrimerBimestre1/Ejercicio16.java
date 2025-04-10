package EvPrimerBimestre1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		int cafe;
		
		System.out.println("Ingrese el cafe deseado");
		 System.out.println(" 1 = Cafe cortado \n 2 = Cafe Latte \n 3 = Cafe solo \n 4 = Cafe Lagrima \n 5 = Salir del programa");
		Scanner inCafe = new Scanner(System.in);
		cafe = inCafe.nextInt();
		
		switch(cafe) {
		case 1:
			System.out.println("Ten tu cafe cortado");
		break;
		case 2:
			System.out.println("Ten tu cafe Latte");
		break;
		case 3:
			System.out.println("Ten tu cafe Solo");
		break;
		case 4:
			System.out.println("Ten tu cafe Lagrima");
		break;
		case 5:
			System.out.println("saliendo del programa");
		break;
		}
		
		 
		
		
		
		
		
		

	}

}
