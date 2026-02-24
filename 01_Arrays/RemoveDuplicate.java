// Problem: Remove Duplicates from Sorted Array 
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class remdup {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("after removing duplicates");
        for(int j=0;j<=i;j++){
            System.out.println(arr[j]+ " ");
        }
}
}
