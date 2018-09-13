package com.carlocappellini;

public class ExtractWordsFromSentence {


    public static void main(String[] args) {
        String sentence = "Hello Red Dragon Carlo Purple Fire";

        System.out.println(sentence);
        String[] array = sentence.split(" ");

        for (String i : array) {
            System.out.println(i);
        }
    }

}

