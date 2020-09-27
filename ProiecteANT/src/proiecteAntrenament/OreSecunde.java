package proiecteAntrenament;
import java.util.*;
public class OreSecunde {

	public static void main(String[] args) {
		
		//Citesti de la tastatura un numar de ore si zici cate secunde sunt.

        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti un numar de ore: ");
        int ore = numar.nextInt();

        int secunde = ore*60;
        System.out.println("Numar de secunde este: " + secunde);

		

	}

}
