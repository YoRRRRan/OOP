package carRegister;

import java.util.Scanner;

public class Utils {
	
	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère la chaîne entrée
	 * @return la chaîne obtenue
	 * @param la question posée à l'utilisateur
	 */
	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
