import java.util.ArrayList;
import java.util.List;

public class UnionSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        List<Integer> union1 = findUnion(nums1, nums2);
        System.out.println(union1);  // Output: [1, 2, 3, 4, 5, 7]

        int[] nums3 = {3, 4, 6, 7, 9, 9};
        int[] nums4 = {1, 5, 7, 8, 8};

        List<Integer> union2 = findUnion(nums3, nums4);
        System.out.println(union2);  // Output: [1, 3, 4, 5, 6, 7, 8, 9]
    }

    public static List<Integer> findUnion(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            // Skip duplicates within each array
            while (i > 0 && i < nums1.length && nums1[i] == nums1[i - 1]) i++;
            while (j > 0 && j < nums2.length && nums2[j] == nums2[j - 1]) j++;

            if (i >= nums1.length || j >= nums2.length) break;

            if (nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                result.add(nums2[j]);
                j++;
            } else {  // Equal elements, include once
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from nums1
        while (i < nums1.length) {
            if (i == 0 || nums1[i] != nums1[i - 1]) {
                result.add(nums1[i]);
            }
            i++;
        }

        // Add remaining elements from nums2
        while (j < nums2.length) {
            if (j == 0 || nums2[j] != nums2[j - 1]) {
                result.add(nums2[j]);
            }
            j++;
        }

        return result;
    }
}
