public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {10, 10, 10, 10}; // Example array

        int secondLargest = findSecondLargest(nums);
        System.out.println("Second largest element: " + secondLargest);
    }

    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            return -1; // Not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
