// Problem: Find the Largest Element in an Array
//Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Main {
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 1, 12, 5};
        if(arr.length==0){
          System.out.println("Empty Array");
        }
        int result = findLargest(arr);
        System.out.println(result);
    }
}
