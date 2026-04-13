// Guess the number app
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 10: ");
        int userInput = sc.nextInt();

        int randomValue =(int)Math.floor(Math.random()*10)+1;

        if(randomValue==userInput){
            System.out.println("Your number"+userInput+" and bot number :"+randomValue);
            System.out.println("You won !!");
        }
        else{
            System.out.println("Your number"+userInput+" and bot number :"+randomValue);
            System.out.println("You lose !! better luck next time");
        }
    }
}
