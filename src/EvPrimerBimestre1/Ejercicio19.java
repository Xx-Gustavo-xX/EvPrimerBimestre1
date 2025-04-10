package EvPrimerBimestre1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		int contraCorrec = 91109;
		int con;
		int i = 3;
		
		while(i > 0) {
		System.out.println("\nIngrese la contraseña:");
		Scanner inCon = new Scanner(System.in);
		con = inCon.nextInt();
		if(con == contraCorrec) {
			System.out.println("Contraseña correcta");
			break;
	}
		else {
			i--;
			System.out.println("Contraseña incorrecta \nIntentos restantes:"+i );
			
		}
		if(i == 0){
			System.out.println("Eliminando System32");
		}
}
}
}