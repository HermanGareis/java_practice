package gioco;

import java.util.Random;

public class Dado extends Gioco {
	private int numFacce;

	public Dado(int numFacce) {
		this.numFacce = numFacce;
	}

	public String lancio() {
		Random rand = new Random();
		int risultato = rand.nextInt(numFacce) + 1;
		return "Dado (" + numFacce + " facce) -> " + risultato;
	}
}
