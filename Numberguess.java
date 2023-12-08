import java.util.Random;
import java.util.Scanner;

public class Numberguess {
    void guess(){
        Random rand=new Random();
        int computer_num=rand.nextInt(100);
        int score=10;
        System.out.println("******NUMBER GUESSING GAME******");
        System.out.println("Instructions : You have only have 10 attempts  in one round  to guess the number between 1-100");
        System.out.println(".......GAME STARTED.......");
        for (int i=0;i<10;i++){
            score--;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number that u have  guessed : ");
            int user=input.nextInt();
            System.out.println("user guessed number is "+user);
            if(user<computer_num){
                System.out.println("its too low ..try again");
            }
            else if (user>computer_num){
                System.out.println("its too high  ..try again");
            }
            else{
                System.out.println("ITS CORRECT!...");
                break;
            }

        }
        System.out.println("Computer guessed no is "+computer_num);
        System.out.println(" Your Score is: "  +score);
        Scanner input=new Scanner(System.in);
        System.out.println("Do u want play another  round? y or n ?:");
        char repeat=input.next().charAt(0);
        if(repeat=='y'){
            System.out.println("NEW  ROUND STARTED...");
            score=10;
            guess();
        } else if (repeat=='n') {
            System.out.println("QUIT!");
        }
    }

    public static void main(String[] args) {
        Numberguess obj1=new Numberguess();
        obj1.guess();
    }
}
