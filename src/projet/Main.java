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
		while(!valid) {
			entree = Util.saisirChaine();
			if(
					entree.equals("quitter") &&
					entree.charAt(0) >= 'A' &&
					entree.charAt(0) <= 'Z' &&
					entree.charAt(1) >= '0' &&
					entree.charAt(9) <= '9' 
					
					) {
				valid = true;
			}
				
		}
		//===============Quitter partie===============//
		
		if(getRound() == 0 && entree.equals("quitter")) {
			System.out.println(joueur.j2.getNom() + " a gagné par abandon");
			System.exit(0);
		}else if(getRound() == 1 && entree.equals("quitter")) {
			System.out.println(joueur.j2.getNom() + " a gagné par abandon");
			System.exit(0);
		}
		
		//=============== Tirer ===============//
	
		if(getRound() == 0) tirJ1.shoot(entree);
		if(getRound() == 1) tirJ2.shoot(entree);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		 joueur = new SelectionNbJoueur();
		 //initialiser la partie et les bateaux
		 boolean fin = false;
		 while(!fin) {
			 if(joueur.j2.getNom().equals("IA")) {
				entreeJoueur();
				//modif du plateau;
				tirJ2.shootIA();
				//modif du plateau;
				tour ++;
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
				 
				 	entreeJoueur();
					//modif du plateau;
					entreeJoueur();
					//modif du plateau;
					tour ++;
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






















