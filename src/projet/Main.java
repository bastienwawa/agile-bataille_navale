package projet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectionNbJoueur();
		Scanner sc = new Scanner(System.in);
		String nom = sc.nextLine();
		sc.close();
		Joueur test = new Joueur(nom);
		System.out.println(test);
		
		Tourpilleur tourp = new Tourpilleur();
		System.out.println(tourp.getTaille());
		System.out.println(tourp.getNombre());
	}
	
}