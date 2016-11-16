import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

class flag
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		for(int i = 0; i<t; i++){
			int length = sc.nextInt();
			double radius = (double)(length/5.0);
			 
			
			double Acircle = (Math.PI)*(Math.pow(radius,2));
			double width = (3*length)/5.0;
			double Tarea = width*length;
			double Garea = (Tarea-Acircle);
			
			DecimalFormat df = new DecimalFormat("####0.00");
            //double value = df.format(Aradius);
			System.out.print(df.format(Acircle));
			System.out.print(" ");
			System.out.print(df.format(Garea));
			System.out.println();
			
			

		}
	}
}