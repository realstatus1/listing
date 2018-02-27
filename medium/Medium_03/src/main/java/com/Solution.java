package com;

public class Solution {
    public static void main(String [] args){

        //-----------------Блок инициализации---------------------
        String incomingString = "3a1b2c2d";
        String decodingString = "", temp = "";
        int count;
        //--------------------------------------------------------

        for (int i = 0; i < incomingString.length(); i += 2){                       //Проходим по всей спроке посимвольно.
            count = 0;                                                              //При входе на следующую итерацию обнуляем счетчик.
            while (count < Integer.parseInt(incomingString.substring(i, i+1))){     //Пока счётчик не станет равным или большим чем символ количества символов
                decodingString += incomingString.substring(i+1, i+2);               //дописываем к раскодированной строке нужный символ и
                count++;                                                            //увеличиваем счетчик.
            }
        }
        System.out.print(decodingString);                                           //Выводим на экран раскодированную строку.
    }
}
