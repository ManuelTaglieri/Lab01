package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> parole;
		
	public Parole() {
		this.parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		this.parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return this.parole;
	}
	
	public void reset() {
		this.parole.clear();
	}

}
