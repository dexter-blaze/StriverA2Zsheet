public class RotatedSortedArrayCheck {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};

        System.out.println(isRotatedSorted(nums1)); 
        System.out.println(isRotatedSorted(nums2)); 
        System.out.println(isRotatedSorted(nums3)); 
    }

    public static boolean isRotatedSorted(int[] nums) {
        int count = 0;
        int n = nums.length;

        //Explain Logic
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            if (nums[i] > nums[next]) {
                count++;
            }
        }

        // Only one rotation point allowed
        return count <= 1;
    }
}
