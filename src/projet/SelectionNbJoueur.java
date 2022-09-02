package projet;

import java.util.Scanner;

public class SelectionNbJoueur{
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
		}
		
		else if(nbJoueur.equals("2")) {
			System.out.println("2 joueurs selectionner");
		}
		
		else {
			throw new EntreeInvalide();
		}
		
	}
}
