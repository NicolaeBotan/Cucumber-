package com.etsy.notworking;

public class NotWorkingEtsy {
    public static void main(String[] args) {
        String word = "Adrenaline";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(reversedWord);
    }
}
