package ar.edu.unq.po2.tp5.streamsEnum;

public enum Lesion {
	ROJO("Riesgoso", 4), GRIS("Riesgo menor", 3), AMARILLO("Poco riesgo", 2), MIEL("Sin riesgo", 1);
	
	private String descripcion;
	private int nivelRiesgo;
	
	Lesion(String descipcion, int nivelRiesgo){
		this.descripcion = descipcion;
		this.nivelRiesgo = nivelRiesgo;
	}
	
	public String getDescipcion() {
		return this.descripcion;
	}
	
	public int getNivelRiesgo() {
		return this.nivelRiesgo;
	}
	
	Lesion proximoColor() {
		Lesion[] lesiones = Lesion.values();
		int proximoNivel = this.ordinal() + 1;
		
		return proximoNivel >= lesiones.length ? lesiones[0] : lesiones[proximoNivel];
	}
	
	
	

};
