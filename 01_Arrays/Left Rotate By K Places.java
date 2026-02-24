// Left Rotate Array by K Places
// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.*;
public class kplaces {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] arr=new int [n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotated(arr,n,k);
        System.out.println("after rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] rotated(int []arr,int n,int k){
        if(n==0 || k==0 || k%n==0){
            return arr;
        }
        k=k%n;


        reverse(0,n-k-1,arr);
        reverse(n-k,n-1,arr);
        reverse(0,n-1,arr);
        return arr;
    }
    public static void reverse(int i,int j,int[]arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
}
