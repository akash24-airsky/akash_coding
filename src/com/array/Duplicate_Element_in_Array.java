package com.array;

public class Duplicate_Element_in_Array {
    public static void main(String[] args) {

        int[] arr = {12,13,4,5,7,91,12,3,5,66,4};

        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is :"+arr[i]);                }
            }
        }
    }
}
