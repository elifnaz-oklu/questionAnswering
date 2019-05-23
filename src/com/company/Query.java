package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Query {
    static Scanner reader = new Scanner(System.in);
    Answer queryAnswer;

    public void FindAnswer(Pattern p) {

        String s = "";
        if (PatternList.getIndex(p) == 0) {
            System.out.print("Lütfen tarih aralığı arada boşluk bırakarak giriniz: ");
            int t1 = reader.nextInt();
            int t2 = reader.nextInt();
            reader.nextLine();
            for (Game g : GameList.allGames) {
                if (t1 <= g.getYear() & g.getYear() <= t2) {
                    s += g.getName() + " , tarihi :  " + g.getYear() + "\n";
                }
            }

        } else if (PatternList.getIndex(p) == 1) {
            System.out.print("Oyun kaç puan üstü olsun : ");
            double t1 = reader.nextDouble();
            reader.nextLine();
            for (Game g : GameList.allGames) {
                if (t1 <= g.getScore()) {
                    s += g.getName() + " , puanı :  " + g.getScore() + "\n";
                }
            }

        } else if (PatternList.getIndex(p) == 2) {
            System.out.print("Oyun kaç kişi ve üstü olsun : ");
            int t1 = reader.nextInt();
            reader.nextLine();
            for (Game g : GameList.allGames) {
                if (t1 <= g.getPlayerNumber()) {
                    s += g.getName() + " , " + g.getPlayerNumber() + " kişilik " + "\n";
                }
            }

        } else if (PatternList.getIndex(p) == 3) {
            System.out.print("Lütfen fiyat aralığı boşluk bırakarak giriniz: ");
            int t1 = reader.nextInt();
            int t2 = reader.nextInt();
            reader.nextLine();
            for (Game g : GameList.allGames) {
                if (t1 <= g.getPrice() & g.getPrice() <= t2) {
                    s += g.getName() + " oyununun fiyatı " + g.getPrice() + "\n";
                }
            }

        }



            if (PatternList.getIndex(p) == 4) {
                System.out.print("Lütfen oyun adı giriniz: ");
                String i = reader.nextLine();
                for (Game g : GameList.allGames) {
                    if (g.getName().equalsIgnoreCase(i)) {
                        s = g.getName() + " adlı oyunun çıkış tarihi " + +g.getYear();
                    }
                }
            }

             else if (PatternList.getIndex(p) == 5) {
                System.out.print("Lütfen oyun adı giriniz: ");
                String i = reader.nextLine();
                for (Game g : GameList.allGames) {
                    if (g.getName().equalsIgnoreCase(i)) {
                        s = "Oyunun bilgileri: \n" + g.toString();
                    }
                }
            }

            else if (PatternList.getIndex(p) == 6) {
                System.out.print("Lütfen tür giriniz : ");
                String i = reader.nextLine();
                for (Game g : GameList.allGames) {
                    if (g.getType().equalsIgnoreCase(i)) {
                        s += g.getName() + "\n";
                    }
                }
            }

             else if (PatternList.getIndex(p) == 7) {
                System.out.print("Lütfen firma adı giriniz : ");
                String i = reader.nextLine();
                for (Game g : GameList.allGames) {
                    if (g.getCompany().equalsIgnoreCase(i)) {
                        s += g.getName() + "\n";
                    }
                }
            }

            else if (PatternList.getIndex(p) == 8) {
                System.out.print("Lütfen oyun adı giriniz: ");
                String i = reader.nextLine();
                for (Game g : GameList.allGames) {
                    if (g.getName().equalsIgnoreCase(i)) {
                        if (!g.getShops().isEmpty()) {
                            System.out.println("Oyunun satıldığı mağazalar : ");
                            for (String shop : g.getShops()) {
                                s += shop + " ";
                            }
                        } else if (g.getShops().isEmpty()) {
                            s = "Oyun  satışta değildir";
                        }
                    }
                }
            }












        queryAnswer = new Answer(s);
        queryAnswer.show();


        }


    }

