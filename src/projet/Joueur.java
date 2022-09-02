package projet;

public class Joueur {

	private String nom;

	public Joueur(String nom){
		this.nom=nom;
	}

	public String getNom(){
		return nom;
	}
	@Override
	public String toString() {
		return "le nom du joueur est : "+ this.nom ;
	}
}
