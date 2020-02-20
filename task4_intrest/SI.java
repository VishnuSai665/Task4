package epam.task4_intrest;

import java.util.*;

class SI
{
	int p;long intrest;
	int r;
	int t;
	SI(int prin,int time,int rate)
	{
		p=prin;
		t=time;
		r=rate;
	}
	long intr()
	{
		//intrest=(p*t*r)/100;
		//System.out.println(intrest);
		//return intrest;
		return ((p*t*r)/100);
	}
}