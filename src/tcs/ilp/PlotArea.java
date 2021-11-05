package tcs.ilp;

import java.util.Scanner;

public class PlotArea {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		double len=sc.nextDouble();
		System.out.println("Enter breadth:");
		double width=sc.nextDouble();
		sc.close();
		
		double area=CalculateArea(len,width);
		System.out.println("Area:"+area);
	}

	public static double CalculateArea(double len, double width)
	{
		double area=0;
		area=len*width;
		return area;
	}
	}
