import java.util.*;

public class IntPariteSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez votre nombre : ");
	    int x = sc.nextInt();
		if(x<0) {
			System.out.println("Le nombre est négatif.");
		}else {
			System.out.println("Le nombre est positif.");
		}
		if(x%2==0) {
			System.out.println("Le nombre est pair.");
		}else {
			System.out.println("Le nombre n'est pas pair.");
		}
		System.out.println("Ce nombre n est : " + x);
	}
}