package contador;

public class main_acumulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int acumulador=0;//acumulando y sumando el numero de n veces que sumaste la variable
		while (count<5) {
			count =count + 1;
			acumulador =acumulador + count;
			System.out.println(acumulador);
		}

	}

}
