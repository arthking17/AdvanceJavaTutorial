package com.example.demo.enums;

public enum Color {
    BLUE("blue"), GREEN("green"), RED("red");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
