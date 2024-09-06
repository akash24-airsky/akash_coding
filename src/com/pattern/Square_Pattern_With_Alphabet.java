package com.pattern;

public class Square_Pattern_With_Alphabet {
    /*
         a a a a a
         b b b b b
         c c c c c
         d d d d d

     */
    public static void main(String[] args) {
        char i;
        char j;

        for(i = 'a';i<='d';i++){
            for(j='a';j<='d';j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
