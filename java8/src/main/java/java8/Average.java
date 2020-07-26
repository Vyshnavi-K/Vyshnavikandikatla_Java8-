package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Average 
{
	static void calculateavg(List<Integer> list)
	{
		 list.stream() 
	    .mapToInt(i -> i) 
	    .average() 
	    .ifPresent(avg -> System.out.println("Average found is " + avg));
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		System.out.println("Enter 5 numbers");
		int i;
		for(i=0;i<5;i++) 
		{
		    int j = sc.nextInt();
		    mylist.add(j);
		}
		calculateavg(mylist);
		
	}

}
