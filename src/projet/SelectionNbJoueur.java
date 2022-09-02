package projet;

import java.util.Scanner;


public class SelectionNbJoueur{
	Joueur j1;
	Joueur j2;
	
	public SelectionNbJoueur() {
		boolean jSelection = false;
		
		
		while(!jSelection) {
			try {

				Scanner sc = new Scanner(System.in);
				String choix = sc.nextLine();
				this.nbJoueur(choix, sc);
				jSelection = true;
				sc.close();
				
			
			}catch(EntreeInvalide e) {
				System.out.println(e);
			}
		}
		
	}
	public void nbJoueur(String choix, Scanner sc) throws EntreeInvalide{
		
		
		if(choix.equals("1")) {
			System.out.println("\n1 joueur selectionnée");
			System.out.println("\nJOUEUR 1 : Entrez votre nom");
			getJ1(sc);
			
			
			
		}
		
		else if(choix.equals("2")) {
			System.out.println("\n2 joueurs selectionnées");
			System.out.println("\nJOUEUR 1 : Entrez votre nom");
			getJ1(sc);
			System.out.println("\nJOUEUR 2 : Entrez votre nom");
			getJ2(sc);
			System.out.println("\nLes Joueurs sont : \n" + "Joueur 1 : " +j1.getNom() + "\nJoueur 2 : " + j2.getNom());
			
		}
		
		else {
			throw new EntreeInvalide();
		}
			
		
	}
	
	public void getJ1(Scanner sc) {
		String nom1 = sc.nextLine();
		j1 = new Joueur(nom1);
		System.out.println(j1);
	}
	
	public void getJ2(Scanner sc) {
		String nom2 = sc.nextLine();
		j2 = new Joueur(nom2);
		System.out.println(j2);
	}
	
	
}
