package com.pattern;

public class Square_Pattern_with_Alphabet_2 {
    /*
     a b c d e
     a b c d e
     a b c d e
     a b c d e
     a b c d e
     */
    public static void main(String[] args) {
        char i;
        char j;

        for(i = 'a';i<='e';i++){
            for(j='a';j<='e';j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
