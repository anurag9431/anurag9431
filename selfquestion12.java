import java.util.*;
class selfquestion12
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
       int quantity = sc.nextInt();
       int price = 100*quantity;
       int total = (10/100)*price;

       if(price > 1000 )
       {
        System.out.println(total);
       }

       else
       {
        System.out.println("SORRY discount cant be given");
       }


    }

    
} 