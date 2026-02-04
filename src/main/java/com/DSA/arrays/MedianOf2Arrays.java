package com.DSA.arrays;

import java.util.Arrays;

public class MedianOf2Arrays {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4};
        int[] arr2 ={5,6,7,8,9};
        double result = new MedianOf2Arrays().findMedianSortedArrays(arr1,arr2);
        System.out.println(result);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,combinedArray,0, nums1.length);
        System.arraycopy(nums2,0,combinedArray,nums1.length, nums2.length);
        Arrays.sort(combinedArray);
        double result = findMedian(combinedArray);

    return result;
    }

    public static double findMedian(int[] nums) {

        int n = nums.length;

        if (n % 2 != 0) {
            return nums[n / 2];
        } else {
            return (nums[n/2 - 1] + nums[n/2]) / 2.0;
        }
    }

}
