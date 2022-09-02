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
}