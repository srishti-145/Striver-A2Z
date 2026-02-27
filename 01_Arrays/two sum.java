// Two Sum : Check if a pair with given sum exists in Array
// Time Complexity: O(n log n)
// Space Complexity:O(1)

import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int[] arr=new int [n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
         
        int p=0;
        int j=n-1;
       
        while(p<j){
            int sum=arr[p]+arr[j];
            if(sum==k){
                System.out.println(arr[p]+" "+arr[j]);
                p++;
                j--;
            }
            else if(sum>k){
                j--;
            }
            else{
                p++;
            }
        }
    }
    
}

