public class LinearSearch {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5, 3};
        int target1 = 3;
        System.out.println(findFirstIndex(nums1, target1)); // Output: 1

        int[] nums2 = {2, -4, 4, 0, 10};
        int target2 = 6;
        System.out.println(findFirstIndex(nums2, target2)); // Output: -1
    }

    public static int findFirstIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;  // First match found
            }
        }
        return -1; // Not found
    }
}
