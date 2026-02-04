package com.DSA.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        new LongestCommonPrefix().longestCommonPrefix(strs);
    }

    public void longestCommonPrefix(String[] strs){
        int shortestStringLength=100;
        for(String s:strs){
            if(s.length() < shortestStringLength){
                shortestStringLength=s.length();
            }

        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<shortestStringLength -1 ;i++){
            System.out.println();
        }

    }
}
