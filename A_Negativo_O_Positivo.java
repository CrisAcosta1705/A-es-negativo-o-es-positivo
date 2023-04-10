package A_Negativo_O_Positivo;
import java.util.Scanner;
public class A_Negativo_O_Positivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner tc = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int a = tc.nextInt();

	        int y;

	        if (a >= 0) {
	            y = (int) Math.pow(2, a);
	        } else {
	            y = a + 5;
	        }

	        System.out.println("El resultado de Y es: " + y);
	}

}
