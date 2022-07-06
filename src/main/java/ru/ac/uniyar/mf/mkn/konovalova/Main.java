package ru.ac.uniyar.mf.mkn.konovalova;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        String str = in.next();
        String num3 = in.next();
        String result1 = calculate(num1, str, num3);
        System.out.println(result1);
        //System.out.println(num1 + " " + str + " " + num3);
        /*String[] parts1 = num1.split("/");
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
                   t3 = Integer.parseInt(parts2[0]);
                   t4 = 1;
               }
               System.out.println(t1+ " " +t2 +" "+t3 +" " + t4);
               int r1 = 1;
               int r2 = 1;
               switch (str) {
                   case "+":
                       if (t4 == 0 || t2 == 0)
                           System.out.println("Некорректная дробь");
                       r2 = t2 * t4;
                       r1 = (r2 / t2 * t1) + (r2 / t4 * t3);
                       break;
                   case "-":
                       if (t4 == 0 || t2 == 0)
                           System.out.println("Некорректная дробь");
                       r2 = t2 * t4;
                       r1 = (r2 / t2 * t1) - (r2 / t4 * t3);
                       break;
                   case "*":
                       if (t4 == 0 || t2 == 0)
                           System.out.println("Некорректная дробь");
                       r1 = t1 * t3;
                       r2 = t2 * t4;
                       break;
                   case "/":
                       if (t4 == 0 || t2 == 0 || t3 == 0)
                           System.out.println("Деление на 0 невозможно");
                       else {
                           r1 = t1 * t4;
                           r2 = t2 * t3;
                       }
                       break;
                   default:
                       System.out.println("Ошибка, некоректный ввод");
               }
               int c = 0, a = 0, b = 0;
               a = r1;
               b = r2;
               while (b>0)
               {
                   c = a%b;
                   a = b;
                   b = c;
               }
               r1 = r1/a;
               r2 = r2/a;
               if (r2 == 1)
                   System.out.println(r1);
               else
                   System.out.println(r1 + "/" + r2);
           }

           else {
               //String result = calculate(num1, str, num3);
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
           }*/

        }
    public static String calculate(String num1, String str, String num3) {
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
                t3 = Integer.parseInt(parts2[0]);
                t4 = 1;
            }
            //System.out.println(t1+ " " +t2 +" "+t3 +" " + t4);
            int r1 = 1;
            int r2 = 1;
            switch (str) {
                case "+":
                    if (t4 == 0 || t2 == 0)
                        //System.out.println("Некорректная дробь");
                        return  "Некорректная дробь";
                    r2 = t2 * t4;
                    r1 = (r2 / t2 * t1) + (r2 / t4 * t3);
                    break;
                case "-":
                    if (t4 == 0 || t2 == 0)
                        return "Некорректная дробь";
                    r2 = t2 * t4;
                    r1 = (r2 / t2 * t1) - (r2 / t4 * t3);
                    break;
                case "*":
                    if (t4 == 0 || t2 == 0)
                        return "Некорректная дробь";
                    r1 = t1 * t3;
                    r2 = t2 * t4;
                    break;
                case "/":
                    if (t4 == 0 || t2 == 0 || t3 == 0)
                        return "Деление на 0 невозможно";
                    else {
                        r1 = t1 * t4;
                        r2 = t2 * t3;
                    }
                    break;
                default:
                    return"Ошибка, некоректный ввод";
            }
            int c = 0, a = 0, b = 0;
            a = r1;
            b = r2;
            while (b>0)
            {
                c = a%b;
                a = b;
                b = c;
            }
            r1 = r1/a;
            r2 = r2/a;
            String r11 = String.valueOf(r1);
            String r22 = String.valueOf(r2);
            if (r2 == 1) {
                return r11;
            }
            else
                return r11+ "/" + r22;
        }

        else {
            int n1 = Integer. parseInt(num1);
            int n3 = Integer.parseInt(num3);
            int result = 0;
            switch (str) {
                case "+":
                    result = n1 + n3;
                    String R1 = String.valueOf(result);
                    return R1;
                    //break;
                case "-":
                    result = n1 - n3;
                    String R2 = String.valueOf(result);
                    return R2;
                    //break;
                case "*":
                    result = n1 * n3;
                    String R3 = String.valueOf(result);
                    return R3;
                    //break;
                case "/":
                    if (n3 == 0)
                        return "Деление на 0 невозможно";
                    else {
                        result = n1 / n3;
                        String R4 = String.valueOf(result);
                        return R4;
                    }
                    //break;
                default:
                    return"Ошибка, некоректный ввод";
            }
        }
    }
}

