package projet;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionNbJoueur joueurs = new SelectionNbJoueur();
		for(int i = 0; i < 20; i++) System.out.println();
		
		if(joueurs.nbJoueurs == 1) {
			System.out.println("Entrez le nom du joueur");
			Scanner sc = new Scanner(System.in);
			String nom = sc.nextLine();
			sc.close();
			Joueur test = new Joueur(nom);
			System.out.println(test);
		} else {
			Scanner sc = new Scanner(System.in);
			String nom = sc.nextLine();
			sc.close();
			Joueur test = new Joueur(nom);
			System.out.println(test);
		}
		System.out.println();
		PorteAvion pa = new PorteAvion();
		System.out.println(pa.toString());
		System.out.println();
		Plateau plateauJ1 = new Plateau();
		plateauJ1.affichePlateau();
		
		
		
	}
	
}