import java.util.*;
import java.lang.*;
import java.io.*;

class Kth {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
		    int n=scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        arr[i]=scan.nextInt();//011122445
		    }
		    Arrays.sort(arr);
            System.out.println("enter the k th value for largest number");
            int k=scan.nextInt();
            int j=0;
            for(int i=0;i<n-1;i++)
            {
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
          
            }
            arr[j++]=arr[n-1];
            int unique=j;
            for(int i=0;i<unique;i++){
                System.out.print(arr[i]);//0,1,2,4,5
            }
            System.out.println();
           
            System.out.println("answer"+ arr[k-1]);

		   //
		    
		}
	}
}