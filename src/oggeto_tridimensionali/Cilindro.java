package oggeto_tridimensionali;

public class Cilindro extends OggettoTridimensionale {

	private double raggio;

	public Cilindro(double areaBase, double altezza, double raggio) {
		super(areaBase, altezza);
		this.raggio = raggio;
	}

	public double calcolaVolume() {
		return areaBase * altezza * raggio * raggio * Math.PI;
	}
}
