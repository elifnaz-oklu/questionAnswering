package com.company;

import java.util.regex.Pattern;

public class Question {

    String content;
    Query questionQuery = new Query();

    public Question(String s){

        this.content=s;
        Pattern p = Match.matches(this);
        questionQuery.FindAnswer(p);

    }



}
