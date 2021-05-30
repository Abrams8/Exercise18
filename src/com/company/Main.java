package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array;
        array = new int[]{9, 8, 6, 2, 4, 5, 7, 6, 8, 99};
        findLastElement(array);
    }

    public static void findLastElement(int array[]) {
        System.out.println("Последний элемент массива = " + array[array.length - 1]);
    }
}
