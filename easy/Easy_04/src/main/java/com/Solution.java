package com;

public class Solution {
    public static void main(String [] args){

        //-----------Блок инициализации переменных------------------
        int enterNumber = 5000, x = 0, semikop, piatikop, trikop;
        //----------------------------------------------------------

        if (enterNumber % 7 == 0){                                                      //Если входящее число делится на 7 без остатка, то
            x = enterNumber / 7;                                                        //меняем входящее число на результат его деления на 7 и
            System.out.println(x + " семикопеешных");                                   //выводим на экран изменённое входящее число, что и является количеством 7-ми копеешных монет
        }
        if (enterNumber % 7 != 0){                                                      //Если входящее число не делится на 7 без остатка, то
            semikop = enterNumber / 7;                                                  //меняем входящее число на результат его деления на 7, записываем в переменную и
            System.out.println(semikop + " семокопеешных");                             //выводим на экран эту переменную, что и является количеством 7-ми копеешных монет, потом
            x = enterNumber - (7 * semikop);                                            //записываем в переменную результат разницы входящего числа и суммы семикопеешных монет.
            if (x % 5 == 0){                                                            //Если предыдущий результат делится на 5 без остатка, то
                piatikop = x / 5;                                                       //записываем в переменную остаток делённый на 5 и
                System.out.println(piatikop + " пятикопеешных");                        //выводим на экран количество 5-и копеешных монет.
            }
            if (x % 5 != 0){                                                            //Если входящее число не делится на 5 без остатка, то
                piatikop = x / 5;                                                       //записываем в переменную количество 5-и копеешных монет(остаток) и
                System.out.println(piatikop + " пятикопеешных");                        //выводим на экран количество 5-и копеешных монет.
                x = enterNumber - ((7 * semikop) + (5 * piatikop));                     //Записываем в переменную результат вычетания из входящего числа суммы 7-и копеешных монет и суммы 5-и копеешных монет.
                if (x % 3 == 0){                                                        //Если остаток делится на 3 без остатка, то
                    trikop = x / 3;                                                     //в переменную записываем количество 3-х копеешных монет и
                    System.out.println(trikop + " трехкопеешных");                      //выводим на экран количество 3-х копеешных монет.
                }
                if (x % 3 != 0){                                                        //Если остаток не делится на 3 без остатка, то
                    trikop = x / 3;                                                     //записываем в переменную количество 3-х копеешных монет и
                    System.out.println(trikop + " трехкопеешных");                      //выводим на экран количество 3-х копеешных монет, затем
                    x = enterNumber - ((7 * semikop) + (5 * piatikop) + (3 * trikop));  //заносим в переменную результат вычитания из входящего числа суммы 7-и копеешных, 5-и копеешных и 3-х копеешных монет, и
                    System.out.println("Остаток = " + x);                               //выводим на экран остаток который уже нельзя применить.
                }
            }
        }
    }
}
