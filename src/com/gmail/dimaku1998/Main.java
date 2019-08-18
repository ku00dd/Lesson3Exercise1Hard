/*1) С помощью цикла (только одного) нарисовать такую фигуру. Причем
максимальная высота этой фигуры вводиться с клавиатуры (в примере
максимальная высота - 4)
*
**
***
****
***
**
*   */
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height = ");
        byte height = sc.nextByte();
        byte i = 1;
        byte count = 1;
        do {
            System.out.print('*');
            if (count == i){
                System.out.println();
                if (i <height) {
                    i++;
                }else {
                    i--;
                    height--;
                }
                count = 1;
                continue;

            }
            count++;
        } while (height != 0);
    }
}
