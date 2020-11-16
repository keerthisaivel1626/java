
import java.util.*;
public class Binary{
   String binaryAdd(String a,String b){
      String result=" " ; 
       int i= s.length()-1;
       int j= s1.length()-1;
       int s=0;
       while(i>=0||j>>=0){
        s += ((i >= 0)? a.charAt(i) - '0': 0); 
        s += ((j >= 0)? b.charAt(j) - '0': 0); 

        // If current digit sum is  
        // 1 or 3, add 1 to result 
        result = (char)(s % 2 + '0') + result; 

        // Compute carry 
        s /= 2; 

        // Move to next digits 
        i--; j--; 
       }
return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Binary b=new Binary();
        String result=b.binaryAdd(s1,s2);
        System.out.println(result);
    }
}