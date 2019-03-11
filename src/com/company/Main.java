package com.company;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean c = true;
        List<Game> games = new ArrayList<Game>();
        /**
        Game g1 = new Game("game1",2015,8.1,"adventure",1,"company1",100);
        Game g2 = new Game("game2",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
        Game g3 = new Game("game3",2020,8.9,"sci-fi",1,"company2",30);
        Game g4 = new Game("game4",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
        Game g5 = new Game("game5",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));

        games.add(g1);
        games.add(g2);
        games.add(g3);
        games.add(g4);
        games.add(g5);
        **/

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Games.dat"));
            while(true){
                games.add((Game) in.readObject());
            }
        }catch(EOFException e) {
            System.out.println("EOF");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        //for(Game g : games) System.out.println(g);

        do {
            System.out.print("\nLütfen sorunuzu giriniz: ");
            Scanner reader = new Scanner(System.in);
            String s = reader.nextLine();
            s = s.toLowerCase();


            if (s.contentEquals("tarihe göre oyun göster")) {
                System.out.print("Lütfen tarih aralığı giriniz: ");
                int t1 = reader.nextInt();
                int t2 = reader.nextInt();
                for (Game g : games) {
                    if (t1 <= g.getYear() & g.getYear() <= t2) {
                        System.out.println(g.getName());
                    }
                }

            }

            if (s.contentEquals("puana göre oyun göster")) {
                System.out.print("Oyun kaç puan üstü olsun : ");
                double t1 = reader.nextDouble();
                for (Game g : games) {
                    if (t1 <= g.getScore()) {
                        System.out.println(g.getName());
                    }
                }

            }

            if (s.contentEquals("oyuncu sayısına göre oyun göster")) {
                System.out.print("Oyun kaç kişi ve üstü olsun : ");
                double t1 = reader.nextInt();
                for (Game g : games) {
                    if (t1 <= g.getPlayerNumber()) {
                        System.out.println(g.getName());
                    }
                }

            }

            if (s.contentEquals("fiyata göre oyun göster")) {
                System.out.print("Lütfen fiyat aralığı giriniz: ");
                int t1 = reader.nextInt();
                int t2 = reader.nextInt();
                for (Game g : games) {
                    if (t1 <= g.getPrice() & g.getPrice() <= t2) {
                        System.out.println(g.getName() + " oyununun fiyatı " + g.getPrice());
                    }
                }

            }


            if (s.contentEquals("oyunun satıldığı yerleri göster")) {
                System.out.print("Oyun adı giriniz: ");
                String s1 = reader.nextLine().toLowerCase();
                for (Game g : games) {
                    if (s1.contentEquals(g.getName()) & !g.getShops().isEmpty()) {

                        for(String shop : g.getShops())
                        System.out.println(shop);
                    }
                    else if (s1.contentEquals(g.getName()) & g.getShops().isEmpty()){
                        System.out.println("Oyun  satışta değildir");
                    }
                }

            }


            for (Game g : games) {

                if (s.contains(g.getName()) & (s.contains("tarih") | s.contains("yıl"))) {
                    System.out.println(g.getName() + " adlı oyunun çıkış tarihi " + g.getYear());
                } else if (s.contains(g.getName())) {
                    System.out.println("Oyunun bilgileri: \n" + g.toString());
                }

                if (s.contains(g.getType())) {
                    System.out.println(g.getName());

                }

                if (s.contains(g.getCompany())) {
                    System.out.println(g.getName());

                }

            }

            System.out.print("Başka soru sormak istiyor musunuz: ");
            c = reader.nextBoolean();

        }while(c);



        }
    }
