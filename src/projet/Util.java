package projet;
import java.util.Scanner;
public class Util {
	private char PositionTirIA;
	
	public static final Scanner scannerClavier = new Scanner(System.in);

	public static String saisirChaine() {
        String nom;
        while(true){
            nom = scannerClavier.nextLine();
            if(nom.length()>0)
                return nom;
        }
    }
	public static void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
//		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
}