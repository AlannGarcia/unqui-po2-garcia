package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	ArrayList<Integer> counter;

	public ArrayList<Integer> getCounter() {
		return counter;
	}

	public void setCounter(ArrayList<Integer> counter) {
		this.counter = counter;
	}
	
	public void addNumber(Integer x) {
		this.getCounter().add(x);
	}
	
	public int cantPares() {
		int contador = 0;
		for(Integer integer: counter) {
			if (integer % 2 == 0) {
				contador ++;
			}
		}
		return(contador);
	}
	
	public int cantImpares() {
		int contador = 0;
		for(Integer integer: counter) {
			if (integer % 2 != 0) {
				contador ++;
			}
		}
		return(contador);
	}
	
}
