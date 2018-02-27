package com;

import java.util.Random;

public class Solution {
    public static void main(String[] args){

        //--------------блок инициализации--------------------
        int n = 10, nPoVelichine = 4;
        int[] numArray = new int[n];
        Random rnd = new Random();
        //----------------------------------------------------

        for (int i = 0; i < numArray.length; i ++){                                                                         //
            numArray[i] = rnd.nextInt(100);                                                                           //Напоолнение массива рандомными значениями от 0 до 99 и поиск максимального элемента в массиве
        }                                                                                                                   //
        bubbleSort(numArray);                                                                                               //Вызов метода сортировки массива пузырьком.
        System.out.print(nPoVelichine + " по величине элемент набора чисел = " + numArray[numArray.length-nPoVelichine]);   //Вывод n-ого по величине элемента набора чисел.
    }

    //--------------Метод сортировки пузырьком-----------
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
            }
        }
    }
    //----------------------------------------------------
}