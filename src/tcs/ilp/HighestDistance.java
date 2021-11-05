package tcs.ilp;

import java.util.ArrayList;
import java.util.Collections;

public class HighestDistance 
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		double arr[]= {42.195,42.195,33.25,40,41.2,38.9,37.5};
		int flag=1;
		ArrayList<Double> temp = new ArrayList<Double>();

		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				//System.out.println("Invalid input");
				flag=0;
				break;
			}
			else if(arr[i]!=42.195)
					temp.add(arr[i]);
		}
		
		if(flag==1)
		{
			int totsize = temp.size();
			if(totsize<=2)
				System.out.println(temp);
			else
			{
				Collections.sort(temp);
				ArrayList<Double> res = new ArrayList<Double>(); 
				res.add(temp.get(totsize-1));
				res.add(temp.get(totsize-2));
				res.add(temp.get(totsize-3));
				System.out.println(res);
			}
		}
		else
			System.out.println("Invalid Input");
		
	}
}
