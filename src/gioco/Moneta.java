package gioco;

import java.util.Random;

public class Moneta extends Gioco {
	public String lancio() {
		Random rand = new Random();
		boolean risultato = rand.nextBoolean();
		return "Moneta -> " + (risultato ? "testa" : "croce");
	}
}
