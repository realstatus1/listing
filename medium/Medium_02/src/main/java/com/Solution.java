package com;

public class Solution {
    public static void main(String [] args){

        //-----------------Блок инициализации---------------------
        String incomingString = "aaabccdd";
        String incodingString = "", temp = "";
        int count;
        //--------------------------------------------------------

        for (int i = 0; i < incomingString.length();i++){                                                                               //Проходим посимвольно по строке.
            count = 1;                                                                                                                  //Начинаем отсчет символов от 1.
            temp = incomingString.substring(i, i+1);                                                                                    //Записываем текущий символ во временную переменную.
            while (i+1 < incomingString.length() && incomingString.substring(i, i+1).equals(incomingString.substring(i+1, i+2))){       //Если позиция последующего символа меньше длинны строки и текущий символ совпадает со следующим символом, то
                count ++;                                                                                                               //счетчик символов увеличивается на 1 и
                i++;                                                                                                                    //переходим к следующему символу в строке.
            }                                                                                                                           //
            incodingString += count + temp;                                                                                             //В переменную с закодированной строкой дописываем количество символов и сам символ.
        }                                                                                                                               //
        System.out.print(incodingString);                                                                                               //Выводим закодированную строку на экран.
    }
}
