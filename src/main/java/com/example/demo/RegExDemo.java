package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

    public static void main(String[] args) {
        String regExString = "^[0-9][A-Z][0-9][0-9]$";
        Pattern pattern = Pattern.compile(regExString);

        Matcher matcher = pattern.matcher("3A11");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found.");
        } else
            System.out.println("Match not found !!!");
    }
}
