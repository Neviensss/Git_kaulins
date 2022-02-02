import java.util.Random;
import java.util.Scanner;

public class kaulins {
	public static int skaitlis;
	
	static void izvadaZimes(){
		if(skaitlis == 1){
			System.out.println(" _"+"_"+"_"+"_"+"_");
			System.out.println("|"+" "+" "+" "+"  |");
			System.out.println("|"+" "+" "+"O"+"  |");
			System.out.println("|"+" "+" "+" "+"  |");
			System.out.println("|_"+"_"+"_"+"_"+"_|");
		}else if(skaitlis == 2){
			System.out.println(" _"+"_"+"_"+"_"+"_");
			System.out.println("|"+"O"+" "+" "+"  |");
			System.out.println("|"+" "+" "+" "+"  |");
			System.out.println("|"+" "+" "+" "+"O |");
			System.out.println("|_"+"_"+"_"+"_"+"_|");
		}else if(skaitlis == 3){
			System.out.println(" _"+"_"+"_"+"_"+"_");
			System.out.println("|"+"O"+" "+" "+"  |");
			System.out.println("|"+" "+"O"+" "+"  |");
			System.out.println("|"+" "+" "+"O"+"  |");
			System.out.println("|_"+"_"+"_"+"_"+"_|");
		}else if(skaitlis == 4){
			System.out.println(" _"+"_"+"_"+"_"+"_");
			System.out.println("|"+"O"+" "+" "+"O |");
			System.out.println("|"+" "+" "+" "+"  |");
			System.out.println("|"+"O"+" "+" "+"O |");
			System.out.println("|_"+"_"+"_"+"_"+"_|");
		}else if(skaitlis == 5){
			System.out.println(" _"+"_"+"_"+"_"+"_");
			System.out.println("|"+"O"+" "+" "+" O|");
			System.out.println("|"+" "+" O"+" "+" |");
			System.out.println("|"+"O"+" "+" "+" O|");
			System.out.println("|_"+"_"+"_"+"_"+"_|");
		}else if(skaitlis == 6){
			System.out.println(" _"+"_"+"_"+"_"+"_");
			System.out.println("|"+"O"+"  "+"O"+" |");
			System.out.println("|"+"O"+"  "+"O"+" |");
			System.out.println("|"+"O"+"  "+"O"+" |");
			System.out.println("|_"+"_"+"_"+"_"+"_|");
		}
	}

	static void mestKaulinu(int reizes){
		int lielakais=0;
		Random rand = new Random();
		
		for(int i=1;i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Uzkrita skaitlis: "+skaitlis+"\n");
		izvadaZimes();
		if(lielakais<skaitlis){
			lielakais = skaitlis;
		}
		}
		System.out.println("Lielākais skaitlis ir: "+lielakais);
	}
	
	public static void main(String[] args) {
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
