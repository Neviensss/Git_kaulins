import java.util.Random;

public class kaulins {

	public static void main(String[] args) {
		int skaitlis;
		Random rand = new Random();
		skaitlis = rand.nextInt(6)+1;
		System.out.print("Uzkrita skaitlis: "+skaitlis);
	}

}
