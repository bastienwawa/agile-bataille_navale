package projet;

import java.util.ArrayList;
import java.util.Random;

public class IA {
	private final String nom = "Ordinateur";
	public ArrayList<Bateau> bateaux = new ArrayList<>();

	public String getNom() {
		return nom;
	}

	public void addBateau(Bateau bateau) {
		this.bateaux.add(bateau);
	}

	@Override
	public String toString() {
		return "Vous jouez contre l'" + this.nom;
	}

	public String tir() {
		Random random = new Random();
		int nb = random.nextInt(10);
		char x = (char) (nb + 97);
		return "" + x + nb;
	}

}