package projet;

import java.util.ArrayList;
import java.util.Arrays;

public class PorteAvion extends Bateau{
	private static final int TAILLE = 5;
	
	public PorteAvion() {
		super(PorteAvion.TAILLE);
		// TODO Auto-generated constructor stub
		this.coordonnees = new ArrayList<String>(Arrays.asList(new String[PorteAvion.TAILLE]));
		this.nombre = 1;
	}
	
	public int getTaille() {
		return PorteAvion.TAILLE;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s + "Porte-Avion";
	}
}
