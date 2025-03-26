package org.example.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MedianTwoSortedArrays merged = new MedianTwoSortedArrays();
        int[] result1 = merged.mergedSortedArrays(new int[]{1, 3}, new int[]{2});
        int[] result2 = merged.mergedSortedArrays(new int[]{1, 2, 8, 9}, new int[]{2});

        System.out.println(Arrays.toString(result1));
        System.out.println(merged.findMedianSortedArrays(new int[]{1, 3}, new int[]{2,4}));

    }
}
