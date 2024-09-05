package com.string;

public class Reverse_String_using_StringBuilder {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println("original string :"+str);
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse String :"+sb.reverse());

    }
}
