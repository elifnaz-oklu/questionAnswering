package com.company;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, Game> games = new HashMap<String, Game>();

        boolean c = true;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Games.dat"));
            while(true){
                Game obj = (Game) in.readObject();
                games.put(obj.getName(),obj);
            }
        }catch(EOFException e) {
            System.out.println("EOF");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }

        do {
            System.out.print("\nLütfen sorunuzu giriniz: ");
            Scanner reader = new Scanner(System.in);
            String s = reader.nextLine();
            s = s.toLowerCase();
           Question.listgames(games,s,reader);
            System.out.print("Başka soru sormak istiyor musunuz(Evet için evet yazınız): ");
            if(reader.nextLine().equalsIgnoreCase("evet")) {
                c = true;
            }
            else{
                System.out.println("Programımızı kullandığınız için teşekkürler :)");
                c = false;
            }

        }while(c);

        }

    }
