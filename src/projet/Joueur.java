package projet;

import java.util.ArrayList;

public class Joueur {

	private String nom;
	public ArrayList<Bateau> bateaux = new ArrayList<>();

	public Joueur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void addBateau(Bateau bateau) {
		this.bateaux.add(bateau);
	}

	@Override
	public String toString() {
		return "le nom du joueur est : " + this.nom;
	}
}
