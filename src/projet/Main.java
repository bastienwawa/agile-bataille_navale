package projet;


public class Main {
	static SelectionNbJoueur joueur;
	static int tour = 0;
	
	public void partie1joueur() {
		Tir tirJ1 = new Tir (joueur.j1);
		Tir tirIA = new Tir (joueur.j2);
		tirJ1.shoot();
		
	}
	
	public int getRound() {
		return tour%2;
	}
	
	public Joueur getPlayer() {
		Joueur player;
		if(tour%2 == 1) {
			player = joueur.j2;
		}else {
			player = joueur.j1;
		}
		return player;
	}
}