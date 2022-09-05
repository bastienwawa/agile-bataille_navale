package projet;

import java.util.ArrayList;
import java.util.Random;

public class IA extends Joueur {

	public ArrayList<Bateau> bateaux = new ArrayList<>();

	public IA() {
		super("IA");
		// TODO Auto-generated constructor stub
	}

	public String tir() {
		Random random = new Random();
		int nb = random.nextInt(10);
		char x = (char) (nb + 97);
		return "" + x + nb;
	}

	public String rota() {
		Random rand = new Random();
		int nb = rand.nextInt(2);
		if(nb == 0) {
			return "v";
		}
		return "h";
	}
	
	
	
	public void randBoat(Plateau IA) {
		// (String rota, String coord, Bateau bat, Joueur joueur)
		boolean place = false;
		while(!place) {
			place = IA.placeBateau(rota(), tir(), (new Bateau(5)), (Joueur)this);
		}
		place = false;
		while(!place) {
			place = IA.placeBateau(rota(), tir(), (new Bateau(4)), (Joueur)this);
		}
		place = false;
		while(!place) {
			place = IA.placeBateau(rota(), tir(), (new Bateau(3)), (Joueur)this);
		}
		place = false;
		while(!place) {
			place = IA.placeBateau(rota(), tir(), (new Bateau(3)), (Joueur)this);
		}
		place = false;
		while(!place) {
			place = IA.placeBateau(rota(), tir(), (new Bateau(2)), (Joueur)this);
		}
	}
}