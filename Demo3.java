import java.util.Scanner;
class Prime{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number to check the number is prime or not:");
      int num=sc.nextInt();
      
      int count=0;
      for(int i=2;i<num;i++)
      {
       if(num%i==0)
       {
        count++;
       }
      }
      if(count!=0)
      {
        System.out.println("Given number is not a prime number.");
      }
      else
      {
        System.out.println("Given number is a prime number.");
      }  
   }
}      













 
