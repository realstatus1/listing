package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String [] args) throws IOException {

        //-------------------------Блок инициализации-----------------------------------
        int counter = 1;
        Solution solution = new Solution();
        ArrayList<String> inputList = new ArrayList<>();
        ArrayList<String> outputList = new ArrayList<>();
        File inputFile = new File("C:\\DevOps\\hard\\Input.txt");
        File outputFile = new File("C:\\DevOps\\hard\\Output.txt");
        //------------------------------------------------------------------------------

        Scanner textScanner = new Scanner(inputFile);                                                                                                                               //
        while (textScanner.hasNext()){                                                                                                                                              //Читаем файл и переносим все значения в ArrayList со входными данными.
            inputList.add(textScanner.next());                                                                                                                                      //
        }
        textScanner.close();                                                                                                                                                        //Закрываем сканер.
        for (int i = 0; i < inputList.size(); i ++){                                                                                                                                //
            if (inputList.get(i).matches("^[a-zA-Z]+$"))                                                                                                                       //Пробегая по входному ArrayList проверяем на наличие латинских букв, если присутствует запись из латинских букв, то
                switch (inputList.get(i)){                                                                                                                                          //проверяем какая именно это запись и при нахождении желаемой выполняем соответствующий функции метод и результат записываем в ArrayList с выходными данными.
                    case "ACK" : outputList.add(counter + " " + solution.akkerman(Integer.parseInt(inputList.get(i+1)), Integer.parseInt(inputList.get(i+2)))); counter++; break;   //
                    case "F" : outputList.add(counter + " " + solution.faktorial(Integer.parseInt(inputList.get(i+1)))); counter++; break;                                          //
                    case "FIB" : outputList.add(counter + " " + solution.fibonachchi(Integer.parseInt(inputList.get(i+1)))); counter++; break;                                      //
                    default : System.out.print("Для функции - " + inputList.get(i) +" нет обработчика!"); break;                                                                    //Если обработчик для функции отсутствует то кидаем сообщение с именем функции из файла.
                }
        }
        FileWriter writer = new FileWriter(outputFile);                                                                                                                             //
        for (int i = 0; i < outputList.size(); i++){                                                                                                                                //Пробегая по ArrayList с выходными значениями записываем их.
            writer.write(outputList.get(i) + "\n");                                                                                                                              //
        }
        writer.flush();                                                                                                                                                             //Смываем в файл.
        writer.close();                                                                                                                                                             //Закрываем поток записи.
    }

    //-------------------Метод рассчитывающий функцию Аккермана----------------------------------
    public int akkerman(int m, int n){
        if (m == 0)
        return (n + 1);
        if (m > 0 && n == 0)
        return akkerman(m - 1,1);
        if (m > 0 && n > 0)
        return akkerman(m - 1,akkerman(m,n - 1));
        else return 0;
    }
    //-------------------------------------------------------------------------------------------

    //-------------------Метод рассчитывающий факториал------------------------------------------
    public int faktorial(int x){
        if (x == 0)
            return 1;
        else{
            return x * faktorial(x - 1);
        }
    }
    //-------------------------------------------------------------------------------------------

    //-----------------------------Метод рассчитывающий функцию Фибоначчи------------------------
    public int fibonachchi(int x){
        if (x == 1) return 1;
        if (x == 2) return 1;
        return fibonachchi(x - 1) + fibonachchi(x - 2);
    }
    //-------------------------------------------------------------------------------------------
}
