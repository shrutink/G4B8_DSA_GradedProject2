package com.gl.building;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

import com.gl.building.*;

public class BuildingFloorMain {
	public static void main(String[] args)

	{
		int k=0;
		
		System.out.println("enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = n;

		Queue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());

		int disks[] = new int[n];
		int b[] = new int[n];

		for (int i = 0; i < n; i++)

		{
			System.out.println("enter the floor size given on day :" + (i + 1));
			disks[i] = sc.nextInt();

			queue.add(disks[i]);
		}
		while (!queue.isEmpty() && queue.peek() == max && k<disks.length)

		{

			b[k]=queue.poll();

			max--;
			k++;

		}
		System.out.println("The order of construction is as follows");
		for(int p=0;p<b.length+1;p++)
		{
				for(int q=p;q<disks.length;q++)
			{
					
					
				if(disks[q]==b[p])
				{
					System.out.println("");
					System.out.println("Day:"+(q+1));
					for(int r=p;r<=q;r++) 
					{
						System.out.print(b[r]);
						System.out.print(" ");
					}
					
				}
				
			}
		}
		System.out.println();

	}



}
