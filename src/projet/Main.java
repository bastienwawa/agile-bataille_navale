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
				entree = Util.saisirChaine().toLowerCase();
				if (entree.equals("quitter") || tirJ1.casesNonVerif.contains(entree)) {
					valid = true;
				}

			}
			// ===============quitter partie===============//

			if (entree.equals("quitter")) {
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
				entree = Util.saisirChaine().toLowerCase();
				if (entree.equals("quitter") || tirJ2.casesNonVerif.contains(entree)) {
					valid = true;
				}

			}
			// ===============quitter partie joueur 2 ===============//

			if (entree.equals("quitter")) {
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
		Util.title();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
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
			((IA) joueur.j2).randBoat(p2);
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
					Util.clearScreen();
					// Affiche plateau
					System.out.println("Plateau de " + joueur.j1.getNom());
					p1.affichePlateau();
					System.out.println();
					System.out.println("Plateau de " + joueur.j2.getNom() +" visuel");
					p2visu.affichePlateau();
					System.out.println("Au tour de " + joueur.j1.getNom());
					System.out.println("Entrez des coordonnées pour tirer (ou \"quitter\" pour abandonner");
					entreeJoueur();
					// Modifie le plateau
					Plateau.modifPlateaux(p2, p2visu, tirJ1.tirEnreg);
					// affiche le nouveau plateau
					tour++;
				} else {
					Util.clearScreen();
					// Affiche plateau
					System.out.println("Entrez des coordonnées pour tirer (ou \"quitter\" pour abandonner");
					tirJ2.shootIA();
					// Modifie le plateau
					Plateau.modifPlateaux(p1, p1visu, tirJ2.tirEnreg);
					// affiche le nouveau plateau
					tour++;
				}

				if (p1.aPerduPlat()) {
					Util.clearScreen();
					fin = true;
					System.out.println("Victoire de l'IA");
				}
				if (p2.aPerduPlat()) {
					Util.clearScreen();
					fin = true;
					System.out.println("Victoire de " + joueur.j1.getNom());
				}
			} else {

				if (getRound() == 0) {
					Util.clearScreen();
					// Affiche plateau
					System.out.println("Plateau de " + joueur.j1.getNom());
					p1.affichePlateau();
					System.out.println();
					System.out.println("Plateau de " + joueur.j2.getNom() +" visuel");
					p2visu.affichePlateau();
					System.out.println("Au tour de " + joueur.j1.getNom());
					System.out.println("Entrez des coordonnées pour tirer (ou \"quitter\" pour abandonner");
					entreeJoueur();
					// Modifie le plateau
					Plateau.modifPlateaux(p2, p2visu, tirJ1.tirEnreg);
					// affiche le nouveau plateau
					tour++;
				} else {
					Util.clearScreen();
					// Affiche plateau
					System.out.println("Plateau de " + joueur.j2.getNom());
					p2.affichePlateau();
					System.out.println();
					System.out.println("Plateau de " + joueur.j1.getNom() +" visuel");
					p1visu.affichePlateau();
					System.out.println("Au tour de " + joueur.j2.getNom());
					System.out.println("Entrez des coordonnées pour tirer (ou \"quitter\" pour abandonner");
					entreeJoueur();
					// Modifie le plateau
					Plateau.modifPlateaux(p1, p1visu, tirJ2.tirEnreg);
					// affiche le nouveau plateau
					tour++;
				}

				if (p1.aPerduPlat()) {
					Util.clearScreen();
					fin = true;
					System.out.println("Victoire de " + joueur.j2.getNom());
				}
				if (p2.aPerduPlat()) {
					Util.clearScreen();
					fin = true;
					System.out.println("Victoire de " + joueur.j1.getNom());
				}

			}
		}
	}
}
