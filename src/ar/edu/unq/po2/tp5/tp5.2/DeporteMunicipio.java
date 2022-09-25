package tp6;

import java.util.ArrayList;
import java.util.List;

public class deporteMunicipio {
	List<ActividadSemanal> listaActividades;
	
	
	public deporteMunicipio() {
		this.setListaActividades(new ArrayList<ActividadSemanal>());
		
	}
	public List<ActividadSemanal> getListaActividades() {
		return listaActividades;
	}

	public void setListaActividades(List<ActividadSemanal> listaActividades) {
		this.listaActividades = listaActividades;
	}
	
	public void agendarActividad(ActividadSemanal actividad) {
		this.getListaActividades().add(actividad);
	}
	
	public List<ActividadSemanal> todasLasActividadesFutbol(){
		return this.getListaActividades().stream().filter(act -> act.tipoDeDeporte(Deporte.FUTBOL)).toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeUnaComplejidad(int numero) {
		return this.getListaActividades().stream().filter(act->act.tipoDeComplejidad(numero)).toList();
	}
	
}
