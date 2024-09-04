import java.util.Arrays;
import java.util.Scanner;

public class ToDOList{
private static final Object[] Double = null;

public static void main(String[] args){
      Scanner obj= new Scanner(System.in);
      System.out.println("enter expression example: 1+2 or 2*8");
      String expression = obj.nextLine();

      if (expression.split("\\+").length > 1) {
            System.out.println("Addition");
            String[] parts= expression.split("\\+");
            double sum = 0;
            for(int i=0; i< parts.length; i++){
                  sum += Integer.parseInt(parts[i]);
            }System.out.println(sum);
            return;
      }else if(expression.split("\\-").length>1){
            System.out.println("Subtraction");
            String[] parts= expression.split("\\-");
            double difference=0;
            for(int i=0; i<parts.length; i++){
                  difference-=Integer.parseInt(parts[i]);
            }System.out.println(difference);
            return;
      }else if(expression.split("\\*").length>1){
            System.out.println("Multi");
            String[] parts= expression.split("\\*");
            double multiply=1;
            for(int i=0; i<parts.length; i++){
                  multiply*=Integer.parseInt(parts[i]);
            }System.out.println(multiply);
            return;
      }else if(expression.split("\\/").length>1){
            System.out.println("Divi");
            String[] parts= expression.split("\\/");
            double division=1;
            for(int i=0; i<parts.length; i++){
                  division/=Integer.parseInt(parts[i]);
            }System.out.println(division);
            return;
      }
      

}
}
