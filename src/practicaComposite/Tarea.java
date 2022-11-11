package practicaComposite;

import java.util.ArrayList;

public class Tarea implements ItemProyecto{
	private String nombre;
	private ArrayList<ItemProyecto> itemsTarea = new ArrayList<ItemProyecto>();
	
	public Tarea(String n) {
		this.nombre = n;
	}
	
	public void agregarTarea(ItemProyecto itp) {
		if(!itemsTarea.contains(itp)) {
			itemsTarea.add(itp);
		}
	}
	
	@Override
	public void imprimir() {
		System.out.println(this.nombre);
		itemsTarea.stream().forEach(i -> i.imprimir());
	}
}
