// Problem: Find the Second Largest Element in an Array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
    
        int lar = arr[0];
        int slar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > lar) {
                slar = lar;
                lar = arr[i];
            } 
            else if (arr[i] > slar && arr[i] < lar) {
                slar = arr[i];
            }
        }

        if (slar == Integer.MIN_VALUE) {
            return -1;
        }
        return slar;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 1, 12, 5};
        if(arr.length < 2){
            System.out.println("-1");
        }
        int result = findSecondLargest(arr);
        System.out.println( result);
    }
}
