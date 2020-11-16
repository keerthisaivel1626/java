import java.util.*;
public class Dupli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("size");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("array");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();

            }
            System.out.println("without considring time and space");
            for(int i=0;i<size;i++)
            {
                for(int j=i+1;j<size;j++){
                    if(arr[j]==arr[i]){
                        System.out.print(arr[i]+" ");
                    }

                }
            }
            System.out.println("\n time & space");
            Set<Integer> s=new HashSet<Integer>();
            for(int i=0;i<size;i++){
                if(!s.add(arr[i])){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
} 