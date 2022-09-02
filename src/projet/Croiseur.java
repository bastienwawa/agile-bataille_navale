package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class Croiseur extends Bateau{
	private static final int TAILLE = 4;
	private final char[] hori = new char[] {'a','b','c','d','e','f','g'};
	private final int[] verti = new int[] {0,1,2,3,4,5,6};
	
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
