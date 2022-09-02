package projet;

import java.util.ArrayList;

public abstract class Bateau {
	protected ArrayList<String> coordonnees = new ArrayList<String>();
	protected int taille;
	public int nombre;
	
	public Bateau(int taille) {
		this.taille = taille;
	}
	
	public void setCoordonnees(ArrayList<String> coordonnees) {
		this.coordonnees = coordonnees;
	}
	public void setTaille(int taille) {
		this.taille = taille;
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
