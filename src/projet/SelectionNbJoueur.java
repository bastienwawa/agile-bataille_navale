package projet;

import java.util.Scanner;

public class SelectionNbJoueur{
	int nbJoueurs;
	
	public SelectionNbJoueur() {
		boolean jSelection = false;
		
		while(!jSelection) {
			try {
				System.out.println("Selectionnez le Nombre de Joueurs :");
				System.out.println("- 1 Joueur");
				System.out.println("- 2 Joueurs");
				Scanner sc=new Scanner(System.in);
				this.nbJoueur(sc);
				jSelection = true;
			}catch(EntreeInvalide e) {
				System.out.println(e);
			}
		}
		
	}
	public void nbJoueur(Scanner sc) throws EntreeInvalide{
		
		String nbJoueur = sc.nextLine();
		
		if(nbJoueur.equals("1")) {
			System.out.println("1 joueur selectionner");
			this.nbJoueurs = 1;
		}
		
		else if(nbJoueur.equals("2")) {
			System.out.println("2 joueurs selectionner");
			this.nbJoueurs = 2;
		}
		
		else {
			throw new EntreeInvalide();
		}
		
	}
}
