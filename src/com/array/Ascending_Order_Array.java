package com.array;

public class Ascending_Order_Array {
    public static void main(String[] args) {

        int[] arr = {122,23,76,43,78,6,43,2,12,1};

        System.out.print("Original array : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int temp = 0;
        for(int i = 0; i <arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\n sorted in ascending order : ");
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
