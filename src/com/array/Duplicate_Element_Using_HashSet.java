package com.array;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Element_Using_HashSet {
    public static void main(String[] args) {

        int[] arr = {12,34,5,6,5,67,88,90,42,12};

        Set<Integer> duplicate = new HashSet<>();

         for(Integer num : arr){
             if(!duplicate.add(num)){
                 System.out.println("Duplicate element is :"+num);
             }
         }
    }
}
