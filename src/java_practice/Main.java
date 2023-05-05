package java_practice;

import fibonacci.Fibonacci;
import gioco.Dado;
import gioco.Gioco;
import gioco.Moneta;
import oggeto_tridimensionali.OggettoTridimensionale;

public class Main {

	public static void main(String[] args) {

//		OggettoTridimensionale.calcoloNuovo();

//		Gioco gioco1 = new Dado(6);
//		Gioco gioco2 = new Moneta();
//		System.out.println(gioco1.lancio());
//		System.out.println(gioco2.lancio());

		// Fibonacci
		System.out.println("Computing...");

		long startTime1 = System.nanoTime();

		System.out.println(Fibonacci.calculateNormal(50));

		long endTime1 = System.nanoTime();
		long elapsedTime1 = endTime1 - startTime1;
		double seconds1 = (double) elapsedTime1 / 1_000_000_000.0;
		System.out.println("Elapsed Time: " + seconds1 + " seconds for normal");

		long startTime2 = System.nanoTime();

		System.out.println(Fibonacci.calculateDP(50));

		long endTime2 = System.nanoTime();
		long elapsedTime2 = endTime2 - startTime2;
		double seconds2 = (double) elapsedTime2 / 1_000_000_000.0;
		System.out.println("Elapsed Time: " + seconds2 + " seconds for DP");

	}

}
