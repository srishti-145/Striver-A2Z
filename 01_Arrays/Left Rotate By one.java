// Problem: Rotate Array by One Place to the Left
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class rotate {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("after rotation");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
