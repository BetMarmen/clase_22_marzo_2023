package contador_palabras;

import java.util.Scanner;
import java.util.StringTokenizer;

public class palabras_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word;
		System.out.println("Ingrese una palabra");
		word = scan.nextLine();
		StringTokenizer a = new StringTokenizer(word);
		System.out.println("El numero de la palabra(s) es: "+a.countTokens());
		//libreria StringTokenizer y ese metoodo devuelven el num de toque
		
	}

}
