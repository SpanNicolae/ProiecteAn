package proiecteAntrenament;
import java.util.*;

public class AnaAreMere {
	public static void main(String[] args) {
	//Ai propozitia “Ana are mere”. Citesti de la tastatura un caracter si zici daca propozitia il continie sau nu.
    String ana = "Ana are mere";
    System.out.println("Introduceti un caracter: ");
    Scanner input = new Scanner(System.in);
    String ch = input.next();
      if(ana.contains(ch)){
      }else
          System.out.println(ch + " nu face parte din propozitie!");

      //am invatat metoda contains de la google :)

}
}
