package projet;

import java.util.ArrayList;

public abstract class Bateau {
	protected ArrayList<String> coordonnees = new ArrayList<String>();
	protected int taille;
	protected String name;
	public int nombre;
	
	public Bateau(int taille, String name) {
		this.taille = taille;
		this.name = name;
	}
	
	public void setCoordonnees(ArrayList<String> coordonnees) {
		this.coordonnees = coordonnees;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public void setName(String name) {
		this.name = name;
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
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "C'est un Bateau - type ";
	}
}
