import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner obj =new Scanner(System.in);
      System.out.println("Enter the number of days");
      int days =obj.nextInt();
      double[] expenses=new double[days];
      for(int i=0; i<days; i++){

            System.out.println("enter expenses for day"+(i+1)+":");
            expenses[i]=obj.nextDouble();
}
double totalexpenses=0;
for(double expense:expenses){
      totalexpenses+=expense;
}
System.out.println("the total expense :"+totalexpenses);
double average=totalexpenses/days;
System.out.println("the monthly average expenses:"+average);
double maximumexpense=expenses[0];
 int maxday=1;
 for(int i=0; i<days; i++){
      if(expenses[i]>maximumexpense){
      }
      System.out.println("the day with a maximum expense is"+maxday+":"+maximumexpense);
      System.out.println("days with above average expenses:");
      
 }
    }
}