package ar.edu.unq.po2.tp5.interfaces;


public class CajaDeMercado {
	private double montoTotal;
	
	public CajaDeMercado() {
		montoTotal = 0;
	}
	
	public double getMontoTotal() {
		return montoTotal;
	}
	
	private void setMontoTotal(double unNumero) {
		this.montoTotal = unNumero;
	}
	
	private void aumentarMonto(double unNumero) {
		this.setMontoTotal(this.getMontoTotal() + unNumero);
	}
	
	public void registrarPago(Facturable facturable) throws Exception {
		facturable.registrar();	
		this.aumentarMonto(facturable.getCosto());
	}
}
