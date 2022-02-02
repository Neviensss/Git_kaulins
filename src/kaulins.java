
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class kaulins {

	static List<Integer> mestKaulinu(int reizes){
		int skaitlis, lielakais=0;
		Random rand = new Random();
		
		for(int i=1;i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Uzkrita skaitlis: "+skaitlis+"\n");
		if(lielakais<skaitlis){
			lielakais = skaitlis;
		}
		}
		System.out.println("Lielākais skaitlis ir: "+lielakais);
		return null;
	}
	
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		int reizes, izvele;
		List<Integer> pedejie = new ArrayList<Integer>();
		do{
System.out.println("1-Mest kaulinu | 2- Apskatit pedejos| 3- Apturet");
izvele = dati.nextInt();
switch(izvele){
case 1: 
	do{
		System.out.println("Cik reizes metisi");
		reizes = dati.nextInt();
		
	}while(reizes<1);
	pedejie = mestKaulinu(reizes);
	break;
case 2:
	System.out.println("Pedeja metiena skaitli ir");
	for(int i=0; i<pedejie.size(); i++){
		pedejie.get(i);
	}
	break;
case 3:
	int lielakais =0;
	for(int i=0; i<pedejie.size(); i++){
		if(pedejie.get(i)>lielakais){
			lielakais = pedejie.get(i);
			
		}
		System.out.println("Lielakais skaitlis pedeja metiena ir "+lielakais);
		break;
	}
		case 4:
			System.out.println("Programma aptureta");
			break;
	}

}while(izvele!=2);
dati.close();
		}

	
	}

