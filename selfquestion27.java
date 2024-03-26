import java.util.*;
public class selfquestion27
{
   public static void calculatefactorial(int n)
   {
    if (n<0)
    {
        System.out.println("invalid number");
        return;
    }


    int factorial = 1;

    for(int i=n;i>=1;i--)
    {
        factorial = factorial*i;
    }
    System.out.println(factorial);
    return;
   }

   public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    calculatefactorial(n);
   }
}