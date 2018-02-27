package com;

import java.util.Random;

public class Solution {
    public static void main(String[] args){
        //--------------блок инициализации--------------------
        int n = 10, max = -2147483648, beforeMax = -2147483648;          //Инициализируем размер будующего массива "n" , переменную которая будет хранить масимальное значение "max", переменную которая будет хранить второе по величине значение "beforeMax".
        Integer[] numArray = new Integer[n];                             //Инициализация массива
        Random rnd = new Random();                                       //Создание объекта класса Random

        //----------------------------------------------------
        for (int i = 0; i < numArray.length; i ++){                      //
            numArray[i] = rnd.nextInt(100);                        //Напоолнение массива рандомными значениями от 0 до 99 и поиск максимального элемента в массиве
            if (max < numArray[i]){                                      //
                max = numArray[i];                                       //
            }
        }
        for (int i = 0; i < numArray.length; i ++){                      //
            if (beforeMax < numArray[i] && numArray[i] < max){           //Нахождение второго по величине значения в массиве
                beforeMax = numArray[i];                                 //
            }
        }
        System.out.println("Второй по величине элемент = " + beforeMax); //Вывод второго по величине элемента массива на экран
    }
}
