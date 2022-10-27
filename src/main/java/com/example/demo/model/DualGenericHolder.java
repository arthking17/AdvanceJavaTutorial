package com.example.demo.model;

public class DualGenericHolder<T, U> {
    
    T obj1;
    U obj2;

    public DualGenericHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        DualGenericHolder<String, Integer> obj = new DualGenericHolder<String,Integer>("Wi11i4m", 5);
        obj.display();
    }
}