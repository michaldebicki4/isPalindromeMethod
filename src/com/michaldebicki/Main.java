package com.michaldebicki;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class Main {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int n = number;
        while (n != 0)
        { reverse *= 10;
            lastDigit= n %10;

            n /= 10;
            reverse += lastDigit;


        }
        System.out.println(number);
        System.out.println(reverse);
        if(reverse == number)
            return true;
        else
            return false;
    }



    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(21));
        System.out.println(isPalindrome(10991));
        System.out.println(isPalindrome(-21));
        System.out.println(isPalindrome(-1));
        System.out.println(isPalindrome(1));

    }
}

