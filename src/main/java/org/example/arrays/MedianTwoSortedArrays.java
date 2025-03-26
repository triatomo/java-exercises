package org.example.arrays;

public class MedianTwoSortedArrays {
    public int[] mergedSortedArrays(int[] nums1, int[] nums2) {
        int[] total = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        // i < 2 && j < 1
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                total[k] = nums1[i];
                i++;
            } else {
                total[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            total[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            total[k] = nums2[j];
            j++;
            k++;
        }
        return total;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = mergedSortedArrays(nums1, nums2);
        double median;

        // If even -> get number in the middle
        // If odd -> get the average of the two middle numbers
        if (merged.length % 2 != 0) {
            median = merged[merged.length / 2];
        } else {
            median = (merged[(merged.length / 2)-1] + merged[merged.length / 2]) / 2;
        }
        return median;
    }
}
