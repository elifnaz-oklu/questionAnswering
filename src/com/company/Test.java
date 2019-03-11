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

            FileOutputStream fos = new FileOutputStream("Games.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // write object to file
            oos.writeObject(g1);
            oos.writeObject(g2);
            oos.writeObject(g3);
            oos.writeObject(g4);
            oos.writeObject(g5);
            oos.writeObject(g6);
            System.out.println("Done");
            // closing resources
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
