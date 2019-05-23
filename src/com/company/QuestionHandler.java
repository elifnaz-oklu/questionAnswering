package com.company;

import java.util.Scanner;

public class QuestionHandler {
    static Scanner reader = new Scanner(System.in);
    static Question q;

    public static  void enterQuestion(){
        System.out.println("Please enter your question");
        String s = reader.nextLine();
        s = s.toLowerCase();
        q = new Question(s);



    }
}
