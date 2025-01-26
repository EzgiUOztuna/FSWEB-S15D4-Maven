package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Test için örnek:
        System.out.println(checkForPalindrome("radar")); // true
        System.out.println(checkForPalindrome("hello")); // false
    }

    public static boolean checkForPalindrome(String input) {
        String cleanedInput = input.toLowerCase();
        // Stack oluştur
        Stack<Character> stack = new Stack<>();

        // Giriş metninin her karakterini stack'e ekle
        for (int i = 0; i < cleanedInput.length(); i++) {
            stack.push(cleanedInput.charAt(i));
        }

        // Giriş metnini baştan sona kontrol et
        for (int i = 0; i < cleanedInput.length(); i++) {
            // Eğer stack'ten alınan karakter, metnin ilgili karakterine eşit değilse
            if (cleanedInput.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    //**************************************************************


    public static String convertDecimalToBinary(int n) {
        if(n == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>(); // Binary rakamları saklamak için Stack kullanıyoruz.

        while (n>0) {
            int remainder = n%2;
            stack.push(remainder);
            n /= 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }
        return binaryString.toString();
    }
}
