import java.util.*;
public  class Largest {
   public  int findingSumOfSubArray(int a[],int n) {
       int min_sum=0,sum=0;
       for(int i=0;i<n;i++){
           sum=sum+a[i];//0
           if(sum>0){
               min_sum=sum;
           }if(min_sum<sum){
               min_sum=sum;
           }
       }
       return min_sum;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
            }
            Largest l=new Largest();
        System.out.print(l.findingSumOfSubArray(arr,size));
        }
    }
}