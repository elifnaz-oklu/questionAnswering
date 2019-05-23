package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {

    public static Pattern matches(Question q) {
        Matcher yilMatcher = PatternList.getPattern(0).matcher(q.content);
        Matcher puanMatcher = PatternList.getPattern(1).matcher(q.content);
        Matcher playerMatcher = PatternList.getPattern(2).matcher(q.content);
        Matcher fiyatMatcher = PatternList.getPattern(3).matcher(q.content);
        Matcher oyunTarihiMatcher = PatternList.getPattern(4).matcher(q.content);
        Matcher oyunBilgiMatcher = PatternList.getPattern(5).matcher(q.content);
        Matcher oyunTurMatcher = PatternList.getPattern(6).matcher(q.content);
        Matcher firmaOyunlariMatcher = PatternList.getPattern(7).matcher(q.content);
        Matcher nerdeSatisMatcher = PatternList.getPattern(8).matcher(q.content);



        if (yilMatcher.matches()) {
            return PatternList.getPattern(0);
        }
        else if (puanMatcher.matches()) {
            return PatternList.getPattern(1);
        }
        else if (playerMatcher.matches()) {
            return PatternList.getPattern(2);
        }
        else if (fiyatMatcher.matches()) {
            return PatternList.getPattern(3);
        }

        else if (oyunTarihiMatcher.matches()) {
            return PatternList.getPattern(4);
        }

        else if (oyunBilgiMatcher.matches()) {
            return PatternList.getPattern(5);
        }
        else if (oyunTurMatcher.matches()) {
            return PatternList.getPattern(6);
        }
        else if (firmaOyunlariMatcher.matches()) {
            return PatternList.getPattern(7);
        }
        else if (nerdeSatisMatcher.matches()) {
            return PatternList.getPattern(8);
        }



        return null;
    }

}
