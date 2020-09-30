package proiecteAntrenament;
import java.util.*;

public class DecimalInBinar {
	
	//Trasformarea unui numar decimal in varianta binara
	
	static void decimal(int n) {
		int[] bin = new int[100];
		int i = 0;
		while(n>0) {
			bin[i] = n%2;
			n=n/2;
			i++;
			
		}
		for(int j = i-1;0<=j;j--) {
			System.out.print(bin[j]);
			
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Intoduceti un numar: ");
		int next = in.nextInt();
		decimal(next);
		
		
		

	}

}
