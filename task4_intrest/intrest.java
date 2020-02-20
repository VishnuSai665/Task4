package epam.task4_intrest;
import java.util.*;
class intrest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the princpal amount , time period , rate of intrest");
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		System.out.println("1.Compound Intrest 2.Simple Intrest");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 2 :
			SI si=new SI(p,t,r);
			System.out.println(si.intrest);
			break;
		case 1 :
			CI ci=new CI(p,t,r);			
			System.out.println(ci.intrest);
			break;
		default : System.out.println("Please enter a valid choice ");
		          System.exit(0);
		}
	}
}