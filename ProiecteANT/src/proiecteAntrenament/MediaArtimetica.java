package proiecteAntrenament;
import java.util.*;
public class MediaArtimetica {

	public static void main(String[] args) {
		System.out.println("Introduceti doua numere pozitive: ");
		double b,c=0;
		for(int i = 1; i<3;i++) {
			Scanner a = new Scanner(System.in);
			b = a.nextDouble();
			c=c+b;
			
		}
		c=c/2;
		System.out.println("Media aritmetica a numerelor introduse este: "+c);

	}

}
