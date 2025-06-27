public class RotateArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums1, 3);
        printArray(nums1); // Output: [5, 6, 7, 1, 2, 3, 4]

        int[] nums2 = {-1, -100, 3, 99};
        rotate(nums2, 2);
        printArray(nums2); // Output: [3, 99, -1, -100]
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Handle k > n

        reverse(nums, 0, n - 1);     // Step 1: reverse whole array
        reverse(nums, 0, k - 1);     // Step 2: reverse first k elements
        reverse(nums, k, n - 1);     // Step 3: reverse rest
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
