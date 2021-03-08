package it.polito.tdp.parole.model;

import java.util.*;

public class ParoleArray {

	List<String> parole;
	
	public ParoleArray() {
		this.parole = new ArrayList<String>();
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
	
	public void cancella(String s) {
		this.parole.remove(s);
	}
	
}
