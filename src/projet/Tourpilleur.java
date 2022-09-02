package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class Tourpilleur extends Bateau {
	private static final int TAILLE = 2;
	
	public int getTaille() {return Tourpilleur.TAILLE;}

	public Tourpilleur() {
		super(Tourpilleur.TAILLE);
		// TODO Auto-generated constructor stub
		this.coordonnees = new ArrayList<String>(Arrays.asList(new String[Tourpilleur.TAILLE]));
		this.nombre = 1;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s + "Tourpilleur";
	}
}
