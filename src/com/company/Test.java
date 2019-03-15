package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Game> gameList = new ArrayList<>();
        try{
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("Games.dat"));
             while(true){
                 gameList.add((Game) in.readObject());
             }
        }catch(EOFException e) {
            System.out.println("EOF");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        for(Game g : gameList) System.out.println(g);



        try {

            Game g1 = new Game("game1",2015,8.1,"adventure",1,"company1",100);
            Game g2 = new Game("game2",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g3 = new Game("game3",2020,8.9,"sci-fi",1,"company2",30);
            Game g4 = new Game("game4",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g5 = new Game("game5",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g6 = new Game("Witcher 3: The Wild Hunt",2015,9.2,"Role Playing Action",1,"CDProjectRed",20,Arrays.asList("Steam"));
            Game g7 = new Game("game7",2010,8.1,"adventure",1,"company1",100);
            Game g8 = new Game("game8",2008,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g9 = new Game("game9",2008,8.9,"sci-fi",1,"company2",30);
            Game g10 = new Game("game10",2011,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g11 = new Game("game11",2012,8.1,"adventure",1,"company1",100);
            Game g12 = new Game("game12",2012,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g13 = new Game("game13",2008,8.9,"sci-fi",1,"company2",30);
            Game g14 = new Game("game14",2005,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g15 = new Game("game15",2006,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g16 = new Game("game16",2008,8.1,"adventure",1,"company1",100);
            Game g17 = new Game("game17",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g18 = new Game("game18",2020,8.9,"sci-fi",1,"company2",30);
            Game g19 = new Game("game19",2018,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g20 = new Game("game20",2014,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g21 = new Game("game21",2013,8.1,"adventure",1,"company1",100);
            Game g22 = new Game("game22",2015,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g23 = new Game("game23",2015,8.9,"sci-fi",1,"company2",30);
            Game g24 = new Game("game24",2003,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g25 = new Game("game25",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g26 = new Game("game26",2015,8.1,"adventure",1,"company1",100);
            Game g27 = new Game("game27",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g28 = new Game("game28",2020,8.9,"sci-fi",1,"company2",30);
            Game g29= new Game("game29",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g30 = new Game("game30",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g31 = new Game("game31",2015,8.1,"adventure",1,"company1",100);
            Game g32 = new Game("game32",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g33 = new Game("game33",2020,8.9,"sci-fi",1,"company2",30);
            Game g34 = new Game("game34",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g35 = new Game("game35",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g36 = new Game("game36",2015,8.1,"adventure",1,"company1",100);
            Game g37 = new Game("game37",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g38 = new Game("game38",2020,8.9,"sci-fi",1,"company3",30);
            Game g39= new Game("game39",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g40 = new Game("game40",2013,4.2,"action",3,"company3",20,Arrays.asList("shop3"));
            Game g41 = new Game("game41",2015,8.1,"adventure",1,"company1",100);
            Game g42 = new Game("game42",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g43 = new Game("game43",2020,8.9,"sci-fi",1,"company3",30);
            Game g44 = new Game("game44",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g45 = new Game("game45",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g46 = new Game("game46",2015,8.1,"adventure",1,"company1",100);
            Game g47 = new Game("game47",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g48 = new Game("game48",2020,8.9,"sci-fi",1,"company5",30);
            Game g49= new Game("game49",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g50 = new Game("game50",2013,4.2,"action",3,"company5",20,Arrays.asList("shop3"));
            Game g51 = new Game("game51",2015,8.1,"adventure",1,"company1",100);
            Game g52 = new Game("game52",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g53 = new Game("game53",2020,8.9,"sci-fi",1,"company5",30);
            Game g54 = new Game("game54",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g55 = new Game("game55",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g56 = new Game("game56",2015,8.1,"adventure",1,"company1",100);
            Game g57 = new Game("game57",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g58 = new Game("game58",2020,8.9,"sci-fi",1,"company5",30);
            Game g59= new Game("game59",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g60 = new Game("game60",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g61 = new Game("game61",2015,8.1,"adventure",1,"company1",100);
            Game g62 = new Game("game62",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g63 = new Game("game63",2020,8.9,"sci-fi",1,"company3",30);
            Game g64 = new Game("game64",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g65 = new Game("game65",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g66 = new Game("game66",2015,8.1,"adventure",1,"company1",100);
            Game g67 = new Game("game67",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g68 = new Game("game68",2020,8.9,"sci-fi",1,"company4",30);
            Game g69= new Game("game69",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g70 = new Game("game70",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g71 = new Game("game71",2015,8.1,"adventure",1,"company1",100);
            Game g72 = new Game("game72",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g73 = new Game("game73",2020,8.9,"sci-fi",1,"company2",30);
            Game g74 = new Game("game74",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g75 = new Game("game75",2013,4.2,"action",3,"company3",20,Arrays.asList("shop3"));
            Game g76 = new Game("game76",2015,8.1,"adventure",1,"company1",100);
            Game g77 = new Game("game77",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g78 = new Game("game78",2020,8.9,"sci-fi",1,"company2",30);
            Game g79= new Game("game79",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g80 = new Game("game80",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g81 = new Game("game81",2015,8.1,"adventure",1,"company1",100);
            Game g82 = new Game("game82",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g83 = new Game("game83",2020,8.9,"sci-fi",1,"company2",30);
            Game g84 = new Game("game84",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g85 = new Game("game85",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g86 = new Game("game86",2015,8.1,"adventure",1,"company1",100);
            Game g87 = new Game("game87",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g88 = new Game("game88",2020,8.9,"sci-fi",1,"company5",30);
            Game g89= new Game("game89",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g90 = new Game("game90",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g91 = new Game("game91",2015,8.1,"adventure",1,"company1",100);
            Game g92 = new Game("game92",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g93 = new Game("game93",2020,8.9,"sci-fi",1,"company5",30);
            Game g94 = new Game("game94",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g95 = new Game("game95",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));
            Game g96 = new Game("game96",2015,8.1,"adventure",1,"company1",100);
            Game g97 = new Game("game97",2010,7.1,"strategy",2,"company1",50,Arrays.asList("shop1", "shop2"));
            Game g98 = new Game("game98",2020,8.9,"sci-fi",1,"company5",30);
            Game g99= new Game("game99",2008,6.2,"adventure",4,"company1",200,Arrays.asList("shop1"));
            Game g100 = new Game("game100",2013,4.2,"action",3,"company4",20,Arrays.asList("shop3"));


            FileOutputStream fos = new FileOutputStream("Games.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            oos.writeObject(g1);
            oos.writeObject(g2);
            oos.writeObject(g3);
            oos.writeObject(g4);
            oos.writeObject(g5);
            oos.writeObject(g6);
            oos.writeObject(g7);
            oos.writeObject(g8);
            oos.writeObject(g9);
            oos.writeObject(g10);
            oos.writeObject(g11);
            oos.writeObject(g12);
            oos.writeObject(g13);
            oos.writeObject(g14);
            oos.writeObject(g15);
            oos.writeObject(g16);
            oos.writeObject(g17);
            oos.writeObject(g18);
            oos.writeObject(g19);
            oos.writeObject(g20);
            oos.writeObject(g21);
            oos.writeObject(g22);
            oos.writeObject(g23);
            oos.writeObject(g24);
            oos.writeObject(g25);
            oos.writeObject(g26);
            oos.writeObject(g27);
            oos.writeObject(g28);
            oos.writeObject(g29);
            oos.writeObject(g30);
            oos.writeObject(g31);
            oos.writeObject(g32);
            oos.writeObject(g33);
            oos.writeObject(g34);
            oos.writeObject(g35);
            oos.writeObject(g36);
            oos.writeObject(g37);
            oos.writeObject(g38);
            oos.writeObject(g39);
            oos.writeObject(g40);
            oos.writeObject(g41);
            oos.writeObject(g42);
            oos.writeObject(g43);
            oos.writeObject(g44);
            oos.writeObject(g45);
            oos.writeObject(g46);
            oos.writeObject(g47);
            oos.writeObject(g48);
            oos.writeObject(g49);
            oos.writeObject(g50);
            oos.writeObject(g51);
            oos.writeObject(g52);
            oos.writeObject(g53);
            oos.writeObject(g54);
            oos.writeObject(g55);
            oos.writeObject(g56);
            oos.writeObject(g57);
            oos.writeObject(g58);
            oos.writeObject(g59);
            oos.writeObject(g60);
            oos.writeObject(g61);
            oos.writeObject(g62);
            oos.writeObject(g63);
            oos.writeObject(g64);
            oos.writeObject(g65);
            oos.writeObject(g66);
            oos.writeObject(g67);
            oos.writeObject(g68);
            oos.writeObject(g69);
            oos.writeObject(g70);
            oos.writeObject(g71);
            oos.writeObject(g72);
            oos.writeObject(g73);
            oos.writeObject(g74);
            oos.writeObject(g75);
            oos.writeObject(g76);
            oos.writeObject(g77);
            oos.writeObject(g78);
            oos.writeObject(g79);
            oos.writeObject(g80);
            oos.writeObject(g81);
            oos.writeObject(g82);
            oos.writeObject(g83);
            oos.writeObject(g84);
            oos.writeObject(g85);
            oos.writeObject(g86);
            oos.writeObject(g87);
            oos.writeObject(g88);
            oos.writeObject(g89);
            oos.writeObject(g90);
            oos.writeObject(g91);
            oos.writeObject(g92);
            oos.writeObject(g93);
            oos.writeObject(g94);
            oos.writeObject(g95);
            oos.writeObject(g96);
            oos.writeObject(g97);
            oos.writeObject(g98);
            oos.writeObject(g99);
            oos.writeObject(g100);



            System.out.println("Done");
            // closing resources
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
