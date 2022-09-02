package projet;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectionNbJoueur();
		for(int i = 0; i < 20; i++) System.out.println();
		System.out.println();
		PorteAvion pa = new PorteAvion();
		System.out.println(pa.toString());
		System.out.println();
		Plateau plateauJ1 = new Plateau();
		plateauJ1.affichePlateau();
		
		plateauJ1.ajouteBateau();
		
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau();
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau();
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau();
		plateauJ1.affichePlateau();
		
	}
	
}