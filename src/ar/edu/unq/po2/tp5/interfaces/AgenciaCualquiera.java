package ar.edu.unq.po2.tp5.interfaces;


public class AgenciaCualquiera implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.print("Costo: " + factura.getCosto());
	}

}
