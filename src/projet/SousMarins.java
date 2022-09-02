package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class SousMarins extends Bateau {
	private static final int TAILLE = 3;
	
	public SousMarins(int taille, String name){
		super(SousMarins.TAILLE);
		this.coordonnees = new ArrayList<String>(Arrays.asList(new String[taille]));
		this.nombre = 2;
	}
	
	public int getTaille() {
		return SousMarins.TAILLE;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s + "SousMarins";
	}
}
