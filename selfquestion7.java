import java.util.*;
class selfquestion7
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int calculator = sc.nextInt();
        
         int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
       
        switch(calculator)
        {
       case 1: System.out.println(add);
       break;

       case 2: System.out.println(sub);
       break;

       case 3: System.out.println(mul);
       break;

       case 4: System.out.println(div);
       break;

       default: System.out.println("invalid");
    }

    }
} 