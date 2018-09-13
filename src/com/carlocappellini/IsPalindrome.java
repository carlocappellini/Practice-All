package com.carlocappellini;

public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome(999999);
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10; // 9
            reverse = reverse * 10 + remainder;
            number = number / 10;

            System.out.println(number);

            if (number == reverse || reverse == number) {

                System.out.println("Palindrome");
                return true;
            }


        }


        return false;
    }
}




