package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double lecturaVelocidad = scan.nextDouble();
		
		if((lecturaVelocidad >= 0) && (lecturaVelocidad <= 90)) 
		{
			
			System.out.println("Esta dentro de los limites permitidos");
			
		}else if(lecturaVelocidad > 90){
			System.out.println("Esta fuera de los limites permitidos");
		}else {
			System.out.println("No existen velocidades negativas..");
		}
		
			
			
			
			
			
	}
	
}





