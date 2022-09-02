package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class Croiseur extends Bateau{
	public Croiseur(int taille, String name) {
		super(taille, name);
		this.coordonnees=new ArrayList<String>(Arrays.asList(new String[taille]));
		this.nombre=1;
	}
	
}
