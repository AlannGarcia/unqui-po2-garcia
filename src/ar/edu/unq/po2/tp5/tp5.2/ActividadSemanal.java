package tp6;


public class ActividadSemanal {
	private DiaDeLaSemana dia;
	private int horaInicio;
	private int duracion;
	private Deporte deporte;

	public ActividadSemanal(DiaDeLaSemana dia, int horaInicio, int duracion, Deporte deporte) {
		this.setDia(dia);
		this.setHoraInicio(horaInicio);
		this.setDuracion(duracion);
		this.setDeporte(deporte);
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public int costoActividadSemanal() {
		return this.precioPorHora() + this.precioPorComplejidad();
	}
	
	public int precioPorHora() {
		if(entreLunesYMiercoles()) {
			return this.getDuracion() * 500;
		}
		else {
			return this.getDuracion() * 1000;
		}
	}
	
	public boolean entreLunesYMiercoles() {
		return (
				dia == DiaDeLaSemana.Lunes
				|| dia == DiaDeLaSemana.Martes 
				|| dia == DiaDeLaSemana.Miercoles);
	}
	
	public int precioPorComplejidad() {
		return 200 * this.getDeporte().getComplejidad();
	}
	
	public boolean tipoDeDeporte(Deporte deporte) {
		return this.getDeporte() == deporte;
	}
	
	public boolean tipoDeComplejidad(int numero) {
		return this.getDeporte().getComplejidad() == numero;
	}
	
	
}
