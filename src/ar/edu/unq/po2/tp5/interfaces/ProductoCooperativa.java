package ar.edu.unq.po2.tp5.interfaces;


public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(String nombre, double costo, int stock) {
		super(nombre, costo, stock);
	}
	
	@Override
	public double getCosto() {
		return super.getCosto() * 0.9;
	}
}
