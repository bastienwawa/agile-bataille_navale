package projet;

import jdk.incubator.vector.VectorOperators.Test;

public class Main {
	static SelectionNbJoueur test = new SelectionNbJoueur();
	static int tour = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selectionnez le nombre de joueurs  : (tapez 1 ou 2) \n- 1 Joueur \n- 2 Joueurs");
		boolean partie=false;
		while(!partie) {
			test.j2.perdBateaux();
			System.out.println(test.j2.getNbBateauxEnVie());
			System.out.println("Tour " + tour++);
			System.out.println("C'est au tour du joueur :" + tour%2);
			if(test.j1.getNbBateauxEnVie()==0) {
				partie=true;
				System.out.println(test.j2.getNom()+" à gagné");
			}
			else if(test.j2.getNbBateauxEnVie()==0) {
				partie=true;
				System.out.println(test.j1.getNom()+" à gagné");
			}
		}
		System.out.println("partie terminé");
	}
	
	public int getRound(int tour) {
		int round = 0;
		if(tour%2==0) {
			round = 1;
		}else {
			round = 2;
		}
		return round;
	}
	public Joueur getPlayer(int round) {
		Joueur player;
		if(round == 1) {
			player = test.j1;
		}else {
			player = test.j2;
		}
		return player;
	}
}