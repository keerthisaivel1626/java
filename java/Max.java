import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Height arr[]=new Height[n];
            for(int i=0;i<n;i++)
            {
            int temp1=sc.nextInt();
            int temp2=sc.nextInt();
             arr[i]= new Height(temp1,temp2);
            }
            Maxvalue m=new Maxvalue();
            System.out.println(m.findMax(arr,n));

        }
    }
}
class Height{
    int feet;
    int inches;
    Height(int f,int inc){
        feet=f;
        inches=inc;
    }
}
class Maxvalue{
    public int findMax(Height arr[],int n){
        int max=-1;
        int min;
        for(Height h:arr){
            min=h.feet*12+h.inches;
            if(max<min){
                max=min;
            }else{
                min=max;
            }
        }
       return max;
    } 
}