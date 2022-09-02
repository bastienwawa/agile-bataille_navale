package projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Plateau {
	private static int taille = 10;
	private	char[][] plateau;

	Plateau(){
		char[][] plat = new char[taille][taille];
		for(int i = 0; i < taille; i++) {
			for(int j = 0; j < taille; j++) {
				plat[i][j] = '□';
			}
		}
		this.plateau = plat;
	}

	// ■ □ ◈ ◇

	public void affichePlateau() {
		System.out.print("  ");
		for(int l = 0; l < taille; l++) {
			System.out.print((char) (l + 97) + " ");
		}
		System.out.println();
		for(int i = 0; i < taille; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < taille; j++) {
				System.out.print(this.plateau[i][j] + " ");
			}
			System.out.println();
		}
	}

//	public void ajouteBateau() {
//		System.out.println("Sélectionait un bateau a placer");
//		System.out.println("a) ■ ■ ■ ■ ■   b) ■ ■ ■ ■   c) ■ ■ ■   d) ■ ■");
//		Scanner sc = new Scanner(System.in);
//		String lettre = sc.nextLine();
//		sc.close();
//		if(lettre.equals("a")) {
//			PorteAvion bat = new PorteAvion();
//		} else if(lettre.equals("b")) {
//			Croiseur bat = new Croiseur();
//		} else if(lettre.equals("c")) {
//			SousMarins bat = new SousMarins();
//		} else if(lettre.equals("d")) {
//			Tourpilleur bat = new Tourpilleur();
//		}
//		String rep = "";
//		while(!rep.equals("h") || !rep.equals("v")) {
//			System.out.println("Bateau à l'horizontale ou vérticale ? (h ou v)");
//			Scanner sc0 = new Scanner(System.in);
//			rep = sc.nextLine();
//			sc.close();
//		}
//		boolean end = true;
//		while(end) {
//			Scanner sc1 = new Scanner(System.in);
//			String coord = sc.nextLine();
//			sc.close();
//			if(rep.equals("h")) {
//				for(char e: bat.hori) {
//					
//				}
//			}
//		}
//	}
}
