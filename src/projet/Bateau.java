package projet;

import java.util.ArrayList;

public class Bateau {
	protected ArrayList<String> coordonnees = new ArrayList<String>();
	final char[] hori;
	final int[] verti;
	protected int taille;
	public int nombre;
	
	public Bateau(int taille) {
		this.taille = taille;
		this.hori = new char[11-taille];
		this.verti = new int[11-taille];
		for(int i = 0; i < hori.length;i++) {
			hori[i] = (char)(i+97);
		}
		for(int i = 0; i < verti.length;i++) {
			verti[i] = i;
		}
		
	}
	
	public void setCoordonnees(ArrayList<String> coordonnees) {
		this.coordonnees = coordonnees;
	}
	/**
	 * @return the coordonnees
	 */
	public ArrayList<String> getCoordonnees() {
		return coordonnees;
	}
	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}
	
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "C'est un Bateau - type : ";
	}
}
