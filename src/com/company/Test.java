package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
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
        */


        try {

            Game g1 = new Game("Battlefield 1",2015,8.1,"FPS",1,"EA",100);
            Game g2 = new Game("Europa Universalis",2014,8.5,"strategy",2,"Paradox Interactive",50,Arrays.asList("Steam", "Paradox"));
            Game g3 = new Game("Hearts of Iron",2020,8.9,"strategy",1,"\"Paradox Interactive",30);
            Game g4 = new Game("Mass Effect 2",2008,6.2,"RPG",4,"EA",200,Arrays.asList("Origin"));
            Game g5 = new Game("Trine",2013,4.2,"adventure",3,"Tree House",20,Arrays.asList("Steam"));
            Game g6 = new Game("Witcher 3: The Wild Hunt",2015,9.2,"RPG",1,"CD Project Red",20,Arrays.asList("Steam"));
            Game g7 = new Game("Call of Duty 4",2008,9.1,"FPS",1,"Infinity Ward",100);
            Game g8 = new Game("Call of Duty 5",2009,8.1,"FPS",2,"Trearch",50,Arrays.asList("Steam"));
            Game g9 = new Game("Modern Warfare 2",2010,9.9,"FPS",1,"Infinity Ward",30);
            Game g10 = new Game("Black Ops",2011,9.2,"FPS",4,"Trearch",200,Arrays.asList("Steam"));
            Game g11 = new Game("Modern Warfare 3",2012,8.1,"FPS",1,"Infinity Ward",100);
            Game g12 = new Game("Black Ops 2",2013,7.1,"FPS",2,"Trearch",50,Arrays.asList("Steam"));
            Game g13 = new Game("Mass Effect 3",2013,8.2,"sci-fi",1,"EA",30);
            Game g14 = new Game("Company of Heroes",2006,8.2,"strategy",4,"Relic",200,Arrays.asList("Steam"));
            Game g15 = new Game("Counter Strike",2012,7.2,"FPS",3,"Steam",20,Arrays.asList("Steam"));
            Game g16 = new Game("Ghost Recon Future Soldier",2012,8.1,"FPS",1,"Ubisoft",100);
            Game g17 = new Game("Assassins Creed",2008,7.1,"RPG",2,"Ubisoft",50,Arrays.asList("Ubisoft"));
            Game g18 = new Game("Assassins Creed 2",2009,8.9,"RPG",1,"Ubisoft",30);
            Game g19 = new Game("Assassins Creed Brotherhood",2010,6.2,"RPG",4,"Ubisoft",200,Arrays.asList("Ubisoft"));
            Game g20 = new Game("Assassins Creed Revelations",2011,4.2,"RPG",3,"Ubisoft",20,Arrays.asList("Ubisoft"));
            Game g21 = new Game("Assassins Creed 3",2012,8.1,"RPG",1,"Ubisoft",100);
            Game g22 = new Game("Assassins Creed Black Flag",2013,7.1,"RPG",2,"Ubisoft",50,Arrays.asList("Ubisoft"));
            Game g23 = new Game("Assassins Creed Rogue",2014,8.9,"RPG",1,"Ubisoft",30);
            Game g24 = new Game("Assassins Creed Unity",2015,6.2,"RPG",4,"Ubisoft",200,Arrays.asList("Ubisoft"));
            Game g25 = new Game("Assassins Creed Syndicate",2016,4.2,"RPG",3,"Ubisoft",20,Arrays.asList("Ubisoft"));
            Game g26 = new Game("Assassins Creed Origins",2017,8.1,"RPG",1,"Ubisoft",100);
            Game g27 = new Game("Assassins Creed Odyssey",2018,7.1,"RPG",2,"Ubisoft",50,Arrays.asList("Ubisoft"));
            Game g28 = new Game("Ghost Recon Wildlands",2018,8.9,"FPS",1,"Ubisoft",30);
            Game g29 = new Game("Crusader Kings",2008,6.2,"Strategy",4,"Paradox Interactive",200,Arrays.asList("Steam"));
            Game g30 = new Game("Victoria 2",2013,4.2,"Strategy",3,"Paradox Interactive",20,Arrays.asList("Steam"));
            Game g31 = new Game("Mass Effect Andromeda",2015,8.1,"RPG",1,"EA",100);
            Game g32 = new Game("Battlefield 5",2018,8.1,"FPS",2,"EA",50,Arrays.asList("Origin", "Steam"));
            Game g33 = new Game("Splinter Cell Conviction",2020,8.9,"FPS",1,"SC",30);
            Game g34 = new Game("Splinter Cell Blacklist",2008,6.2,"FPS",4,"SC",200,Arrays.asList("EA"));
            Game g35 = new Game("Company of Heroes",2014,4.2,"Strategy",3,"Relic",20,Arrays.asList("Steam"));
            Game g36 = new Game("Witcher 2",2010,8.1,"adventure",1,"CD Project Red",100);
            Game g37 = new Game("Age of Empires",2004,7.1,"strategy",2,"Microsoft",50,Arrays.asList("Steam", "Microsoft Store"));
            Game g38 = new Game("Halo",2020,8.9,"sci-fi",1,"H",30);
            Game g39 = new Game("Halo React",2008,6.2,"adventure",4,"H",200,Arrays.asList("Microsoft Store"));
            Game g40 = new Game("Trine 2",2013,4.2,"action",3,"T Games",20,Arrays.asList("steam"));
            Game g41 = new Game("HOT",2015,8.1,"adventure",1,"MGT",100);
            Game g42 = new Game("Civilization",2010,7.1,"strategy",2,"EA",50);
            Game g43 = new Game("Tropica",2020,8.9,"strategy",1,"IDK Ent",30);
            Game g44 = new Game("Goat Simulator",2008,6.2,"adventure",4,"Coffee Stain",200,Arrays.asList("Steam"));
            Game g45 = new Game("Revolt",2013,4.2,"action",3,"VOLT",20,Arrays.asList("Steam"));
            Game g46 = new Game("Need for Speed Underground",2005,8.1,"adventure",1,"EA",100);
            Game g47 = new Game("Need for Speed Most Wanted",2006,7.1,"adventure",2,"EA",50);
            Game g48 = new Game("Need for Speed Hot Pursuit",2020,8.9,"adventure",1,"EA",30);
            Game g49 = new Game("Medieval Total War",2008,6.2,"adventure",4,"SEGA",200,Arrays.asList("Steam"));
            Game g50 = new Game("Empire Total War",2013,4.2,"action",3,"SEGA",20,Arrays.asList("Steam"));
            Game g51 = new Game("Napoleon Total War",2015,8.1,"adventure",1,"SEGA",100);
            Game g52 = new Game("Shogun Total War",2010,7.1,"strategy",2,"SEGA",50,Arrays.asList("Steam"));
            Game g53 = new Game("Rome Total War",2020,8.9,"strategy",1,"SEGA",30);
            Game g54 = new Game("Attila Total War",2008,6.2,"strategy",4,"SEGA",200,Arrays.asList("Steam"));
            Game g55 = new Game("Rainbow Six Vegas",2013,4.2,"FPS",3,"Ubisoft",20,Arrays.asList("Steam"));
            Game g56 = new Game("Rainbow Six Siege",2015,8.1,"FPS",1,"Ubisoft",100);
            Game g57 = new Game("PUBG",2010,7.1,"FPS",2,"PUBG",50,Arrays.asList("Steam"));
            Game g58 = new Game("Fortnite",2020,8.9,"FPS",1,"Hello Games",30);
            Game g59 = new Game("Dota",2008,6.2,"Strategy",4,"Steam",1,Arrays.asList("Steam"));
            Game g60 = new Game("GTA 3",2013,4.2,"action",3,"Rockstar",20,Arrays.asList("Steam"));
            Game g61 = new Game("GTA Vice City",2015,8.1,"action",1,"Rockstar",100);
            Game g62 = new Game("GTA San Andreas",2010,7.1,"action",2,"Rockstar",50,Arrays.asList("Steam"));
            Game g63 = new Game("GTA 4",2012,8.9,"action",1,"Rockstar",30);
            Game g64 = new Game("GTA 5",2015,6.2,"action",4,"Rockstar",200,Arrays.asList("Steam"));
            Game g65 = new Game("Farcry 3",2013,4.2,"adventure",3,"Ubisoft",20,Arrays.asList("Steam"));
            Game g66 = new Game("Farcry 4",2015,8.1,"adventure",1,"Ubisoft",100);
            Game g67 = new Game("Farcry 5",2018,7.1,"adventure",2,"Ubisoft",50);
            Game g68 = new Game("Crysis",2020,8.9,"FPS",1,"Crytek",30);
            Game g69 = new Game("Crysis 2",2008,6.2,"FPS",4,"Crytek",200,Arrays.asList("Origin"));
            Game g70 = new Game("Borderlands",2013,8.2,"adventure",3,"2K",20,Arrays.asList("Steam"));
            Game g71 = new Game("Borderlands 2",2015,9.1,"adventure",1,"2K",100);
            Game g72 = new Game("This War of Mine",2010,7.1,"Survival",2,"11 Bit Studios",50,Arrays.asList("Steam"));
            Game g73 = new Game("Plants vs Zombies",2020,8.9,"adventure",1,"PvZ",30);
            Game g74 = new Game("Bad Piggies",2008,6.2,"adventure",4,"AB",200,Arrays.asList("Google Play"));
            Game g75 = new Game("Angry Birds",2013,4.2,"adventure",3,"AB",20,Arrays.asList("Steam"));
            Game g76 = new Game("Total War Warhammer",2015,8.1,"Strategy",1,"SEGA",100);
            Game g77 = new Game("Metal Gear Solid 4",2010,7.1,"FPS",2,"CAPCOM",50,Arrays.asList("Steam", "Origin"));
            Game g78 = new Game("Devil May Cry",2020,8.9,"adventure",1,"CAPCOM",30);
            Game g79 = new Game("Dark Souls",2008,6.2,"RPG",4,"DS ENT",200,Arrays.asList("Steam"));
            Game g80 = new Game("Mount and Blade",2013,4.2,"RPG",3,"M&B",20,Arrays.asList("Steam"));
            Game g81 = new Game("No Mans Sky",2015,8.1,"adventure",1,"Hello Games",100);
            Game g82 = new Game("Outlast",2010,7.1,"Survival",2,"Stones",50,Arrays.asList("Steam", "Origin"));
            Game g83 = new Game("PAYDAY",2020,8.9,"FPS",1,"Steam",30);
            Game g84 = new Game("Rocket Leaggue",2008,6.2,"adventure",4,"RL",200,Arrays.asList("Steam"));
            Game g85 = new Game("Division",2013,4.2,"action",3,"Ubisoft",20,Arrays.asList("Steam"));
            Game g86 = new Game("ARMA 3",2015,8.1,"FPS",1,"ARMA",100);
            Game g87 = new Game("Stronghold Crusader",2010,7.1,"strategy",2,"SC",50,Arrays.asList("Steam", "Origin"));
            Game g88 = new Game("War Thunder",2020,8.9,"action",1,"Gaijin",30);
            Game g89 = new Game("World of Warships",2015,6.2,"action",4,"Wargaming",200,Arrays.asList("Steam"));
            Game g90 = new Game("World of Tanks",2013,4.2,"action",3,"Wargaming",20,Arrays.asList("Steam"));
            Game g91 = new Game("Red Dead Redemption",2015,8.1,"adventure",1,"Rockstar",100);
            Game g92 = new Game("Call of Juarez",2010,7.1,"adventure",2,"CoJ",50,Arrays.asList("Steam", "Origin"));
            Game g93 = new Game("Shadow of Mordor",2020,8.9,"RPG",1,"Monolith",30);
            Game g94 = new Game("DOOM",2008,6.2,"FPS",4,"Bethesda",200,Arrays.asList("Steam"));
            Game g95 = new Game("Skyrim",2013,4.2,"RPG",3,"BEthesda",20,Arrays.asList("Steam"));
            Game g96 = new Game("Fallout 4",2015,8.1,"RPG",1,"Bethesda",100);
            Game g97 = new Game("Stronghold 2",2010,7.1,"strategy",2,"SC",50,Arrays.asList("Steam", "Origin"));
            Game g98 = new Game("Fallout Shelter",2020,8.9,"sci-fi",1,"Bethesda",30);
            Game g99 = new Game("PES 2019",2008,6.2,"Sports",4,"Konami",200,Arrays.asList("Steam"));
            Game g100 = new Game("Dead Space",2013,4.2,"action",3,"DS",20,Arrays.asList("Steam"));


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
