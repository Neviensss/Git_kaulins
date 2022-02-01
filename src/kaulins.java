import java.util.Random;
import java.util.Scanner;

public class kaulins {

	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		
		for(int i=1;i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Uzkrita skaitlis: "+skaitlis+"\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Sveiki");
		Scanner dati = new Scanner(System.in);
		int reizes;
		do{
		System.out.print("Cik reizes mest kauliņu?: ");
		reizes = dati.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
				dati.close();
	}
}
