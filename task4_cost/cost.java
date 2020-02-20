package epam.task4_cost;

import java.util.*;

class cost
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the type of material standard");
		System.out.println("1.Standard  2.Above standard  3.High Standard  4.High Standard");
		int choice = sc.nextInt();
        System.out.println("Enter the area of the house (in square feet)");
        int area=sc.nextInt();
        System.out.println("Select the choice of fully automated home  : 1.Yes    2.No");
        int ac=sc.nextInt();
        estimate es=new estimate(choice,area,ac);
        System.out.println(es.calc(choice, area, ac));
        
	}
}