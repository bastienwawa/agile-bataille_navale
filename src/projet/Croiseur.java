package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class Croiseur extends Bateau{
	private static final int TAILLE = 4;
	
	public Croiseur() {
		super(Croiseur.TAILLE);
		this.coordonnees=new ArrayList<String>(Arrays.asList(new String[Croiseur.TAILLE]));
		this.nombre=1;
	}
	
	public int getTaille() {
		return Croiseur.TAILLE;
	}

	@Override
	public String toString() {
		String s = super.toString();
		return s + "Croiseur";
	}
}
