import java.util.Scanner;
import java.util.Random;

public class Main
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    Random random = new Random ();

      System.out.println ("\t\tWelcome to the Guess the Number game!\n");
    int LowerRange = 1;
    int UpperRange = 100;
    int MaxAttempts = 5;
    int Rounds = 0;
    int Score = 0;

    boolean PlayAgain = true;
    while (PlayAgain)
      {
	int TargetNumber =
	  random.nextInt (UpperRange - LowerRange + 1) + LowerRange;
	  System.out.println ("\tI'm thinking of a number between " +
			      LowerRange + " and " + UpperRange + ".\n");

	int Attempts = 0;
	while (Attempts < MaxAttempts)
	  {
	    System.out.print ("\tEnter your guess: ");
	    int UserGuess = scanner.nextInt ();
	      Attempts++;

	    if (UserGuess < TargetNumber)
	      {
		System.out.println ("\n\tToo low! Try a higher number.\n");
	      }
	    else if (UserGuess > TargetNumber)
	      {
		System.out.println ("\tToo high! Try a lower number.\n");
	      }
	    else
	      {
		System.
		  out.println ("\tCongratulations! You guessed the number " +
			       TargetNumber + " correctly in " + Attempts +
			       " attempts.\n");
		Score++;
		break;
	      }
	  }

	if (Attempts == MaxAttempts)
	  {
	    System.out.println
	      ("\tSorry, you have reached the maximum number of attempts. The Lottery number was "
	       + TargetNumber + ".\n");
	  }

	Rounds++;
	System.out.print ("\tDo you want to play again? (yes/no): ");
	PlayAgain = scanner.next ().equalsIgnoreCase ("yes");
      }

    System.out.println ("\n\tGame over! You played " + Rounds +
			" rounds \n\t your final score is " + Score + ".\n");
    scanner.close ();
  }
}
