import java.util.Scanner;
public class Principal{
	public static void main(String args []){
		System.out.println("Importe un número entero");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if( x > 10){
			System.out.print(x + " es mayor que 10");
		}else if (x < 10){
			System.out.print(x + " es menor que 10");
		}else{
			System.out.print(x + " es igual que 10");
		}
	}
}
