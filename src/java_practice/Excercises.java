package java_practice;

import java.util.Scanner;

public class Excercises {

	static Scanner input = new Scanner(System.in);

	// Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi
	// divisori, contandoli.
	public static void divisori() {

		System.out.print("Inserisci un numero intero positivo: ");
		int numero = input.nextInt();
		int contatore = 0;
		System.out.print("I divisori di " + numero + " sono: ");
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contatore++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nIl numero " + numero + " ha " + contatore + " divisori.");
	}

	// Calcola i numeri primi compresi tra due numeri interi inseriti dall'utente.
	public static void primi() {
		System.out.print("Inserisci il primo numero intero: ");
		int numero1 = input.nextInt();

		System.out.print("Inserisci il secondo numero intero: ");
		int numero2 = input.nextInt();

		System.out.println("I numeri primi compresi tra " + numero1 + " e " + numero2 + " sono:");
		for (int i = numero1; i <= numero2; i++) {
			if (isPrimo(i)) {
				System.out.print(i + " ");
			}
		}

	}

	private static boolean isPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Inserire una serie di numeri interi positivi da tastiera ed individuare il
	// massimo e il minimo;
	// la serie in ingresso deve essere terminata dal numero 0.
	public static void minAndMax() {
		int numero;
		int minimo = Integer.MAX_VALUE;
		int massimo = Integer.MIN_VALUE;

		do {
			System.out.print("Inserisci un numero intero positivo (0 per terminare): ");
			numero = input.nextInt();

			if (numero != 0) {
				if (numero < minimo) {
					minimo = numero;
				}
				if (numero > massimo) {
					massimo = numero;
				}
			}
		} while (numero != 0);

		System.out.println("Il numero minimo inserito è: " + minimo);
		System.out.println("Il numero massimo inserito è: " + massimo);
	}

	// Scrivere un programma che inseriti i lati di un ipotetico triangolo, dica se
	// tale triangolo esiste.
	// (un triangolo è fattibile se ogni lato è minore della somma degli altri due)
	public static void triangle() {
		System.out.print("Inserisci il lato A del triangolo: ");
		double latoA = input.nextDouble();

		System.out.print("Inserisci il lato B del triangolo: ");
		double latoB = input.nextDouble();

		System.out.print("Inserisci il lato C del triangolo: ");
		double latoC = input.nextDouble();

		if (isTriangolo(latoA, latoB, latoC)) {
			System.out.println("Il triangolo esiste.");
		} else {
			System.out.println("Il triangolo non esiste.");
		}
	}

	// Metodo per verificare se i lati formano un triangolo
	private static boolean isTriangolo(double latoA, double latoB, double latoC) {
		return (latoA < latoB + latoC) && (latoB < latoA + latoC) && (latoC < latoA + latoB);
	}

	// Scrivere un programma che dato un numero, restituisca il suo fattoriale.
	public static void fattoriale() {
		int numero;
		System.out.print("Inserisci un numero intero positivo: ");
		numero = input.nextInt();

		long fattoriale = 1;

		for (int i = 1; i <= numero; i++) {
			fattoriale *= i;
		}

		System.out.println(numero + "! = " + fattoriale);
	}

	// Scrivere il programma del fattoriale con un metodo ricorsivo.
	public static void fattorialeRicorsivo() {

		System.out.print("Inserisci un numero intero positivo: ");
		int n = input.nextInt();

		if (n < 0) {
			System.out.println("Errore: il numero inserito non è positivo.");
		} else {
			int fatt = calcolaFattoriale(n);
			System.out.println(n + "! = " + fatt);
		}
	}

	// Metodo ricorsivo per il calcolo del fattoriale di un numero intero positivo
	private static int calcolaFattoriale(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * calcolaFattoriale(n - 1);
		}
	}

}
