package com;

public class Solution {
    public static void main(String [] args){
        //---------------Блок инициализации-------------------
        int x = 5;                                  //Инициализация входящего числа x.
        int mnojitel = 2;                           //Инициализация первого множителя.
        int currentValue = x;                       //Инициализация переменной со входным значением, что бы оставить первичное значение
        //----------------------------------------------------

        while (currentValue > 1){                   //
            if (currentValue % mnojitel == 0){      //
                System.out.print(mnojitel + " ");   //
                currentValue /= mnojitel;           //
            }                                       //
            else if (mnojitel == 2){                //Цикл раложения входного значения на простые множители с выводом найденых множителей на экран.
                mnojitel ++;                        //
            }                                       //
            else mnojitel += 2;                     //
        }                                           //
        if (currentValue != 1){                     //
            System.out.println(currentValue);       //
        }

    }
}
