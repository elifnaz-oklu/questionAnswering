package com.company;

import com.company.Game;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class Question {

    public static void listgames(List<Game> games, String s, Scanner reader){

        boolean isMatched = false;
        String pattern5 = "(.*)(tarih|zaman|yıl)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String pattern6=  "(.*)(puan|değerlendirme|skor)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String pattern7=  "(.*)(kişi|oyuncu|sayı)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String pattern8=  "(.*)(fiyat|ücret|tutar)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";

        Pattern r5 = Pattern.compile(pattern5);
        Pattern r6 = Pattern.compile(pattern6);
        Pattern r7 = Pattern.compile(pattern7);
        Pattern r8 = Pattern.compile(pattern8);

        Matcher m5 = r5.matcher(s);
        Matcher m6= r6.matcher(s);
        Matcher m7= r7.matcher(s);
        Matcher m8= r8.matcher(s);

        for (Game g : games) {

            String pattern1 = "(.*)" + g.getName() + "( )(.*)(tarih|yıl|zaman)(.*)";
            String pattern2 = "(.*)" + g.getName() + "( )(.*)(bilgi|nedir|nasıl)(.*)";
            String pattern3 = "(.*)" + g.getType() + "(.*)";
            String pattern4 = "(.*)" + g.getCompany() + "(.*)";
            String pattern9 = "(.*)" + g.getName() + "( )(.*)(nerede|nereden|hangi)(.*)(satılıyor|satın|satış)(.*)";

            Pattern r1 = Pattern.compile(pattern1);
            Pattern r2 = Pattern.compile(pattern2);
            Pattern r3 = Pattern.compile(pattern3);
            Pattern r4 = Pattern.compile(pattern4);
            Pattern r9 = Pattern.compile(pattern9);

            Matcher m1 = r1.matcher(s);
            Matcher m2 = r2.matcher(s);
            Matcher m3 = r3.matcher(s);
            Matcher m4 = r4.matcher(s);
            Matcher m9 = r9.matcher(s);

            if (m1.matches()) {
                isMatched = true;
                System.out.println(g.getName() + " adlı oyunun çıkış tarihi " + g.getYear());
            }

            else if (m9.matches()) {
                isMatched = true;
                if (!g.getShops().isEmpty()) {
                    for (String shop : g.getShops()) {
                        System.out.println(shop);
                    }
                }

                else if (g.getShops().isEmpty()) {
                    System.out.println("Oyun  satışta değildir");
                }

            }

            else if (m2.matches()) {
                isMatched = true;
                System.out.println("Oyunun bilgileri: \n" + g.toString());
            }

            if (m3.matches()) {
                isMatched = true;
                System.out.println(g.getName());
            }

            if (m4.matches()) {
                isMatched = true;
                System.out.println(g.getName());

            }

        }


        if (m5.matches()) {
            isMatched = true;
            System.out.print("Lütfen tarih aralığı giriniz: ");
            int t1 = reader.nextInt();
            int t2 = reader.nextInt();
            reader.nextLine();
            for (Game g : games) {
                if (t1 <= g.getYear() & g.getYear() <= t2) {
                    System.out.println(g.getName());
                }
            }

        }

        if (m6.matches()) {
            isMatched = true;
            System.out.print("Oyun kaç puan üstü olsun : ");
            double t1 = reader.nextDouble();
            reader.nextLine();
            for (Game g : games) {
                if (t1 <= g.getScore()) {
                    System.out.println(g.getName());
                }
            }

        }

        if (m7.matches()) {
            isMatched = true;
            System.out.print("Oyun kaç kişi ve üstü olsun : ");
            int t1 = reader.nextInt();
            reader.nextLine();
            for (Game g : games) {
                if (t1 <= g.getPlayerNumber()) {
                    System.out.println(g.getName());
                }
            }

        }

        if (m8.matches()) {
            isMatched = true;
            System.out.print("Lütfen fiyat aralığı giriniz: ");
            int t1 = reader.nextInt();
            int t2 = reader.nextInt();
            reader.nextLine();
            for (Game g : games) {
                if (t1 <= g.getPrice() & g.getPrice() <= t2) {
                    System.out.println(g.getName() + " oyununun fiyatı " + g.getPrice());
                }
            }

        }

        if(!isMatched){
            System.out.println("Demek istediğinizi anlayamadım,lütfen farklı bir soru giriniz");
        }

        }

    }



