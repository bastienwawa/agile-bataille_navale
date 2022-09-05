package projet;


public class Main {
	static SelectionNbJoueur joueur;
	static Tir tirJ1 = new Tir();
	static Tir tirJ2 = new Tir();
	static int tour = 0;
	
	
	public static int getRound() {
		return tour%2;
	}
	
	public Joueur getPlayer() {
		Joueur player;
		if(tour%2 == 1) {
			player = joueur.j2;
		}else {
			player = joueur.j1;
		}
		return player;
	}
	
	public static void entreeJoueur() {
		boolean valid = false;
		String entree = "";
		
		if(getRound() == 0) {
			
			
			while(!valid) {
				entree = Util.saisirChaine().toUpperCase();
				if(
						entree.equals("QUITTER") &&
						entree.charAt(0) >= 'A' &&
						entree.charAt(0) <= 'Z' &&
						entree.charAt(1) >= '0' &&
						entree.charAt(9) <= '9' &&
						tirJ1.casesNonVerif.contains(entree)
						
						) valid = true;
				
				
			}
			//===============Quitter partie===============//
			
			if(entree.equals("QUITTER")) {
				System.out.println(joueur.j2.getNom() + " a gagné par abandon");
				System.exit(0);
			}
			
			//=============== Tirer ===============//
			
			tirJ1.shoot(entree);
			if(tirJ1.casesBateaux.contains(entree)) {
				System.out.println("touche");
				tour --;
			}
			
		} else {
			
			while(!valid) {
				entree = Util.saisirChaine().toUpperCase();
				if(
						entree.equals("QUITTER") &&
						entree.charAt(0) >= 'A' &&
						entree.charAt(0) <= 'Z' &&
						entree.charAt(1) >= '0' &&
						entree.charAt(9) <= '9' &&
						tirJ2.casesNonVerif.contains(entree)
						
						) valid = true;
				
				
			}
			//===============Quitter partie joueur 2 ===============//
			
			if(entree.equals("QUITTER")) {
				System.out.println(joueur.j1.getNom() + " a gagné par abandon");
				System.exit(0);
			}
			
			//=============== Tirer joueur 2 ===============//
			
			tirJ2.shoot(entree);
			if(tirJ2.casesBateaux.contains(entree)) {
				System.out.println("touche");
				tour --;
			}
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		 joueur = new SelectionNbJoueur();
		 //initialiser la partie et les bateaux
		 boolean fin = false;
		 while(!fin) {
			 if(joueur.j2.getNom().equals("IA")) {

				 if(getRound() == 0 ) {
					 entreeJoueur();
					 //Modifie le plateau
					 //affiche le nouveau plateau
					 tour ++;
				 }else {
					 entreeJoueur();
					 //Modifie le plateau
					 //affiche le nouveau plateau
					 tour ++;
				 }
				 
				if(tirJ1.aPerdu()) {
					fin = true;
					System.out.println("Victoire de l'IA");
				}
				if(tirJ2.aPerdu()) {
					fin = true;
					System.out.println("Victoire de " + joueur.j1.getNom());
				}
			 }
			 else {
				 
				 if(getRound() == 0 ) {
					 entreeJoueur();
					 //Modifie le plateau
					 //affiche le nouveau plateau
					 tour ++;
				 }else {
					 entreeJoueur();
					 //Modifie le plateau
					 //affiche le nouveau plateau
					 tour ++;
				 }
				 
					if(tirJ1.aPerdu()) {
						fin = true;
						System.out.println("Victoire de " + joueur.j2.getNom());
					}
					if(tirJ2.aPerdu()) {
						fin = true;
						System.out.println("Victoire de " + joueur.j1.getNom());
					}
				 
				 
				 
				 
				 
				 
				 
			 }
		 }
	}
}






















