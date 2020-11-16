import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        
        Sum(arr);
        
    }
    
    
    
    
    private  static void Sum(int arr[][]){
            
            int sum=-1000;
            
            
            for (int r=0, c=0;r<arr.length-2;){
                if (c < arr[r].length-2) {
                    int top = arr[r][c]+arr[r][c+1]+arr[r][c+2];
                    int middle = arr[r+1][c+1];
                    int bottom = arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];
                    if(top+middle+bottom>sum){
                            sum=top+middle+bottom;
                     }
                    ++c;
                } else {
                    c = 0;
                    ++r;
                }
                
            }
            
            System.out.println(sum);
            
            
        }
}