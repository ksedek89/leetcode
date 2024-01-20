package pl.aswit.leetcode.medium.task88;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = 0;
        for (int k = m; k < (m+n); k++) {
            nums1[k] = nums2[counter++];
        }
        Arrays.sort(nums1);

    }
}


