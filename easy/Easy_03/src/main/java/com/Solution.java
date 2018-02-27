package com;

public class Solution {
    public static void main(String [] args){
        String s = "А роза упала на лапу Авора";
        s = s.trim().replace(" ", "").toLowerCase();
        int y = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                y ++;
                if (!s.substring(i, 1 + i).equals(s.substring(s.length() - i - 1, s.length() - i))){
                    System.out.println("Не полиндром.");
                    break;
                }
            }
            if (y == s.length() / 2){
                System.out.println("Полиндром.");
            }
    }
}
