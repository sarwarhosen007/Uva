import java.util.*;
import java.lang.*;
import java.io.*;
 

class WordCount
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);	  
      while(sc.hasNext()){		  
         String sentence = sc.nextLine();
		 
         String words[] = sentence.split("[,\\s]");;
         int count = words.length;
         System.out.println(count);		 
		  
	  } 
	}
}