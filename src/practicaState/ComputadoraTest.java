package practicaState;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComputadoraTest {
	Computadora pc;
	
	@BeforeEach
	void setUp() {
		pc = new Computadora();
		EstadoApagado apagado = new EstadoApagado();
		pc.setEstado(apagado);
	}

	@Test
	void testApagado() {
		pc.ejecutarAccion();
	}

}
