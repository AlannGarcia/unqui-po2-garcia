package practicaComposite;

public class Entregable implements ItemProyecto{
	private String nombre;
	
	public Entregable(String n) {
		this.nombre = n;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Entregable: "+ this.nombre);
	}
}
