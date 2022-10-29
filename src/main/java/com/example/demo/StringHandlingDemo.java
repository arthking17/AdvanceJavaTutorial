package com.example.demo;

import java.util.Arrays;

public class StringHandlingDemo {

    public static void main(String[] args) {

        String string1 = "I'm eating ";
        String string2 = "a banana.";

        System.out.println("String1 has a length of " + string1.length());
        System.out.println(string1.concat(string2));

        String formatString = String.format("The name of the student is %s, and his age is %d.", "John", 20);
        System.out.println(formatString);

        System.out.println(string1.charAt(5));

        System.out.println(string1.indexOf('5'));

        System.out.println(string1.replace('i', 'z'));
        System.out.println(string1);

        String[] splStrings = string1.concat(string2).split(" ");
        Arrays.asList(splStrings).forEach(s -> System.out.println(s));

        System.out.println(string1.substring(1, 5));
    }
}
