package epam.task4_cost;

import java.util.*;

class estimate
{
	estimate(int standard , int area , int choice)
	{
	  int st=standard;
	  int ar=area;
	  int ch=choice;
	}
	long calc(int st,int ar,int ch)
	{
	long prod;
	switch(st)
	{
	case 1:
		prod=1200*ar;
		break;
	case 2:	
		prod=1500*ar;
		break;
	case 3:
		prod=1800*ar;
		break;
	case 4:
		prod=2500*ar;
		break;
	default :
		prod=0;
		System.out.println("Please do enter a valid choice");
		System.exit(0);	
	}
	if (ch==1) prod=2500*ar;
	return prod;
	}
}
