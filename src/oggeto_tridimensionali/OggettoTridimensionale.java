package oggeto_tridimensionali;

import java.util.Scanner;

public abstract class OggettoTridimensionale {

	protected double areaBase;
	protected double altezza;

	public OggettoTridimensionale(double areaBase, double altezza) {
		this.areaBase = areaBase;
		this.altezza = altezza;
	}

	public abstract double calcolaVolume();

	public void stampaVolume() {
		System.out.println("Volume: " + calcolaVolume());
	}

	public static void calcoloNuovo() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci l'area della base: ");
		double areaBase = input.nextDouble();

		System.out.print("Inserisci l'altezza: ");
		double altezza = input.nextDouble();

		System.out.print("Vuoi calcolare il volume di un cilindro o di un parallelepipedo? ");
		String scelta = input.next();

		OggettoTridimensionale oggetto;

		if (scelta.equalsIgnoreCase("cilindro")) {
			System.out.print("Inserisci il raggio: ");
			double raggio = input.nextDouble();
			oggetto = new Cilindro(areaBase, altezza, raggio);
		} else if (scelta.equalsIgnoreCase("parallelepipedo")) {
			System.out.print("Inserisci la lunghezza: ");
			double lunghezza = input.nextDouble();
			System.out.print("Inserisci la larghezza: ");
			double larghezza = input.nextDouble();
			oggetto = new Parallelepipedo(areaBase, altezza, lunghezza, larghezza);
		} else {
			System.out.println("Scelta non valida.");
			return;
		}

		System.out.println("Il volume del " + scelta + " è: " + oggetto.calcolaVolume());
	}

}
