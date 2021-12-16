package com.company;


public class TestClass implements TestInterface {

    int n = 10;

    public int getN(int a) {
        return n * a;
    }

    public static void main(String[] args) {
        TestClass mc = new TestClass();
        int x = mc.getN(5);
        System.out.print(x);
    }
}