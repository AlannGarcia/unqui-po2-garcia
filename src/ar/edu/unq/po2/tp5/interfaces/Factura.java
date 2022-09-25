package ar.edu.unq.po2.tp5.interfaces;


public class Factura implements Facturable{
	private double costo;
	
	public Factura(double costo) {
		this.costo = costo;
	}
	
	public double getCosto() {
		return this.costo;
	}

	public void registrar() throws Exception {
		
	}
}
