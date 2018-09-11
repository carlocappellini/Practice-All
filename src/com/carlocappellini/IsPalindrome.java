package com.carlocappellini;

public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome(9999);
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;


        while (number != 0) {

            int remainder = number % 10;
            System.out.println(remainder);
            reverse = remainder * 10 + remainder;
            System.out.println(reverse);
            number = number /10;
            System.out.println(number);


            if (number == reverse || remainder == number) {

                System.out.println("Number Is Palindrome ");
                return true;

            }
        }
        return false;
    }

}




