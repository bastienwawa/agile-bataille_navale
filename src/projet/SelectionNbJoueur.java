package projet;

public class SelectionNbJoueur {
	Joueur j1;
	Joueur j2;

	public SelectionNbJoueur() {
		boolean jSelection = false;

		while (!jSelection) {
			try {
				System.out.println("Quel mode de jeu voulez-vous jouer ?");
				System.out.println("     1 Joueur ou 2 Joueurs");
				String choix = Util.saisirChaine();
				this.nbJoueur(choix);
				jSelection = true;

			} catch (EntreeInvalide e) {
				System.out.println(e);
			}
		}

	}

	public void nbJoueur(String choix) throws EntreeInvalide {

		if (choix.equals("1")) {
			System.out.println("\n1 joueur selectionnée");
			System.out.println("\nJOUEUR 1 : Entrez votre nom");
			getJ1();
			j2 = new IA();

		}

		else if (choix.equals("2")) {
			System.out.println("\n2 joueurs selectionnées");
			System.out.println("\nJOUEUR 1 : Entrez votre nom");
			getJ1();
			System.out.println("\nJOUEUR 2 : Entrez votre nom");
			getJ2();
			System.out.println("\nLes Joueurs sont : \n" + "Joueur 1 : " + j1.getNom() + "\nJoueur 2 : " + j2.getNom());

		}

		else {
			throw new EntreeInvalide();
		}

	}

	public Joueur getJ1() {
		String nom1 = Util.saisirChaine();
		j1 = new Joueur(nom1);
		return j1;
	}

	public Joueur getJ2() {
		String nom2 = Util.saisirChaine();
		j2 = new Joueur(nom2);
		return j2;
	}

}
