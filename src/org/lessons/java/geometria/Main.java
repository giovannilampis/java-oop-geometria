package org.lessons.java.geometria;

import org.lessons.java.geometria.Rettangolo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        // Richiesta all'utente dei valori di base e altezza per i rettangoli
        System.out.println("Inserisci la base del primo rettangolo: ");
        int base1 = scanner.nextInt();
        System.out.println("Inserisci l'altezza del primo rettangolo: ");
        int altezza1 = scanner.nextInt();

        System.out.println("Inserisci la base del secondo rettangolo: ");
        int base2 = scanner.nextInt();
        System.out.println("Inserisci l'altezza del secondo rettangolo: ");
        int altezza2 = scanner.nextInt();

        System.out.println("Inserisci la base del terzo rettangolo: ");
        int base3 = scanner.nextInt();
        System.out.println("Inserisci l'altezza del terzo rettangolo: ");
        int altezza3 = scanner.nextInt();

        // Creazione di tre rettangoli con i valori inseriti dall'utente
        Rettangolo rettangolo1 = new Rettangolo(base1, altezza1);
        Rettangolo rettangolo2 = new Rettangolo(base2, altezza2);
        Rettangolo rettangolo3 = new Rettangolo(base3, altezza3);
        
        scanner.close();
        
        // Stampa a video dei lati, dell'area e del perimetro di ogni rettangolo
     
        System.out.println("Rettangolo 1:");
        System.out.println("Base: " + rettangolo1.base);
        System.out.println("Altezza: " + rettangolo1.altezza);
        System.out.println("Area: " + rettangolo1.calcolaArea());
        System.out.println("Perimetro: " + rettangolo1.calcolaPerimetro());

        System.out.println("Rettangolo 2:");
        System.out.println("Base: " + rettangolo2.base);
        System.out.println("Altezza: " + rettangolo2.altezza);
        System.out.println("Area: " + rettangolo2.calcolaArea());
        System.out.println("Perimetro: " + rettangolo2.calcolaPerimetro());

        System.out.println("Rettangolo 3:");
        System.out.println("Base: " + rettangolo3.base);
        System.out.println("Altezza: " + rettangolo3.altezza);
        System.out.println("Area: " + rettangolo3.calcolaArea());
        System.out.println("Perimetro: " + rettangolo3.calcolaPerimetro());

		

	}
}
