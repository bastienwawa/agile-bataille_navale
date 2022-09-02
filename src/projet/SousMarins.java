package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class SousMarins extends Bateau {
	
	public SousMarins(int taille, String name){
		super(taille, name);
		this.coordonnees = new ArrayList<String>(Arrays.asList(new String[taille]));
		this.nombre = 2;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s + "SousMarins";
	}
}
