package com.example;

public class App {

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        System.out.println(new App().sayHello());
    }
}
