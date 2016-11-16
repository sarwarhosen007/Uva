import java.util.*;
import java.lang.*;
import java.io.*;

class square
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()){
			  int f = sc.nextInt();
			  int s = sc.nextInt();
              if(f == 0 && s == 0){
				  break;
			  }
			  int c = 0;
			  int t = f;
			  for(int i = f; i<=s; i++){
				  double sq = Math.pow(i,1.0/2);
				  if(sq % 1 == 0){
					  c++;
				  }
                 }
				 System.out.println(c);
			  }
			    
			  
		  
	}
}