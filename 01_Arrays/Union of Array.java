// Union of Two Sorted Arrays
// Time Complexity: O(m+n)
// Space Complexity : O(m+n)

import java.util.*;

public class union {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of first array");
        int n=sc.nextInt();
        int []arr1=new int [n];
        System.out.println("enter elements of first array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter length of second array");
        int m=sc.nextInt();
        System.out.println("enter elements of second array");
        int []arr2=new int [m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        List<Integer> union= new ArrayList<>();
        int i=0, j=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                
            }
            else if(arr2[j]<arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
            
        }
        while(j<m){
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
            
        }
        System.out.println("after union ");
        for(int k=0;k<union.size();k++){
            System.out.print(union.get(k)+" ");
        }
        
    }
    
}
