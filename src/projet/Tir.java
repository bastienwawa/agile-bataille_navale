package projet;

import java.util.*;

public class Tir {
	Map<String,Boolean> tirEnreg = new HashMap<String,Boolean>();
	ArrayList<String> casesNonVerif = new ArrayList<String>();
	ArrayList<String> casesBateaux = new ArrayList<String>();
	
	public Tir(Joueur joueur) {
		
		//partie cases non vérif
		for(int i = 97; i<107; i++) {
			for(int nb = 0; nb<10; nb++) {
				String rep = "" + (char) i + nb;
				casesNonVerif.add(rep);
				rep = "";
			}
		}
				
		//partie casesBateaux
		
		for(Bateau enCours:joueur.bateaux) {
			casesBateaux.addAll(enCours.getCoordonnees());
		}
		
	}
	
//	public void bateauCoule() {
//		switch(Main.getRound()) {
//		case 1:
//			for (String coord:j1.porteAvion)
//			break;
//		case 2:
//			//joueur 2
//			break;
//		}
//		
//	}
	
	public boolean aPerdu() {
		if (tirEnreg.keySet().contains(casesBateaux)) return true;
		return false;
	}
	
	public void getCoordinateFromPlayer() throws WrongCoordinateException, WrongInputLengthException{
		boolean good = false;
		String donnees;
		while(!good) {
			Scanner coord = new Scanner(System.in);
			System.out.print("Entrer vos coordonnees:");
			donnees = coord.nextLine().toUpperCase();
			coord.close();
			if(!(donnees.length() == 2)) {
				throw new WrongInputLengthException("Ce n'est pas le bon nombre de caracteres");
			}
			if(this.casesNonVerif.contains(donnees)) {
				this.casesNonVerif.remove(donnees);
				if(this.casesBateaux.contains(donnees)) {
					this.tirEnreg.put(donnees, true);
				}else {
					this.tirEnreg.put(donnees, false);
				}
				good = true;
				System.out.println("Coordonnees rentrees");
			}else {
				throw new WrongCoordinateException("Ce n'est pas une coordonnees");
			}
		}
	}
}



//quant tour j1(initialisation) il faut regarder bateaux j2 (prendre toutes ses coord des bateaux de j2 mettre dans tir j1)
//ajout bateau dans arraylist casesbateaux