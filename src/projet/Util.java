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
//		for (int i = 0; i < 50; i++) {
//			System.out.println();
//		}
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
	
	public static void title() {
		System.out.println("   _____                   _             _             \n" + 
				"  / ____|                 | |           | |            \n" + 
				" | |      ___   _ __ ___  | |__    __ _ | |_  ___      \n" + 
				" | |     / _ \\ | '_ ` _ \\ | '_ \\  / _` || __|/ __|     \n" + 
				" | |____| (_) || | | | | || |_) || (_| || |_ \\__ \\     \n" + 
				"  \\_____|\\___/ |_| |_| |_||_.__/  \\__,_| \\__||___/     \n" + 
				"                                                       \n" + 
				"                                                       \n" + 
				"  __  __               _  _    _                       \n" + 
				" |  \\/  |             (_)| |  (_)                      \n" + 
				" | \\  / |  __ _  _ __  _ | |_  _  _ __ ___    ___  ___ \n" + 
				" | |\\/| | / _` || '__|| || __|| || '_ ` _ \\  / _ \\/ __|\n" + 
				" | |  | || (_| || |   | || |_ | || | | | | ||  __/\\__ \\\n" + 
				" |_|  |_| \\__,_||_|   |_| \\__||_||_| |_| |_| \\___||___/");

	}
	
}