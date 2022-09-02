package projet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selectionnez le nombre de joueurs  : (tapez 1 ou 2) \n- 1 Joueur \n- 2 Joueurs");
		SelectionNbJoueur test = new SelectionNbJoueur();
		Tourpilleur tourp = new Tourpilleur();
		System.out.println(tourp.getTaille());
		System.out.println(tourp.getNombre());
		boolean partie=false;
		while(!partie) {
			test.j2.perdBateaux();
			System.out.println(test.j2.getNbBateauxEnVie());
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
	
}