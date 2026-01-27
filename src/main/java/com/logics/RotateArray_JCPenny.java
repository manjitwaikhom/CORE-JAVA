package com.logics;

import java.util.Arrays;

public class RotateArray_JCPenny {


     static void bruteForceRotateArrayClockWise(int[] arr, int k) {
         // check invalid input
         k %= arr.length;
         System.out.print("Original         :");
         displayArr(arr);

         int temp;
         int previous;
         for (int i = 0; i < k; i++) {
             previous = arr[arr.length - 1];
             for (int j = 0; j < arr.length; j++) {
                 temp = arr[j];
                 arr[j] = previous;
                 previous = temp;
             }
         }
         System.out.print("Rotated ClockWise:");
         displayArr(arr);
     }

    static void bruteForceRotateArrayAntiClockWise(int[] arr, int k) {
        // check invalid input
        //k %= arr.length;

        System.out.print("Original               :");
        displayArr(arr);


        int temp;
        int previous;
        for (int i = 0; i < k; i++) {
            previous = arr[0];
            for (int j = arr.length-1; j >= 0; j--) {
                temp = arr[j];
                arr[j] = previous;
                previous = temp;
            }
        }
        System.out.print("Rotated Anti Clockwise :");
        displayArr(arr);
    }

     public static void displayArr(int [] x){
         System.out.print("[ ");
         for(int k:x){

             System.out.print(k+" ");

         }
         System.out.print("]");
         System.out.println("");
     }

    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5};
       bruteForceRotateArrayClockWise(arr,1);
        System.out.println("-------------------------");
       bruteForceRotateArrayAntiClockWise(arr,1);
    }

    }


