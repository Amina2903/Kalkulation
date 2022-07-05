package ru.ac.uniyar.mf.mkn.konovalova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        String str = in.next();
        int num3 = in.nextInt();
        int t = 2;
        System.out.println(num1 + " " + str + " " + num3);
        int result = 0;
        switch (str) {
            case "+":
                result = num1 + num3;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num3;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num3;
                System.out.println(result);
                break;
            case "/":
                if(num3 == 0)
                    System.out.println("Деление на 0 невозможно");
                else {
                    result = num1 / num3;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Ошибка, некоректный ввод");
        }
        }
    }

