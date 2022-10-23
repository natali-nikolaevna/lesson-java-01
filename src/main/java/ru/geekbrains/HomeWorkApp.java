package ru.geekbrains;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public  static void checkSumSign() {
        int a = -5;
        int b = 4;
        int c = a + b;

        if(c >= 0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int val = -1;

        if(val <= 0) {
            System.out.println("Красный");
        }else if ( val <=100 && val >0) {
            System.out.println("Желтый");
        }else
            System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 6;
        if (a >= b){
            System.out.println( "a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}