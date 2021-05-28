package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int[] array = new int[10];
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Последний элемент массива = " + array[array.length - 1]);
    }
}
