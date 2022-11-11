package practicaComposite;

import java.util.ArrayList;

public class Proyecto implements ItemProyecto{
	private String nombre;
	private ArrayList<ItemProyecto> itemsProyectos = new ArrayList<ItemProyecto>();
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarItemAProyecto(ItemProyecto itm) {
		if(itemsProyectos.contains(itm)) {
			itemsProyectos.add(itm);
		}
	}
	
	@Override
	public void imprimir() {
		System.out.println(this.getNombre());
		itemsProyectos.stream().forEach(i -> i.imprimir());
	}
}
