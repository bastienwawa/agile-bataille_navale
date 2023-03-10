package projet;

import java.util.Map;

public class Plateau {
	private static int taille = 10;
	private char[][] plateau;

	Plateau() {
		char[][] plat = new char[taille][taille];
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				plat[i][j] = '□';
			}
		}
		this.plateau = plat;
	}

	// ■ □ ◈ ◇

	public void setPlateau(char[][] plateau) {
		this.plateau = plateau;
	}
	
	public void affichePlateau() {
		System.out.print("  ");
		for (int l = 0; l < taille; l++) {
			System.out.print((char) (l + 97) + " ");
		}
		System.out.println();
		for (int i = 0; i < taille; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < taille; j++) {
				if(this.plateau[i][j] == '■') {
					System.out.print("\u001B[33m" + this.plateau[i][j] + "\u001B[0m ");
				}
				if(this.plateau[i][j] == '□') {
					System.out.print("\u001B[34m" + this.plateau[i][j] + "\u001B[0m ");
				}
				if(this.plateau[i][j] == '◈') {
					System.out.print("\u001B[31m" + this.plateau[i][j] + "\u001B[0m ");
				}
				if(this.plateau[i][j] == '◇') {
					System.out.print("\u001B[32m" + this.plateau[i][j] + "\u001B[0m ");
				}
			}
			System.out.println();
		}
	}
	
//RESET = "\u001B[33m\u001B[0m"
//BLACK = "\u001B[30m"
//RED = "\u001B[31m"
//GREEN = "\u001B[32m"
//YELLOW = "\u001B[33m"
//BLUE = "\u001B[34m"
//PURPLE = "\u001B[35m"
//CYAN = "\u001B[36m"
//WHITE = "\u001B[37m"

	public void ajouteBateau(Joueur joueur) {
		this.affichePlateau();
		System.out.println("Sélectionnez un bateau a placer");
		String lettre = "";
		boolean lettreFind = false;
		while (!lettreFind) {
			System.out.println("a) \u001B[33m■ ■ ■ ■ ■\u001B[0m   b) \u001B[33m■ ■ ■ ■\u001B[0m   c) \u001B[33m■ ■ ■\u001B[0m   d) \u001B[33m■ ■\u001B[0m");
			lettre = Util.saisirChaine();
			if (lettre.equals("a") || lettre.equals("b") || lettre.equals("c") || lettre.equals("d")) {
				lettreFind = true;
			}
		}
		String rota = "";
		boolean rotation = false;
		while (!rotation) {
			System.out.println("Bateau à l'horizontale ou vérticale ? (h ou v)");
			rota = Util.saisirChaine();
			if (rota.equals("h") || rota.equals("v")) {
				rotation = true;
			}
		}
		Bateau bat = null;
		if (lettre.equals("a")) {
			bat = new Bateau(5);
		} else if (lettre.equals("b")) {
			bat = new Bateau(4);
		} else if (lettre.equals("c")) {
			bat = new Bateau(3);
		} else if (lettre.equals("d")) {
			bat = new Bateau(2);
		}
		boolean end = false;

		System.out.println("Entrez une coordonnée : (exemple : \"a1\" ou \"b5\")");
		while (!end) {
			String coord = Util.saisirChaine();
			end = placeBateau(rota, coord, bat, joueur);
		}
	}

	public boolean placeBateau(String rota, String coord, Bateau bat, Joueur joueur) {
		boolean end = false;
		if (rota.equals("h")) {
			for (char e : bat.hori) {
				String e2 = "" + e;
				if (e2.equals((coord.substring(0, 1)))) {
					int e3 = (int) (e - 97);
					boolean superpos = false;
					for (int i = 0; i < bat.taille; i++) {
						String coo = "" + (char) (coord.charAt(0) + i) + Integer.parseInt(coord.substring(1));
						for (Bateau bateau : joueur.bateaux) {
							for (String coordo : bateau.coordonnees) {
								if (coo.equals(coordo)) {
									superpos = true;
								}
							}
						}
					}
					if (superpos == false) {
						for (int i = 0; i < bat.taille; i++) {
							this.plateau[Integer.parseInt(coord.substring(1))][e3 + i] = '■';
							end = true;
						}
						bat.setCoordonnees(coord, rota.charAt(0));
						joueur.addBateau(bat);
					} else {
						System.out.println("Mauvais emplacement, choisissez une nouvelle position");
					}
				}
			}
		} else if (rota.equals("v")) {
			for (int e : bat.verti) {
				if (e == Integer.parseInt(coord.substring(1))) {
					int e3 = coord.charAt(0) - 97;
					boolean superpos = false;
					for (int i = 0; i < bat.taille; i++) {
						String coo = "" + coord.substring(0, 1) + (Integer.parseInt(coord.substring(1)) + i);
						for (Bateau bateau : joueur.bateaux) {
							for (String coordo : bateau.coordonnees) {
								if (coo.equals(coordo)) {
									superpos = true;
								}
							}
						}
					}
					if (superpos == false) {
						for (int i = 0; i < bat.taille; i++) {
							this.plateau[Integer.parseInt(coord.substring(1)) + i][e3] = '■';
							end = true;
						}
						bat.setCoordonnees(coord, rota.charAt(0));
						joueur.addBateau(bat);
					} else {
						System.out.println("Mauvais emplacement, choisissez une nouvelle position");
					}
				}
			}
		}
		return end;
	}

	public void ajoutFlotte(Joueur j) {
		for(int i = 0; i < 5; i++) {
			Util.clearScreen();
			this.ajouteBateau(j);
		}
	}
	
	// ■ □ ◈ ◇

	public void modifPlateau(Map<String, Boolean> map) {
		for (Map.Entry mapentry : map.entrySet()) {
			System.out.println("clé: " + mapentry.getKey() + " | valeur: " + mapentry.getValue());
			if (mapentry.getValue().equals(true)) {
				plateau[Integer.parseInt(mapentry.getKey().toString().substring(1))][mapentry.getKey().toString()
						.charAt(0) - 97] = '◈';
			} else if (mapentry.getValue().equals(false)) {
				plateau[Integer.parseInt(mapentry.getKey().toString().substring(1))][mapentry.getKey().toString()
						.charAt(0) - 97] = '◇';
			}
		}
	}
	
	public boolean aPerduPlat() {
		boolean fin = true;
		for(int i = 0; i < taille; i ++) {
			for(int j = 0; j < taille; j ++) {
				if(this.plateau[i][j] == '■') {
					fin = false;
				}
			}	
		}
		return fin;
	}
	
	public static void modifPlateaux(Plateau p, Plateau q, Map<String, Boolean> map) {
		p.modifPlateau(map);
		q.modifPlateau(map);
	}
}
