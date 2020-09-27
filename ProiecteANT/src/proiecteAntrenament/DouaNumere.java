package proiecteAntrenament;
import java.util.*;
public class DouaNumere {

	public static void main(String[] args) {
		//Citesti 2 numere de la tastatura si calculezi suma lor.
        Scanner numar1 = new Scanner(System.in);
        System.out.println("Introduceti doua numere pentru a se putea afla suma acestora! \n Introduceti primul numar: ");
        int a = numar1.nextInt();

        Scanner numar2 = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int b = numar2.nextInt();

        int c = a+b;
        System.out.print("Suma celor doua numere este: "+c);
		

	}

}
