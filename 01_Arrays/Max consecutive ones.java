// Count Maximum Consecutive One's in the array
// Time complexity:o(n)
// Space complexity:o(n)

import java.util.*;
public class one {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
                max=Math.max(max,c);
            }
            else{
                c=0;
            }
        }
        System.out.println("maximum consecutive ones is"+" "+max);
    }
    
}
