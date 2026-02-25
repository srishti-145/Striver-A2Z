// Find the number that appears once, and the other numbers twice

import java.util.*;
public class num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int xorr=0;
        for(int i=0;i<n;i++){
            xorr=xorr^arr[i];
        }
        System.out.println("single number is"+" "+xorr);
    }
    
}
