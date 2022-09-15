package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class EquipoDeTrabajo {
	public static void main(String[] args) {
		Persona persona1 = new Persona("a", "b", 20);
		Persona persona2 = new Persona("c", "d", 28);
		Persona persona3 = new Persona("e", "f", 31);
		Persona persona4 = new Persona("g", "h", 29);
		Persona persona5 = new Persona("i", "j", 43);
		
		ArrayList<Persona> integrantes = new ArrayList<>();
		EquipoDeTrabajo equipo1 = new EquipoDeTrabajo("equipo", integrantes);
		
		equipo1.ingresarAEquipo(persona1);
		equipo1.ingresarAEquipo(persona2);
		equipo1.ingresarAEquipo(persona3);
		equipo1.ingresarAEquipo(persona4);
		equipo1.ingresarAEquipo(persona5);
		
		System.out.println(equipo1.promedioEdad());
	}
	
	
	String nombre;
	ArrayList <Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public int promedioEdad() {
		int sumaEdades = 0;
		for(Persona persona: integrantes) {
			sumaEdades = sumaEdades + persona.edad;
		}
		int resultado = sumaEdades / integrantes.size();
		return (resultado);
	}

	public void ingresarAEquipo(Persona p) {
        this.getIntegrantes().add(p);
	}
}