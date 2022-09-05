package projet;

import java.util.*;

public class Tir {
	Map<String,Boolean> tirEnreg = new HashMap<String,Boolean>();
	ArrayList<String> casesNonVerif = new ArrayList<String>();
	ArrayList<String> casesBateaux = new ArrayList<String>();
	
	public Tir() {
		
		//partie cases non v�rif
		for(int i = 97; i<107; i++) {
			for(int nb = 0; nb<10; nb++) {
				String rep = "" + (char) i + nb;
				casesNonVerif.add(rep);
				rep = "";
			}
		}
				
		
	}
	
	public boolean aPerdu() {
		if (tirEnreg.keySet().contains(casesBateaux)) return true;
		return false;
	}
	
	
	
	public void shoot(String donnees){
		boolean good = false;
		while(!good) {
			if(!(donnees.length() == 2)) {
				System.err.println("Ce n'est pas le bon nombre de caracteres");
			}
			if(this.casesNonVerif.contains(donnees)) {
				this.casesNonVerif.remove(donnees);
				if(this.casesBateaux.contains(donnees)) {
					this.tirEnreg.put(donnees, true);
				}else {
					this.tirEnreg.put(donnees, false);
				}
				System.out.println(tirEnreg);
				good = true;
				System.out.println("Coordonnees rentrees");
			}else {
				System.err.println("Ce n'est pas une coordonnees");
			}
		}
	}
	
	public void placerBateaux(Joueur joueur) {
		for(Bateau enCours:joueur.bateaux) {
			casesBateaux.addAll(enCours.getCoordonnees());
		}
	}
	
	public String tirIA() {
		Random random = new Random();
		int nb = random.nextInt(10);
		char x = (char) (nb + 97);
		return "" + x + nb;
	}
	
	public void shootIA(){
		boolean good = false;
		String donnees = tirIA();
		while(!good) {
			if(!(donnees.length() == 2)) {
				System.err.println("Ce n'est pas le bon nombre de caracteres");
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
				System.err.println("Ce n'est pas une coordonnees");
			}
		}
	}
	
}



//quant tour j1(initialisation) il faut regarder bateaux j2 (prendre toutes ses coord des bateaux de j2 mettre dans tir j1)
//ajout bateau dans arraylist casesbateaux