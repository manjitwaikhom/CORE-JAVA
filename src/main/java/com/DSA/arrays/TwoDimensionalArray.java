package com.DSA.arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
	/*String [][] _2DArray=new String[4][4];
	int width=4;
	int breath=4;
	
	
	
	//initialization
	int count=0;
	for(int i=0;i < width;i++) {
	    for(int j=0;j<breath;j++) {
		_2DArray[i][j]=Integer.toString(count);
		count++;
	    }
	}*/
	
	int [][] _2DArray= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
	
	
	//Display
	
	for(int i=0;i < _2DArray.length;i++) {
	    for(int j=0;j<_2DArray[0].length;j++) {
		System.out.print(_2DArray[i][j]+" ");
	    }
	    System.out.println("");
	}

    }

}
