import java.util.*;
 class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thr size of array");
        int n=sc.nextInt();
       // int temp;
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        System.out.println("\nBubble sorting-before sorting");
        for(int m=0;m<n;m++){
            System.out.print(array[m]+" ");
        }

        for(int i=0;i<n-1;i++){//639
           // int min_idx=i;//0
            for(int j=0;j<n-i-1;j++)//1<0(f)
               if(array[j]>array[j+1]){
                  // min_idx=j;
                  int temp=array[j];
                  array[j]=array[j+1];
                  array[j+1]=temp;
               }
        }
        System.out.println("\nBuble sorting-after sorting");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}