import java.util.Scanner;

public class output {
	public static void main(String []args){
		int sides;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of sides of Dice");
		sides = scan.nextInt();
		for(int i=0; i<5; i++) {
		Dice sided = new Dice(sides);
		sided.rollDice();
		}
		scan.close();
		}
}
