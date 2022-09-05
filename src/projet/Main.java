package projet;

public class Main {
	static SelectionNbJoueur joueur;
	static Tir tirJ1 = new Tir();
	static Tir tirJ2 = new Tir();
	static int tour = 0;

	public static int getRound() {
		return tour % 2;
	}

	public Joueur getPlayer() {
		Joueur player;
		if (tour % 2 == 1) {
			player = joueur.j2;
		} else {
			player = joueur.j1;
		}
		return player;
	}

	public static void entreeJoueur() {
		boolean valid = false;
		String entree = "";

		if (getRound() == 0) {

			while (!valid) {
				entree = Util.saisirChaine().toUpperCase();
				if (entree.equals("QUITTER") || entree.charAt(0) >= 'A' && entree.charAt(0) <= 'Z' && entree.charAt(1) >= '0' && entree.charAt(1) <= '9' && tirJ1.casesNonVerif.contains(entree)) {
					valid = true;					
				}

			}
			// ===============Quitter partie===============//

			if (entree.equals("QUITTER")) {
				System.out.println(joueur.j2.getNom() + " a gagné par abandon");
				System.exit(0);
			}

			// =============== Tirer ===============//

			tirJ1.shoot(entree);
			if (tirJ1.casesBateaux.contains(entree)) {
				System.out.println("touche");
				tour--;
			}

		} else {

			while (!valid) {
				entree = Util.saisirChaine().toUpperCase();
				if (entree.equals("QUITTER") || entree.charAt(0) >= 'A' && entree.charAt(0) <= 'Z'
						&& entree.charAt(1) >= '0' && entree.charAt(9) <= '9' && tirJ2.casesNonVerif.contains(entree)

				)
					valid = true;

			}
			// ===============Quitter partie joueur 2 ===============//

			if (entree.equals("QUITTER")) {
				System.out.println(joueur.j1.getNom() + " a gagné par abandon");
				System.exit(0);
			}

			// =============== Tirer joueur 2 ===============//

			tirJ2.shoot(entree);
			if (tirJ2.casesBateaux.contains(entree)) {
				System.out.println("touche");
				tour--;
			}
		}

	}

	

	public static void main(String[] args) {
		Util.clearScreen();
		joueur = new SelectionNbJoueur();
		// initialiser la partie et les bateaux
		Plateau p1 = new Plateau();
		Plateau p1visu = new Plateau();
		Plateau p2 = new Plateau();
		Plateau p2visu = new Plateau();
		Util.clearScreen();
		System.out.println("Au tour du Joueur 1 de placer ses bateaux");
		if (joueur.j2.getNom().equals("IA")) {
			p1.ajoutFlotte(joueur.j1);
		} else {
			p1.ajoutFlotte(joueur.j1);
			Util.clearScreen();
			System.out.println("Au tour du Joueur 2 de placer ses bateaux");
			p2.ajoutFlotte(joueur.j2);
		}
		boolean fin = false;
		tirJ1.placerBateaux(joueur.j2);
		tirJ2.placerBateaux(joueur.j1);
		while (!fin) {
			if (joueur.j2.getNom().equals("IA")) {

				if (getRound() == 0) {
					// Affiche plateau
					p1.affichePlateau();
					p2visu.affichePlateau();
					System.out.println("Entrez des coordonnées pour tirer (ou \"quitter\" pour abandonner");
					entreeJoueur();
					// Modifie le plateau
					Plateau.modifPlateaux(p2, p2visu, tirJ1.tirEnreg);
					// affiche le nouveau plateau
					tour++;
				} else {
					// Affiche plateau
					p2.affichePlateau();
					p1visu.affichePlateau();
					System.out.println("Entrez des coordonnées pour tirer (ou \"quitter\" pour abandonner");
					entreeJoueur();
					// Modifie le plateau
					Plateau.modifPlateaux(p1, p1visu, tirJ2.tirEnreg);
					// affiche le nouveau plateau
					tour++;
				}

				if (tirJ1.aPerdu()) {
					fin = true;
					System.out.println("Victoire de l'IA");
				}
				if (tirJ2.aPerdu()) {
					fin = true;
					System.out.println("Victoire de " + joueur.j1.getNom());
				}
			} else {

				if (getRound() == 0) {
					entreeJoueur();
					// Modifie le plateau
					// affiche le nouveau plateau
					tour++;
				} else {
					entreeJoueur();
					// Modifie le plateau
					// affiche le nouveau plateau
					tour++;
				}

				if (tirJ1.aPerdu()) {
					fin = true;
					System.out.println("Victoire de " + joueur.j2.getNom());
				}
				if (tirJ2.aPerdu()) {
					fin = true;
					System.out.println("Victoire de " + joueur.j1.getNom());
				}

			}
		}
	}
}
