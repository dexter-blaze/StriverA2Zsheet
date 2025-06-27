public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        printArray(nums1);  // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        printArray(nums2);  // Output: [0]
    }

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // First pass: move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Second pass: fill the rest with 0
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
