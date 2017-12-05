package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here:
        while (repeatQuestion != 0) {
            System.out.println("Введите предел поиска автоморфных чисел - N");
            long N = scanner.nextInt();
            for (long i = 1; i < N; i++) {
                if (i == i * i % 10 || i == i * i % 100 || i == i * i % 1000 || i == i * i % 10000 || i == i * i % 100000 || i == i * i % 1000000 || i == i * i % 10000000 || i == i * i % 100000000 || i == i * i % 1000000000) {
                    System.out.println(i);
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion == 1) continue here;
            else break;
        }
    }
}
