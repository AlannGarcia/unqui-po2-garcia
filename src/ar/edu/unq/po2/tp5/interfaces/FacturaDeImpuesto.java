package ar.edu.unq.po2.tp5.interfaces;


public class FacturaDeImpuesto extends Factura {
	private double tasaDeServicio;
	
	public FacturaDeImpuesto(double costo, double tasaDeServicio) {
		super(costo);
		this.tasaDeServicio = tasaDeServicio;
	}
	
	@Override
	public double getCosto() {
		return super.getCosto() + (this.getTasaDeServicio());
	}

	private double getTasaDeServicio() {
		return this.tasaDeServicio;
	}
}
