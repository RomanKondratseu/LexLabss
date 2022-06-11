package com.company.partone;

import java.util.Scanner;

public class TaskTree {
    public int task1(int a, int b) {
        int compare;
        System.out.println("сравнение чисел1");
        if (a < b) {
            compare = 7;
        } else {
            compare = 8;
        }
        return compare;
    }

    public String task2(int a, int b) {
        String compare;
        System.out.println("сравнение чисел2");
        if (a < b) {
            compare = "yes";
        } else {
            compare = "no";
        }
        return compare;
    }

    public String task3(int a, int b) {
        String compare;
        System.out.println("сравнение чисел3");
        if (a < b) {
            compare = "yes";
        } else {
            compare = "no";
        }
        return compare;
    }

    public String task4(int a, int b) {
        String compare = null;
        System.out.println("сравнение чисел4");
        if (a < b) {
            compare = "b больше a";
        }
        if (a > b) {
            compare = "a больше b";
        }
        if (a == b) {
            compare = "a равно b";
        }
        return compare;
    }


    public String task5(int a, int b) {
        String compare = null;
        System.out.println("сравнение чисел5");
        if (a < b) {
            compare = "a наименьшее";
        }
        if (a > b) {
            compare = "b наименьшее";
        }
        if (a == b) {
            compare = "a равно b";
        }
        return compare;
    }

    public String task6(int a, int b) {
        String compare = null;
        System.out.println("сравнение чисел6");
        if (a < b) {
            compare = "b наибольшее";
        }
        if (a > b) {
            compare = "a наибольшее";
        }
        if (a == b) {
            compare = "a равно b";
        }
        return compare;
    }

    public int task7(int a, int b, int c, int x) {
        int compare;
        System.out.println("сравнение чисел7");
        compare = a * x * x + b * x + c;
        return compare;
    }

    public String task8(int a, int b) {
        String compare = null;
        System.out.println("сравнение чисел8");
        if (a * a > b * b) {
            compare = "a больше b";
        }
        if (a * a < b * b) {
            compare = "b больше a";
        }
        return compare;
    }

    public String task9(int a, int b, int c) {
        String compare = null;
        System.out.println("сравнение чисел9");
        if (a == b && b == c) {
            compare = "треугольник равносторонний ";
        } else {
            compare = "no";
        }
        return compare;
    }

    public String task10(int R1, int R2) {
        String compare = null;
        System.out.println("сравнение чисел10");
        double s1 = 3.14 * R1 * R1;
        double s2 = 3.14 * R2 * R2;
        if (s1 > s2) {
            compare = "s1 больше s2 ";
        }
        if (s1 < s2) {
            compare = "s2 больше s1 ";
        }
        if (s1 == s2) {
            compare = "s1 равно s2 ";
        }
        return compare;
    }

    public static void main(String[] args) {
        TaskTree task = new TaskTree();
        System.out.println(task.task1(1, 2));
        System.out.println(task.task2(1, 2));
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(task.task3(a, 3));
        System.out.println(task.task4(1, 3));
        System.out.println(task.task5(3, 3));
        System.out.println(task.task6(4, 3));
        System.out.println(task.task7(1, 2, 3, 4));
        System.out.println(task.task8(4, 3));
        System.out.println("введите строны треугольника");
        Scanner input1 = new Scanner(System.in);
        int a9 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int b9 = input1.nextInt();
        Scanner input3 = new Scanner(System.in);
        int c9 = input1.nextInt();
        System.out.println(task.task9(a9, b9, c9));
        System.out.println(task.task10(30, 20));
    }
}
