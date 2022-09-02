package projet;

import java.util.ArrayList;

public class Bateau {
	protected ArrayList<String> coordonnees = new ArrayList<String>();
	public char rotation;
	final char[] hori;
	final int[] verti;
	protected int taille;

	public Bateau(int taille) {
		this.taille = taille;
		this.hori = new char[11 - taille];
		this.verti = new int[11 - taille];
		for (int i = 0; i < hori.length; i++) {
			hori[i] = (char) (i + 97);
		}
		for (int i = 0; i < verti.length; i++) {
			verti[i] = i;
		}

	}

	public void setCoordonnees(String coord, char rotation) {
		this.rotation = rotation;

		this.coordonnees.add(coord);
		if (this.rotation == 'h') {
			for (int i = 0; i < taille; i++) {
				String c = "" + (char)(coord.charAt(0) + i) + coord.charAt(1);
				this.coordonnees.add(c);
			}
		} else if (this.rotation == 'v') {
			for (int i = 0; i < taille; i++) {
				String c = "" + (char)(coord.charAt(0)) + (coord.charAt(1) + i);
				this.coordonnees.add(c);
			}
			System.out.println(this.coordonnees);
		}
//		
//		System.out.println(this.coordonnees);
		
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

	public String toString() {
		return "C'est un Bateau - type : ";
	}
}
