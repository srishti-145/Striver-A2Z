// Find the Missing Number
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class findmissing {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=n+1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int s2=m*(m+1)/2;
        int missing=s2-sum;
        System.out.println("missing element is"+" "+missing);
    }
}
