package com.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfACharacter_Wipro {
    public static void main(String[] args) {
        String str="manjitmanja";

        //using streams
        Map<Character,Long> freq=str.chars().mapToObj(c->(char) c ).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Using Streams: "+freq);



        //using loop
        Map<Character,Long> freq2=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(freq2.containsKey(str.charAt(i))){
                freq2.put(str.charAt(i),freq2.get(str.charAt(i))+1);
            }else{
                freq2.put(str.charAt(i),1L);
        }}
        System.out.println("Using Loop:    "+freq2);
    }
}
