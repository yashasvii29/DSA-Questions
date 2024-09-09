public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; // Not enough elements
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
                
                
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        return (max2 == Integer.MIN_VALUE) ? null : max2;
    }

    public static void main(String[] args) {
        int[] arr = {12, 1, 10, 34, 1 ,80};
        int result = findSecondLargest(arr);
        if (result != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + result);
        } else {
            System.out.println("There is no max2 largest element.");
        }
    }
}
