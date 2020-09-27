package proiecteAntrenament;
import java.util.*;

public class NumarCaractere {

	public static void main(String[] args) {
		
		//Citesti de la tastatura un text si sici cate caractere are

        System.out.println("Introduceti un text: ");
        Scanner str = new Scanner(System.in);
        String text = str.nextLine();

        System.out.println("Numarul de caractere al textului este: " + text.length());
		

	}

}
