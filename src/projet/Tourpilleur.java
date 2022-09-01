package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class Tourpilleur extends Bateau {
	
	public Tourpilleur(int taille, String name) {
		super(taille, name);
		// TODO Auto-generated constructor stub
		this.coordonnees = new ArrayList<String>(Arrays.asList(new String[taille]));
		this.nombre = 1;
	}
}
