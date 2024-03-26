import java.util.*; 
class Triangle
{
int X,Y,Z;
Triangle(int a,int b,int c)
{
X=a; Y=b; Z=c;
}
void equilateral()
{

if(X==Y&&Y==Z)
System.out.println("This is an equilateral triangle"); else
System.out.println("This is not an equilateral triangle");
}
void isosceles()
{
if(X==Y ||Y==Z||Z==X)
System.out.println("This is an isosceles triangle"); else
System.out.println("This is not an isosceles triangle");
}
void rightangle()
{
if((X*X)+(Y*Y)==(Z*Z))
System.out.println("This is an rightangle triangle"); else
System.out.println("This is not an rightangle triangle");
}
}
public class prg1 {
public static void main(String[] args)
{
int a,b,c;
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the value of a :"); a=sc.nextInt();
System.out.println("Enter the value of b :"); b=sc.nextInt();
System.out.println("Enter the value of c :"); c=sc.nextInt();
Triangle r1 = new Triangle(a,b,c); r1.isosceles();
r1.equilateral(); r1.rightangle();
}
}
