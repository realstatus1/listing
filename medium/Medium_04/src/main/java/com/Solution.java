package com;

public class Solution {
    public static void main (String [] args){

        //-------------Блок инициализации-----------------
        int nachalnoeChislo = 753;
        int[] razmen = new int[]{7, 5, 3};
        //------------------------------------------------

        for (int i = 0; i < razmen.length; i++){                                                                            //Пробегаем по всем элементам массива(каждый элемент - номинал монеты для размена),
            if (nachalnoeChislo % razmen[i] == 0){                                                                          //если после деления на текущий номинал остаток 1, то
                System.out.println("Количество " + razmen[i] + "-и копешных монет = " + ((nachalnoeChislo/razmen[i])));     //выводим на экран количество монет - 1, и
                nachalnoeChislo = (nachalnoeChislo % razmen[i]);                                                            //изменяем первоночальное число на остаток деления ппервоночальног числа на текущий номинал + номинал.
            }
            if (nachalnoeChislo % razmen[i] == 1){
                System.out.println("Количество " + razmen[i] + "-и копешных монет = " + ((nachalnoeChislo/razmen[i]) - 1));     //выводим на экран количество монет - 1, и
                nachalnoeChislo = (nachalnoeChislo % razmen[i]) + razmen[i];
            }
            if (nachalnoeChislo % razmen[i] != 0 && nachalnoeChislo % razmen[i] != 1){                                      //Если после деления на текущий номинал остаток не 1, то
                System.out.println("Количество " + razmen[i] + "-и копешных монет = " + ((nachalnoeChislo / razmen[i])));     //выводим на результат деления начальног числа на текущий номанл и
                nachalnoeChislo = nachalnoeChislo - ((nachalnoeChislo / razmen[i]) * razmen[i]);                                                              //изменяем первоночальное число записывая в него результат вычитания от первоночального числа результата деления первоночального числа на номинал и умноженного на номинал.
            }
            System.out.print(8/5);
        }
    }
}
