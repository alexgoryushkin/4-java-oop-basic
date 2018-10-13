package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 21);
        Complex b = new Complex(13, -2);
        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());
        String res = Complex.sum(a, b).toString();
        System.out.println("a + b = " + res);
        res = Complex.mul(a, b).toString();
        System.out.println("a * b = " + res);
    }
}
