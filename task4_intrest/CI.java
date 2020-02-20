package epam.task4_intrest;

import java.util.*;
import java.math.*;

class CI
{
	int p;double intrest;
	int r;
	int t;
	CI(int prin,int time,int rate)
	{
		p=prin;
		t=time;
		r=rate;
	}
	double intr()
	{
		float k=1+(r/100);
		double intr=Math.pow(k, t);
		intrest=p*intr;
		return intrest;
	}
}