package menuOpciones;

import java.util.Scanner;

public class main {
	//Metodos
	public static void Clear () {
		for (int i = 1 ; i<=20 ; i++)
		{
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int op;
		boolean  exit = false;
		while(!exit) {
			System.out.println("1.Opcion Compras");
			System.out.println("2.Opcion ventas");
			System.out.println("3.Opcion catalogos");
			System.out.println("4.Exit");
			System.out.println("Ingrese una opcion");
			op = scan.nextInt();
			Clear ();
			switch(op)
			{
			case 1:
				System.out.println("--------------------------------------------------");
				System.out.println("	Ha ingresado al menu de compras");
				System.out.println("--------------------------------------------------");
				//Clear();
				break;
			case 2:
				System.out.println("--------------------------------------------------");
				System.out.println("	Ha ingresado al menu de ventas");
				System.out.println("--------------------------------------------------");
				//Clear();
				break;
			case 3:
				System.out.println("--------------------------------------------------");
				System.out.println("	Ha ingresado al menu de catalogos");
				System.out.println("--------------------------------------------------");
				//Clear();
				break;
			case 4:
				exit = true;
				System.out.println("Hasta Pronto!");
				break;
			default:
				System.out.println("opcion invalida");
				break;
			}
			
		}

	}

}
