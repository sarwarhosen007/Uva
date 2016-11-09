import java.util.*;
import java.lang.*;
import java.io.*;


class Cola
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		float coca=((float)n*3-1)/2;
		int nearestValue=(int)Math.ceil(coca);
        System.out.println(nearestValue);
		
		}
	 
	}
}