import java.util.Random;

public class Dice {
	int sides;

	public Dice(int sides) {
	this.sides = sides;
	}
	public void rollDice() {
	Random rand = new Random();

	int outcome = rand.nextInt(sides)+1;
	switch(outcome) {
	  case 1:
		  if(sides == 2)
			  System.out.println("HEAD");
		  else
	          System.out.println("ONE");
	      break;

	   case 2:
		   if(sides == 2)
			   System.out.println("TAIL");
		   else
	           System.out.println("TWO");
	      break;

	    case 3:
	      System.out.println("THREE");
	      break;

	    case 4:
	      System.out.println("FOUR");
	      break;

	    case 5:
	      System.out.println("FIVE");
	      break;

	    case 6:
	      System.out.println("SIX");
	      break;
	}
	}
}
