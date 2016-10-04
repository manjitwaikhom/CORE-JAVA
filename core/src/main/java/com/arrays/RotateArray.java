package com.arrays;

class RotataArray{
public static void main(String []arg){

int arr[]={1,2,3,4,5,6};
int positions=2;

int temp;
    int length = arr.length;

    for(int i=0; i<positions; i++){
        temp = arr[i];
        arr[i] = arr[length - (positions - i)];
        arr[length - (positions - i)] = arr[positions + i];
        arr[positions + i] = temp;          
    }
}
}