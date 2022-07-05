package ru.ac.uniyar.mf.mkn.konovalova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        String str = in.next();
        String num3 = in.next();
        //System.out.println(num1 + " " + str + " " + num3);

        String[] parts1 = num1.split("/");
           int p1 = parts1.length;
        String[] parts2 = num3.split("/");
        int p2 = parts2.length;
           if( p1 != 1 || p2 != 1) {
               int t1 = 1;
               int t2 = 1;
               int t3 = 1;
               int t4 = 1;
               if (p1 != 1) {
                   t1 = Integer.parseInt(parts1[0]);
                   t2 = Integer.parseInt(parts1[1]);
               } else {
                   t1 = Integer.parseInt(parts1[0]);
                   t2 = 1;
               }
               if (p2 != 1) {
                   t3 = Integer.parseInt(parts2[0]);
                   t4 = Integer.parseInt(parts2[1]);
               } else {
                   t3 = Integer.parseInt(parts1[0]);
                   t4 = 1;
               }
               int r1 = 1;
               int r2 = 1;
               switch (str) {
                   case "+":
                       if (t4 == 0 || t2 == 0)
                           System.out.println("Некорректная дробь");
                       r2 = t2 * t4;
                       r1 = (r2 / t2 * t1) + (r2 / t4 * t3);
                       if(r2 == 1)
                           System.out.println(r1);
                       else
                       System.out.println(r1 + "/" + r2);
                       break;
                   case "-":
                       if (t4 == 0 || t2 == 0)
                           System.out.println("Некорректная дробь");
                       r2 = t2 * t4;
                       r1 = (r2 / t2 * t1) - (r2 / t4 * t3);
                       if(r2 == 1)
                           System.out.println(r1);
                       else
                       System.out.println(r1 + "/" + r2);
                       break;
                   case "*":
                       if (t4 == 0 || t2 == 0)
                           System.out.println("Некорректная дробь");
                       r1 = t1 * t3;
                       r2 = t2 * t4;
                       if(r2 == 1)
                           System.out.println(r1);
                       else
                       System.out.println(r1 + "/" + r2);
                       break;
                   case "/":
                       if (t4 == 0 || t2 == 0 || t3 ==0)
                           System.out.println("Деление на 0 невозможно");
                       else {
                           r1 = t1 * t4;
                           r2 = t2 * t3;
                           if(r2 == 1)
                               System.out.println(r1);
                           else
                           System.out.println(r1 + "/" + r2);
                       }
                       break;
                   default:
                       System.out.println("Ошибка, некоректный ввод");
               }
           }

           else {
               int n1 = Integer. parseInt(num1);
               int n3 = Integer.parseInt(num3);
               int result = 0;
               switch (str) {
                   case "+":
                       result = n1 + n3;
                       System.out.println(result);
                       break;
                   case "-":
                       result = n1 - n3;
                       System.out.println(result);
                       break;
                   case "*":
                       result = n1 * n3;
                       System.out.println(result);
                       break;
                   case "/":
                       if (n3 == 0)
                           System.out.println("Деление на 0 невозможно");
                       else {
                           result = n1 / n3;
                           System.out.println(result);
                       }
                       break;
                   default:
                       System.out.println("Ошибка, некоректный ввод");
               }
           }
        }
    }

