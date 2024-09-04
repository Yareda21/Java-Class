import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
      public static void main(String[] args){
            Scanner obj=new Scanner(System.in);
            Random random=new Random();
            int secretnumber=random.nextInt(100)+1;
            int attempts=0;
            int guess;
            System.out.println("welcome to Guessing the Number Game");
            System.out.println("I have choosen a number between 1 and 100,try to guess the number");
            while(true){
                  System.out.println("enter your guess:");
                  guess=obj.nextInt();
                  attempts++;
                  if(guess<secretnumber){
                        System.out.println("your guess is too low");
                  }else if(guess>secretnumber){
                        System.out.println("your guess is too high");
                  }else if(guess==secretnumber){
                        System.out.println("congratulations you have got the secret number:"+secretnumber+"in:"+attempts+"tries");
                  }
                  

            }
      }
}
