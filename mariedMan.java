import java.util.*;
import java.lang.*;
import java.io.*;


class mariedMan
{
	public static void main (String[] args)  
	{
      Scanner sc=new Scanner(System.in);
 		int t = sc.nextInt();
		for(int i = 0; i<t; i++){
			String ws = sc.next();
			String we = sc.next();
			String ms = sc.next();
			String me = sc.next();
			
			int wsi = Integer.parseInt(ws.substring(0,2));
			int wei = Integer.parseInt(ws.substring(0,2));
			int msi = Integer.parseInt(ms.substring(0,2));
			int mei = Integer.parseInt(ms.substring(0,2));
 
			if((wsi > msi) &&(wei > mei) ){
				System.out.println("Case " + (i+1) + ":" + " Hits Meeting");
			}else if(wsi==wei){
				System.out.println("Case " + (i+1) + ":" + " Hits Meeting");
			}
			else{
				System.out.println("Case " + (i+1) + ":" + " Mrs Meeting");
			}
			
		}
 	    
	}
}