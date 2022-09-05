package projet;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++) System.out.println();
		SelectionNbJoueur j = new SelectionNbJoueur();
		for(int i = 0; i < 50; i++) System.out.println();
		Plateau plateauJ1 = new Plateau();
		for(int i = 0; i < 50; i++) System.out.println();
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau(j.j1);
		for(int i = 0; i < 50; i++) System.out.println();
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau(j.j1);
		for(int i = 0; i < 50; i++) System.out.println();
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau(j.j1);
		for(int i = 0; i < 50; i++) System.out.println();
		plateauJ1.affichePlateau();
		plateauJ1.ajouteBateau(j.j1);
		for(int i = 0; i < 50; i++) System.out.println();
		plateauJ1.affichePlateau();
		
	}
	
}