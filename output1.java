import java.util.Scanner;

public class output1 {
	public static void main(String []args){
		int sides;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of sides of Dice");
		sides = scan.nextInt();
		if(sides==2 || sides==4 || sides==6) {
		for(int i=0; i<5; i++) {
		Dice1 sided = new Dice1(sides);
		sided.rollDice();
		}
		}
		else
			System.out.println("ONly for Two, Four and Six sided dices");
		scan.close();
		}
}
