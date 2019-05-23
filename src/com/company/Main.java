package com.company;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        boolean c = true;
        PatternList pl = new PatternList();

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Games.dat"));
            while (true) {
                Game obj = (Game) in.readObject();
                GameList.allGames.add(obj);
            }
        } catch (EOFException e) {
            //System.out.println("EOF");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String patternYil = "(.*)(tarih|zaman|yıl)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String patternPuan = "(.*)(puan|değerlendirme|skor)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String patternPlayer = "(.*)(kişi|oyuncu|sayı)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String patternFiyat = "(.*)(fiyat|ücret|tutar)(.*)(oyun)(.*)(göster|listele|sırala)(.*)";
        String patternOyunTarihi = "(.*)(tarih|yıl|zaman)(.*)(bul)(.*)";
        String patternOyunBilgi = "(.*)(bilgi)(.*)(al|edin|ara)(.*)";
        String patternOyunTur = "(.*)(tür|çeşit)(.*)(oyun)(.*)";
        String patternFirmaOyunlari = "(.*)(şirket|firma)(.*)(oyun)(.*)";
        String patternNerdeSatis = "(.*)(oyun)(.*)(mağaza|satış|satın|nerede)(.*)";

        Pattern yil = Pattern.compile(patternYil);
        Pattern puan = Pattern.compile(patternPuan);
        Pattern player = Pattern.compile(patternPlayer);
        Pattern fiyat = Pattern.compile(patternFiyat);
        Pattern oyunTarihi = Pattern.compile(patternOyunTarihi);
        Pattern oyunBilgi = Pattern.compile(patternOyunBilgi);
        Pattern oyunTur = Pattern.compile(patternOyunTur);
        Pattern firmaOyunlari = Pattern.compile(patternFirmaOyunlari);
        Pattern nerdeSatis = Pattern.compile(patternNerdeSatis);
        
        pl.add(yil);
        pl.add(puan);
        pl.add(player);
        pl.add(fiyat);
        pl.add(oyunTarihi);
        pl.add(oyunBilgi);
        pl.add(oyunTur);
        pl.add(firmaOyunlari);
        pl.add(nerdeSatis);


        do {
            System.out.print("Please enter your question: ");
            Scanner reader = new Scanner(System.in);
            String s =reader.nextLine();
            QuestionHandler.enterQuestion(s);
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