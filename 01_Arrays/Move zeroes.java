// Move all Zeros to the end of the array
// Time Complexity: O(N)
// Space Complexity: O(1)

import java.util.*;
public class movezero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int[] arr=new int [n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                i=j;
                break;
            }
        }
        for(int j=i+1;j<n;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println("after moving zeroes");
         for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
}
