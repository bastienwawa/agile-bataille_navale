package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class SousMarins extends Bateau {
	private static final int TAILLE = 3;
	private final char[] hori = new char[] {'a','b','c','d','e','f','g','h'};
	private final int[] verti = new int[] {0,1,2,3,4,5,6,7};
	
	public SousMarins(){
		super(SousMarins.TAILLE);
		this.coordonnees = new ArrayList<String>(Arrays.asList(new String[SousMarins.TAILLE]));
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
