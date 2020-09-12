import java.util.*;
class Pronic
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int i,n,d,S=0,c=1;
  System.out.println("Enter the Number");
  n=sc.nextInt();
for(i=n;i>0;i=i/10)
{
d=i%10;
c=c*d;
S=S+d;
}
if((S+c)==n)
{
System.out.println("It is a Pronic Number");
}
else
{
System.out.println("Not a Pronic Number");
}
}
}