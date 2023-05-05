package oggeto_tridimensionali;

public class Parallelepipedo extends OggettoTridimensionale {

	private double lunghezza;
	private double larghezza;

	public Parallelepipedo(double areaBase, double altezza, double lunghezza, double larghezza) {
		super(areaBase, altezza);
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
	}

	public double calcolaVolume() {
		return areaBase * altezza * lunghezza * larghezza;
	}

}
