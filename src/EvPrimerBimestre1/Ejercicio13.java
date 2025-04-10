package EvPrimerBimestre1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		int hora;
		int min;
		int seg;
		
		
		System.out.println("Ingrese una hora");
		Scanner inHora = new Scanner(System.in);
		hora = inHora.nextInt();
		
		
		System.out.println("Ingrese los minutos");
		Scanner inMin = new Scanner(System.in);
		min = inMin.nextInt();
		
		System.out.println("Ingrese los segundos");
		Scanner inSeg = new Scanner(System.in);
		seg = inSeg.nextInt();
		
		
		if(hora > 24 || min > 60 || seg > 60) {
			System.out.println("La haz liado");
			}
		else {
			System.out.println("Se ha ingresado un valor válido");
		}
		}
		
	}
