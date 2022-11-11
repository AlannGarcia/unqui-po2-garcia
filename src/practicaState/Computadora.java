package practicaState;

public class Computadora {
	Estado estado;
	String marca;
	
	public void setEstado(Estado e) {
		this.estado = e;
	}
	
	public void ejecutarAccion() {
		estado.ejecutarAccion();
	}
}
