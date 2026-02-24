// Linear Search
// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.*;
public class linsearch {
    public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter length");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter target");
    int target=sc.nextInt();
    int j=-1;
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            j=i;
        }
    }
    System.out.println("target is at index"+j);
}
}
