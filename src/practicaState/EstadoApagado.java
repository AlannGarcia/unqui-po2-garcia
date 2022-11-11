package practicaState;

public class EstadoApagado extends Estado {
	
	@Override
	public void ejecutarAccion() {
		System.out.println("Computadora apagada");
	}
	
}
