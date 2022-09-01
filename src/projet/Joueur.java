package projet;

public class Joueur {

	private String nom;
	private int nbBateauxEnVie=5;

	public Joueur(String nom){
		this.nom=nom;
	}

	public String getNom(){
		return nom;
	}

	public int getNbBateauxEnVie(){
		return nbBateauxEnVie;
	}

	public void perdBateaux(){
		nbBateauxEnVie--;
	}
	
	@Override
	public String toString() {
				return "le nom du joueur est : "+ this.nom ;
	}
}
