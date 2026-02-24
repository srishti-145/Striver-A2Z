// Problem: Check if an Array is Sorted
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class checksorted {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                ans=false;
                break;
        }
    }
    if(ans){
        System.out.println("sorted");
    }
    else{
        System.out.println("not sorted");
    }
}

}
