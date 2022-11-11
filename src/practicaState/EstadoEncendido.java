package practicaState;

public class EstadoEncendido extends Estado {
	
	@Override
	public void ejecutarAccion() {
		System.out.println("Computadora encendida");
	}
	
}
