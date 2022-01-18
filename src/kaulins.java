import java.util.Random;
import java.util.Scanner;

public class kaulins {

	public static void main(String[] args) {
		int skaitlis;
		Random rand = new Random();
		Scanner dati = new Scanner(System.in);
		
		System.out.print("Cik reizes mest kauliņu?: ");
		int reizes = dati.nextInt();
		for(int i=0;i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Uzkrita skaitlis: "+skaitlis);
		}
	dati.close();
	}

}
