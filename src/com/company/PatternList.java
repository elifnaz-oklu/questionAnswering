package com.company;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class PatternList {

    static ArrayList<Pattern> patterns = new ArrayList<Pattern>();

    public static void add(Pattern p){
        patterns.add(p);

    }
    public  static Pattern getPattern(int index){
        return patterns.get(index);

    }

    public  static int getIndex(Pattern p){
        return patterns.indexOf(p);
    }

}
