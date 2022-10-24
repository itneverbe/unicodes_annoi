/*Ricerca dicotomica */

import java.util.Scanner;
import java.io.*;

public class Dicotomica{
	public static void main (String [] args) {
		
		// variables
		Scanner myObj = new Scanner(System.in);
		int x;
		double ris=0.0;
		int i=0;
		double d=0.0;
		double prec=0.0;
		double y=0.0;
		
		// Input number > 0
		do {
			System.out.println("Inserisci un numero di cui effettuare la radice =");
			x=myObj.nextInt();
		} while(x<0);

		d = (double)x;
		prec = 0.0;
		y = (double)x/2;

		do{
			ris = y*y;
			if(ris>x) {
				d = y;
				y = (prec+d)/2;
			}
			else {
				prec=y;
				y = (d+y)/2;
			}
			i++;
		}while(ris != (x*x) && i<20);

		System.out.println(String.format("%.2f", y));

	}
}
