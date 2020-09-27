package proiecteAntrenament;
import java.util.*;
public class ZileleSaptamanii {

	public static void main(String[] args) {
		//Citesti un numar de la tastatura de la 1 la 7 si sici ce zi a saptamanii este
		
		
		String[] zile = {"Luni","Marti","Miercuri","Joi","Vineri","Sambata","Duminica"};
		System.out.println("Introduceti un numar de la 1 la 7: ");
		Scanner input = new Scanner(System.in);
		int numar = input.nextInt();
		if(numar>7|| numar <0) {
			System.out.println("Valorea nu se incadreaza in intervalul 1 - 7!");
		}else
			//for(int i = 0;i<zile.length;i++) {
				System.out.println("Ziua saptamanii alese este: " + zile[numar-1]);
				
			//}

	}

}
