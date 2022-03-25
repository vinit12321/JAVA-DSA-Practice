package com.leetcode.search;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 7, 8, 8, 8, 8, 10};
        int target = 7;
        int ans[];
        ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int arr[], int target, boolean startIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
