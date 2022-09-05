package projet;

import java.util.ArrayList;
import java.util.Random;

public class IA extends Joueur {

	public ArrayList<Bateau> bateaux = new ArrayList<>();

	public IA(String nom) {
		super("IA");
		// TODO Auto-generated constructor stub
	}

	public String tir() {
		Random random = new Random();
		int nb = random.nextInt(10);
		char x = (char) (nb + 97);
		return "" + x + nb;
	}

}