import java.util.Random; //generate random number
import java.util.Scanner;

class Game
{
    public int number;  //random number
    public int usernumber;
    public int noofgusses = 0;

    public int getNoofgusses() {
        return noofgusses;
    }

    public void setNoofgusses(int noofgusses) {
        this.noofgusses = noofgusses;
    }

     Game()
    {
        Random r=new Random();
        this.number=r.nextInt(100);
    }
    void takeUserInput()
    {
        System.out.println("Guess the number: ");
        Scanner sc=new Scanner(System.in);
        usernumber=sc.nextInt();

    }
    boolean isCorrectNumber()
    {
        if (usernumber==number)
        {
            System.out.format("your guess the right number number is %d Congratulation!!! \n you guess in %d attempt",number, noofgusses);
            return true;
        } else if (usernumber<number) {
            System.out.println("Too low");
            
        }else if (usernumber>number) {
            System.out.println("Too high");

        }

        return false;

    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number" game once.
            Game should have the following methods:
            Constructor to generate the random number
            takeUserInput() to take a user input of number
            isCorrectNumber() to detect whether the number entered by the user is true
            getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
        Game g=new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b=g.isCorrectNumber();

        }
    }
}
