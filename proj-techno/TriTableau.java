import java.util.*;

public class TriTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Array length:");
	    int n = sc.nextInt();
	    int [] t = new int[n];
	    System.out.println("Enter the array's elements:");
	    for(int i = 0; i < n; i++) {
	    	t[i] = sc.nextInt();
	    }
	    System.out.println("Your array non-order : ");
	    System.out.println(Arrays.toString(t));
		int e, j;	
		for(int i = 1; i< t.length; i++) {
			e = t[i];
			j = i-1;
			while(j>= 0 && t[j]>e) {
				t[j+1] = t[j];
				j--;
			}
			t[j+1] = e;
		}
		System.out.println("Your array order : ");
	    System.out.println(Arrays.toString(t));
	}
}
