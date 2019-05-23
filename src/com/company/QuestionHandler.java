package com.company;

import java.util.Scanner;

public class QuestionHandler {
    static Scanner reader = new Scanner(System.in);
    static Question q;

    public static  void enterQuestion(String s){
        s = s.toLowerCase();
        q = new Question(s);



    }
}
