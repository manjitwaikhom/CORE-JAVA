package com.DSA.arrays;

public class MaximumSubarraySum_KadanesAlgorithm {
    public static void main(String[] args) {
        Integer[] arr ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSumOfArray(arr));

    }

    public static Integer maxSumOfArray(Integer[] arr){
        Integer maxSum=0;
        Integer currentSumArray=0;

        for(int i=0;i<arr.length;i++){
            currentSumArray= Math.max(arr[i],currentSumArray+arr[i]);
            maxSum= Math.max(maxSum,currentSumArray);
        }

        return maxSum;
    }
}
