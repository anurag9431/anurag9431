import java.util.*;
public class selfquestion26
{
   public static int calculatenumber(int a , int b)
   {
    int product = a*b;
    return product;
   }

   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int product = calculatenumber(a,b);
    System.out.println("product of two numbers is: "+product);
    
   }
}