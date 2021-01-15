// The "OneawayTwo" class.
import java.awt.*;
import hsa.Console;

public class OneawayTwo
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//declaration

	char choice1, choice2, choice3, choice4, choice5;
	int carchoice, rightguess, num;
	int rdigit1, rdigit2, rdigit3, rdigit4, rdigit5;
	int wdigit1, wdigit2, wdigit3, wdigit4, wdigit5;
	int fake1, fake2, fake3, fake4, fake5;

	//assignment

	rightguess = 0;
	Font smallest = new Font ("Times New Roman", Font.PLAIN, 18); //Create all my fonts I used throughout program
	Font text = new Font ("Broadway", Font.PLAIN, 28);
	Font instructions = new Font ("Broadway", Font.PLAIN, 75);
	Font large = new Font ("Broadway", Font.BOLD, 90);

	//welcome screen

	c.setColor (Color.cyan);
	c.fillRect (0, 0, 700, 600);

	c.setColor (Color.black);
	c.setFont (large);
	c.drawString ("ONE AWAY", 50, 250);

	c.setFont (text);
	c.drawString ("Press any key to continue", 160, 400);

	c.getChar ();
	c.clear ();

	//rules screen

	c.setColor (Color.cyan);
	c.fillRect (0, 0, 700, 600);

	c.setColor (Color.black);
	c.setFont (instructions);
	c.drawString ("INSTRUCTIONS", 25, 100);

	c.setFont (smallest);
	c.drawString ("1. The wrong price for a car will be displayed on the board. Every digit in this price", 1, 150);
	c.drawString ("is one away from the real price of the car.", 20, 170);

	c.drawString ("2. You must choose to move each digit either up one or down one in an attempt to", 1, 200);
	c.drawString ("form the real price of the car.", 20, 220);

	c.drawString ("3. After guessing, you will told how many digits you got correct.", 1, 250);

	c.drawString ("4. If all 5 digits are correct, you win the car!", 1, 280);

	c.drawString ("5. If all 5 digits are incorrect, you lose your chance as winning the car.", 1, 310);

	c.drawString ("6. If you get at least 1 digit correct, you get a second chance at guessing each digit.", 1, 340);

	c.drawString ("7. If on your second attempt you get any digit incorrect, you lose. If you get all 5 right,", 1, 370);
	c.drawString ("you win the car!", 20, 390);

	c.setFont (text);
	c.drawString ("Press any key to get started!", 125, 450);

	//car selection

	c.getChar ();
	c.clear ();

	carchoice = (int) (Math.random () * 3) + 1; //Randomly selects car for user to win

	if (carchoice == 1)

	    {
		c.setFont (smallest);
		c.drawString ("The car we're playing for today is the Tesla Model S!", 110, 50);
		c.drawString ("In order to guess lower or higher, type \"L\" for lower and \"H\" for higher.", 65, 75);

		rdigit1 = 9; //Assign the right digits for this car
		rdigit2 = 4;
		rdigit3 = 3;
		rdigit4 = 7;
		rdigit5 = 5;

		fake1 = 8; //Assign the fake digits for this car
		fake2 = 5;
		fake3 = 4;
		fake4 = 6;
		fake5 = 6;

		wdigit1 = 7; //Assign the wrong digits for this car (either higher or lower)
		wdigit2 = 6;
		wdigit3 = 5;
		wdigit4 = 5;
		wdigit5 = 7;
	    }

	else if (carchoice == 2)

	    {
		c.setFont (smallest);
		c.drawString ("The car we're playing for today is the Audi A7!", 110, 50);
		c.drawString ("In order to guess lower or higher, type \"L\" for lower and \"H\" for higher.", 65, 75);

		rdigit1 = 6;
		rdigit2 = 7;
		rdigit3 = 5;
		rdigit4 = 3;
		rdigit5 = 4;

		fake1 = 5;
		fake2 = 8;
		fake3 = 6;
		fake4 = 2;
		fake5 = 5;

		wdigit1 = 4;
		wdigit2 = 9;
		wdigit3 = 7;
		wdigit4 = 1;
		wdigit5 = 6;
	    }

	else

	    {

		c.setFont (smallest);
		c.drawString ("The car we're playing for today is the BMW 6-Series!", 110, 50);
		c.drawString ("In order to guess lower or higher, type \"L\" for lower and \"H\" for higher.", 65, 75);

		rdigit1 = 8;
		rdigit2 = 5;
		rdigit3 = 7;
		rdigit4 = 3;
		rdigit5 = 2;

		fake1 = 7;
		fake2 = 6;
		fake3 = 8;
		fake4 = 2;
		fake5 = 3;

		wdigit1 = 6;
		wdigit2 = 7;
		wdigit3 = 9;
		wdigit4 = 1;
		wdigit5 = 4;
	    }

	//Code below draws the game board that displays the fake digits and the user's choice of digits

	c.drawRect (70, 100, 500, 200);
	c.drawLine (70, 170, 570, 170);
	c.drawLine (70, 235, 570, 235);
	c.drawLine (170, 170, 170, 300);
	c.drawLine (270, 170, 270, 300);
	c.drawLine (370, 170, 370, 300);
	c.drawLine (470, 170, 470, 300);

	c.setFont (text);
	c.drawString ("One Away", 245, 145);
	c.drawString (fake1 + "", 110, 210);
	c.drawString (fake2 + "", 210, 210);
	c.drawString (fake3 + "", 310, 210);
	c.drawString (fake4 + "", 410, 210);
	c.drawString (fake5 + "", 510, 210);

	c.setCursor (17, 1);
	c.println ("Welcome to the Price is Right! My name is Drew Carey, and we're happy to have you here today. To start off, you will be guessing the digits from left to right. For the first digit, " + fake1 + ", would you like to guess higher or lower?");
	choice1 = c.getChar ();

	if (choice1 == 'h' || choice1 == 'H')
	{
	    rightguess = rightguess + 1;
	    num = rdigit1;
	    c.drawString (num + "", 110, 275);

	}

	else
	{
	    num = wdigit1;
	    c.drawString (num + "", 110, 275);
	}

	c.setCursor (17, 1);
	c.println ("Alright, let's move on to the second guess.");
	c.setCursor (18, 1);
	c.println ("");
	c.setCursor (19, 1);
	c.println ("");

	choice2 = c.getChar ();

	if (choice2 == 'h' || choice2 == 'H')
	{
	    num = wdigit2;
	    c.drawString (num + "", 210, 275);

	}

	else
	{
	    num = rdigit2;
	    rightguess = rightguess + 1;
	    c.drawString (num + "", 210, 275);
	}

	c.setCursor (17, 1);
	c.println ("Now, let's get our third guess from you.");

	choice3 = c.getChar ();

	if (choice3 == 'h' || choice3 == 'H')
	{
	    num = wdigit3;
	    c.drawString (num + "", 310, 275);
	}

	else
	{
	    num = rdigit3;
	    rightguess = rightguess + 1;
	    c.drawString (num + "", 310, 275);
	}

	c.setCursor (17, 1);
	c.println ("Okay, time to guess our fourth digit. Would you like " + fake4 + " to be higher or lower?");
	choice4 = c.getChar ();

	if (choice4 == 'h' || choice4 == 'H')
	{
	    rightguess = rightguess + 1;
	    num = rdigit4;
	    c.drawString (num + "", 410, 275);
	}

	else
	{
	    num = wdigit4;
	    c.drawString (num + "", 410, 275);
	}

	c.setCursor (17, 1);
	c.println ("Last guess! Make it a good one! Would you like to lower or raise " + fake5 + "?");
	choice5 = c.getChar ();

	if (choice5 == 'h' || choice5 == 'H')
	{
	    num = wdigit5;
	    c.drawString (num + "", 510, 275);
	}

	else
	{
	    rightguess = rightguess + 1;
	    num = rdigit5;
	    c.drawString (num + "", 510, 275);
	}

	c.setCursor (17, 1);
	c.println ("Okay, now let's check how many you got right. Press any key to check.");
	c.getChar ();

	if (rightguess == 5) //MAKE SPECIFIC TO CAR
	{
	    c.setCursor (17, 1);
	    c.println ("Correct guesses: " + rightguess);
	    c.println ("\nCongratulations! You won!");
	}

	else if (rightguess == 0)
	{
	    c.setCursor (17, 1);
	    c.println ("Correct guesses: " + rightguess);
	    c.println ("\nI'm sorry to say this, but you didn't get any digits right. This means that you've lost your chance of winning the car. Better luck next time!");
	    c.println ("The actual price of the car has been added to the game board.");

	}

	else
	{

	    c.setCursor (17, 1);
	    c.println ("Correct guesses: " + rightguess);
	    c.println ("I have some good and bad news for you. Since you got " + rightguess + " guesses correct, you get a second chance! We will go through all of the digits again, from left to right,\nand you must change each digit again either higher or lower. If you get all \ndigits right on this second chance, you win! If you get any digit wrong, you \nlose the car.");
	    c.println ("\nPress any key to start your second chance!");
	    rightguess = 0;

	    c.getChar ();
	    c.clear ();

	    c.drawRect (70, 100, 500, 200);
	    c.drawLine (70, 170, 570, 170);
	    c.drawLine (70, 235, 570, 235);
	    c.drawLine (170, 170, 170, 300);
	    c.drawLine (270, 170, 270, 300);
	    c.drawLine (370, 170, 370, 300);
	    c.drawLine (470, 170, 470, 300);

	    c.setFont (text);
	    c.drawString ("One Away", 245, 145);
	    c.drawString (fake1 + "", 110, 210);
	    c.drawString (fake2 + "", 210, 210);
	    c.drawString (fake3 + "", 310, 210);
	    c.drawString (fake4 + "", 410, 210);
	    c.drawString (fake5 + "", 510, 210);

	    c.setCursor (17, 1);
	    c.println ("To start off you will be guessing the digits from left to right. \nFor the first digit, " + fake1 + ", would you like to guess higher or lower?");

	    c.setCursor (19, 1);
	    c.println ("");
	    c.setCursor (20, 1);
	    c.println ("");
	    c.setCursor (21, 1);
	    c.println ("");
	    c.setCursor (22, 1);
	    c.println ("");
	    c.setCursor (24, 1);
	    c.println ("");
	    choice1 = c.getChar ();

	    if (choice1 == 'h' || choice1 == 'H')
	    {
		rightguess = rightguess + 1;
		num = rdigit1;
		c.drawString (num + "", 110, 275);

	    }

	    else
	    {
		num = wdigit1;
		c.drawString (num + "", 110, 275);
	    }

	    c.setCursor (17, 1);
	    c.println ("Alright, let's move on to the second guess.");
	    c.setCursor (18, 1);
	    c.println ("");
	    c.setCursor (19, 1);
	    c.println ("");

	    choice2 = c.getChar ();

	    if (choice2 == 'h' || choice2 == 'H')
	    {
		num = wdigit2;
		c.drawString (num + "", 210, 275);

	    }

	    else
	    {
		num = rdigit2;
		rightguess = rightguess + 1;
		c.drawString (num + "", 210, 275);
	    }

	    c.setCursor (17, 1);
	    c.println ("Now, let's get our third guess from you.");

	    choice3 = c.getChar ();

	    if (choice3 == 'h' || choice3 == 'H')
	    {
		num = wdigit3;
		c.drawString (num + "", 310, 275);
	    }

	    else
	    {
		num = rdigit3;
		rightguess = rightguess + 1;
		c.drawString (num + "", 310, 275);
	    }

	    c.setCursor (17, 1);
	    c.println ("Okay, time to guess our fourth digit. Would you like " + fake4 + " to be higher or lower?");
	    choice4 = c.getChar ();

	    if (choice4 == 'h' || choice4 == 'H')
	    {
		rightguess = rightguess + 1;
		num = rdigit4;
		c.drawString (num + "", 410, 275);
	    }

	    else
	    {
		num = wdigit4;
		c.drawString (num + "", 410, 275);
	    }

	    c.setCursor (17, 1);
	    c.println ("Last guess! Make it a good one! Would you like to lower or raise " + fake5 + "?");
	    choice5 = c.getChar ();

	    if (choice5 == 'h' || choice5 == 'H')
	    {
		num = wdigit5;
		c.drawString (num + "", 510, 275);
	    }

	    else
	    {
		rightguess = rightguess + 1;
		num = rdigit5;
		c.drawString (num + "", 510, 275);
	    }

	    c.setCursor (17, 1);
	    c.println ("Okay, now let's check how many you got right. Press any key to check.");
	    c.getChar ();

	    if (rightguess == 5)
	    {
		c.setCursor (17, 1);
		c.println ("Correct guesses: " + rightguess);
		c.println ("\nCongratulations! You won!");
	    }

	    else
	    {
		c.setCursor (17, 1);
		c.println ("Correct guesses: " + rightguess);
		c.println ("Sorry to say this, but you didn't get all 5 digits right; you only got " + rightguess + ". Since this is your second and last chance, you lose your chance at winning the car. \nBetter luck next time!");

	    }
	}

	//MAKE OUTRO SCREEN

	// Place your program here.  'c' is the output console
    } // main method
} // OneawayTwo class
