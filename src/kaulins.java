import java.util.Random;

public class kaulins {

	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for(int i=0;i<=reizes;i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Uzkrita skaitlis: "+skaitlis+"\n");
	}
	}
	
	public static void main(String[] args) {
		mestKaulinu(3);
	}
}
