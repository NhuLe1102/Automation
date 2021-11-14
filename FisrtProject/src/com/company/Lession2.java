package com.company;

import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lession2 {
    public static void main(String[] args) {
        double[] array;
        int[] array2 = new int[9];
        int arrayNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số phần tử của dãy là: ");
        arrayNumber = scanner.nextInt();
        array = new double[arrayNumber];
        inputArray(array);
        Max(array);
        Min(array);
        averageArray(array);
        sortArray(array2);

    }
    public static void inputArray(double array[]) {
        Scanner scanner = new Scanner(System.in);
        // tạo đối tượng scanner để nhập
        System.out.println("Moi nhap vao mang: ");
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
    }
    public static void Max(double[] array)
    {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Số lớn nhất là: " + max);
    }
     public static void Min(double[] array) {
         double min = array[0];
         for (int i = 0; i < array.length; i++)
             if (array[i] < min) {
                 min = array[i];
             }
         System.out.println("Số nhỏ nhất là: " + min);
     }
     public static void averageArray(double array[]){
         double total = 0;
         //double average = 0;
        for (int i =0; i <array.length; i++) total += array[i];
         double average = total/array.length;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Số trung bình cộng của mảng là: "+ decimalFormat.format(total) );

     }
     public static void sortArray (int array2[]){
        int[] a = {9, 3, 6, 4, 1, 9, 8, 2, 3};
        int temp = a[0];
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for (int i =0; i<a.length-1; i++){
            for (int j=i+1; j<a.length;  j++){
                if(a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println(a[i]);
        }
     }
}
