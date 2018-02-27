package com;

public class Solution {
    public static void main(String [] args){

        //-----------Блок инициализации-----------------
        String incomeString = "Мама мыла Мама.";
        String findSubstring = "Мама";
        int counter, povtor = 0;
        //----------------------------------------------

        for (int i = 0; i < incomeString.length();){                                                                                                                //
            counter = 0;                                                                                                                                            //
            for (int j = 0; j < findSubstring.length();){                                                                                                           //
                if (incomeString.substring(i, i+1).equals(findSubstring.substring(j, j+1)) || incomeString.substring(i, i+1).equals(findSubstring.substring(j))){   //Проходим посимвольно по строке и по подстроке и сравниваем, если символы совпадают, то
                    counter++;                                                                                                                                      //увеличиваем счётчик и
                    i++;                                                                                                                                            //переходим на следующий символ в строке.
                }                                                                                                                                                   //
                if (counter == findSubstring.length()){                                                                                                             //Если число в счётчике совпадает с длиной строки, то
                    povtor++;                                                                                                                                       //совпадение найдено и мы увеличиваем значение в переменной povtor
                }                                                                                                                                                   //
                j++;                                                                                                                                                //
            }                                                                                                                                                       //
            i++;                                                                                                                                                    //
        }
        if (povtor > 0){                                                                                                                                            //Если значение в povtor больше 0, то
            System.out.print("Подстрока найдена в строке " + povtor + " раз.");                                                                                     //выводим на экран количество раз сколько мы встретили подстроку в строке или
        } else System.out.print("Подстрока не найдена в строке.");                                                                                                  //выводим что подстрока не найдена в строке.
        /*if (incomeString.contains("Мамо")){           //Поиск подстроки в строке.
            System.out.println("Есть подстрока.");      //Вывод положительного результата.
        } else System.out.println("Нет подстроки.");    //Вывод отрицательного результата.
        */
    }
}
