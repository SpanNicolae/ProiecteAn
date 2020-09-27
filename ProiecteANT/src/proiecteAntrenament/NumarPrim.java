package proiecteAntrenament;
import java.util.*;

public class NumarPrim {

	public static void main(String[] args) {
		boolean prim = false;
		
		System.out.println("Introduceti un numar: ");
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		
		
		for(int i = 2; i<=numar/2;++i) {
			if(numar%i==0) {
				prim = true;
				break;
			}
		}
			if(!prim) {
				System.out.println("Numarul "+ numar+ " este prim");
				
			}else 
				System.out.println("Numarul "+ numar+ " nu este prim");
		}
		
		
		
		
		

	}


