package com.string;

public class Reverse_String_using_StringBuffer {
    public static void main(String[] args) {

        String rev = "hello";

        System.out.println("original string is :"+rev);
        StringBuffer sf = new StringBuffer(rev);

        System.out.println("Reverse string is :"+sf.reverse());
    }
}
