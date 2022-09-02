package projet;

import java.util.*;

public class Tir {
	Map<String,Boolean> tirEnreg = new HashMap<String,Boolean>();
	ArrayList<String> casesNonVerif = new ArrayList<String>();
	ArrayList<String> casesBateaux = new ArrayList<String>();
	
	public void getCoordinateFromPlayer() throws WrongCoordinateException, WrongInputLengthException{
		boolean good = false;
		String donnees;
		while(!good) {
			Scanner coord = new Scanner(System.in);
			System.out.print("Entrer vos coordonnées:");
			donnees = coord.nextLine().toUpperCase();
			coord.close();
			if(!(donnees.length() == 2)) {
				throw new WrongInputLengthException("Ce n'est pas le bon nombre de caractères");
			}
			if(this.casesNonVerif.contains(donnees)) {
				this.casesNonVerif.remove(donnees);
				if(this.casesBateaux.contains(donnees)) {
					this.tirEnreg.put(donnees, true);
				}else {
					this.tirEnreg.put(donnees, false);
				}
				good = true;
				System.out.println("Coordonnées rentrées");
			}else {
				throw new WrongCoordinateException("Ce n'est pas une coordonnées");
			}
		}
	}
}

//quant tour j1(initialisation) il faut regarder bateaux j2 (prendre toutes ses coord des bateaux de j2 mettre dans tir j1)
//ajout bateau dans arraylist casesbateaux