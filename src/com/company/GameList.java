package com.company;

import java.util.ArrayList;

public class GameList {
   static ArrayList<Game> allGames = new ArrayList<Game>();

   public static void add(Game g){
       allGames.add(g);

   }
    public static Game getGame(int index){
       return  allGames.get(index);

    }

}
