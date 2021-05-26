package com.tms.hm13.task2;
/**
 * Программа выводит строку в обртном порядке или вычисляет факториал числа. Результат работы зависит от
 * команды пользователя.
 */

import java.util.Scanner;

public class FuncInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1, если хотите переписать строку в обратном порядке, и 2, если надо посчитать факториал.");
        String num = in.next();

        String line = "Good time!";
        Integer n = 4;

        if (num.equals("1")){
            MyFunInterface<String> doing1 = (str) -> {
                String strReverse = "";
                for (int i = 0; i < str.length(); i++){
                    strReverse = str.charAt(i) + strReverse;
                }
                return strReverse;
            };
            System.out.println("Выводит строку " + line + " в обратном порядке.");
            System.out.println(doing1.calculate(line));

        } else if (num.equals("2")){
            MyFunInterface<Integer> doing2 = (m) -> {
                Integer result = 1;
                for (int i = 1; i <= m; i++){
                    result *= i;
                }
                return result;
            };
            System.out.println(n + "! = " + doing2.calculate(n));

        }else{
            System.out.println("Команда не предусмотрена.");
        }

        in.close();
    }
}
