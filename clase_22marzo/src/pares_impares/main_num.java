package pares_impares;

import java.util.Scanner;

public class main_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,par=0,impar=0,count =0;
		
		do {
			System.out.println("Ingrese un numero para saber que numeros son pares e impares");
			n = scan.nextInt();
		}
		while(n<1);
		for(int i =1 ; i<=n;i++) {
			count=count+1;
			if(n%2==0) {
				par++;
			}
			 else{
				 impar++;
				
			}
		}
		System.out.println("Numeros par :"+par);
		System.out.println("Numeros impar :"+impar);
	}

}
