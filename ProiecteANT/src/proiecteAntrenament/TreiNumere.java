package proiecteAntrenament;
import java.util.*;

public abstract class TreiNumere {

	public static void main(String[] args) {
		// Citesti 3 numere de la tastatura si il afisesi pe cel mai mare.
        Scanner numar1 = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int a = numar1.nextInt();

        Scanner numar2 = new Scanner(System.in);
        System.out.print("Introduceti al doilea numar: ");
        int b = numar2.nextInt();

        Scanner numar3 = new Scanner(System.in);
        System.out.print("Introduceti al treilea numar: ");
        int c = numar3.nextInt();


        if(a>=b && a>=c){
            System.out.println("Cel mai mare numar este: "+a);
        }else if(b>=a && b>=c){
            System.out.println("Cel mai mare numar este: "+b);
        }else
            System.out.println("Cel mai mare numar este: "+c);

		

	}

}
