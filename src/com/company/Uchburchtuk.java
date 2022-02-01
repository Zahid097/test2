package com.company;

public class Uchburchtuk {

    int a;
    int b;
    int c;
    void area(int a, int b, int c){
        int i = (a + b + c) /2;
        System.out.print(Math.sqrt(i*(i-a)*(i-b)*(i-c)));
    }

}
