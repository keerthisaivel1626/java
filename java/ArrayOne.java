import java.util.*;
public  class ArrayOne {
    public static void findSum(int a[],int s){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==s){
                    System.out.println("pare of element is"+a[i] +"and"+a[j]);
                }
            }
        }
    }

    public static void findsortSum(int a[],int s){
        Arrays.sort(a);
        int first=0;
        int last=a.length-1;
        while(first<last){
            if(a[first]+a[last]==s){
                System.out.println("pare of element is"+a[first] +"and"+a[last]);
            }
            if(a[first]+a[last]<s){
                first++;
            }else{
                last--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the sum value");
        int sum=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array value");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        findSum(arr,sum);
        findsortSum(arr,sum);
        System.out.println("optimal solution");
        ArraysMap(arr,sum);

    }
    public static void ArraysMap(int a[],int s){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(s-a[i])){
                System.out.println("pare of element is"+map.get(s-a[i]) +"and"+a[i]);
                return;
            }
            map.put(a[i],i);
        }
    }
}