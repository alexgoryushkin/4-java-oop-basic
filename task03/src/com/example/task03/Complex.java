package com.example.task03;

public class Complex {
    private double re;
    private double im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double re) {
        this.re = re;
        this.im = 0;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex sum(Complex c1, Complex c2) {
        double re = c1.re + c2.re;
        double im = c1.im + c2.im;
        return new Complex(re, im);
    }

    public static Complex mul(Complex c1, Complex c2) {
        double re = c1.re * c2.re - c1.im * c2.im;
        double im = c1.re * c2.im + c1.im * c2.re;
        return new Complex(re, im);
    }

    public String toString() {
        if (im > 0 && re != 0)
            return String.format("%f+%fi", re, im);
        else if (im < 0 && re != 0)
            return String.format("%f%fi", re, im);
        else if (im == 0 && re != 0)
            return String.format("%f", re);
        else
            return String.format("%f", im);
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
}
