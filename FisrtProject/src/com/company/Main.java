package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world");
    int a, b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Nhập vào số a: ");
        a = keyboard.nextInt();
        System.out.println("Nhập vào số b");
        b = keyboard.nextInt();

    if (a > b) {
            System.out.println("a = "+ a + " 10là số lớn nhất");
        }
        else if (a==b)
        {
        System.out.println(a + "và"+ b +"bằng nhau");
        }
        else
        {
        System.out.println(a + "nhỏ hơn"+ b);
        }
    }
}
