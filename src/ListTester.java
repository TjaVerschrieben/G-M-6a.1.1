import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.Random;
public class ListTester {
    public static void addEnd(List<Integer> liste, int anzahl){
        liste = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < anzahl; i++) {
            int zufallsZahl = random.nextInt(100);
            liste.add(zufallsZahl);
        }
    }

    public static void addFirst(List<Integer> liste, int anzahl){
        liste = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < anzahl; i++) {
            int zufallsZahl = random.nextInt(100);
            liste.add(0, zufallsZahl);
        }
    }

    public static void deleteHalf(List<Integer> liste){
        liste = new ArrayList<>();
        Iterator<Integer> it = liste.iterator();
        int i = 1;
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }

    public static int summeIterator(List<Integer> liste){
        liste = new ArrayList<>();
        Iterator<Integer> it = liste.iterator();
        int summe = 0;
        while(it.hasNext()){
            summe = summe + it.next();
        }
        return summe;
    }

    public static int summeIndex(List<Integer> liste){
        liste = new ArrayList<>();
        int summe = 0;
        for(int i = 0; i<liste.size(); i++){
            summe = summe + liste.get(i);
        }
        return summe;
    }

    public static String listeIterator(List<Integer> liste){
        liste = new ArrayList<>();
        String alleElemente = "";
        Iterator<Integer> it = liste.iterator();

        while(it.hasNext()){
            alleElemente = alleElemente + it.next();
        }
        return alleElemente;
    }

    public static String listeIndex(List<Integer> liste){
        liste = new ArrayList<>();
        String alleElemente = "";

        for(int i = 0; i<liste.size(); i++){
            alleElemente = alleElemente + liste.get(i);
        }
        return alleElemente;
    }
}
