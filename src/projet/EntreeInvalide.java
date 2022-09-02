package projet;

public class EntreeInvalide extends Exception{
	public EntreeInvalide() {
		super("Entrée invalide : 1 ou 2 joueurs seulement");
	}
}
