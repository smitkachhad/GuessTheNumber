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
        Game g=new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b=g.isCorrectNumber();

        }
    }
}
