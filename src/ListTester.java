import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.Random;

/**
 * fügt zahlen zu listen hinzu, löscht zahlen, gibt die summe der elemente zurück und die Liste als String
 * @author Julia Stuppnig
 * @version 06.05.2025
 */
public class ListTester {

    /**
     * liste wird mit anzahl an zahlen befüllt
     * @param liste eingegebene liste
     * @param anzahl anzahl der zahlen in liste
     */
    public static void addEnd(List<Integer> liste, int anzahl){
        Random random = new Random();

        for (int i = 0; i < anzahl; i++) {
            int zufallsZahl = random.nextInt(100);
            liste.add(zufallsZahl);
        }
    }

    /**
     * fügt am anfang der liste zahlen hinzu statt am ende
     * @param liste die gegebene liste
     * @param anzahl die anzahl der zahlen
     */
    public static void addFirst(List<Integer> liste, int anzahl){
        Random random = new Random();

        for (int i = 0; i < anzahl; i++) {
            int zufallsZahl = random.nextInt(100);
            liste.add(0, zufallsZahl);
        }
    }

    /**
     * löscht jedes 2. element in der liste
     * @param liste die gegebene liste
     */
    public static void deleteHalf(List<Integer> liste){
        Iterator<Integer> it = liste.iterator();
        int i = 1;
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }

    /**
     * summiert alle elemente mittels iterator
     * @param liste die gegebene liste
     * @return die summe
     */
    public static int summeIterator(List<Integer> liste){
        Iterator<Integer> it = liste.iterator();
        int summe = 0;
        while(it.hasNext()){
            summe = summe + it.next();
        }
        return summe;
    }

    /**
     * summiert alle elemente der liste mittels index
     * @param liste die gegebene liste
     * @return die summe
     */
    public static int summeIndex(List<Integer> liste){
        int summe = 0;
        for(int i = 0; i<liste.size(); i++){
            summe = summe + liste.get(i);
        }
        return summe;
    }

    /**
     * fasst alle elemente in einem string mittels iterator zusammen
     * @param liste die gegebene liste
     * @return der String
     */
    public static String listeIterator(List<Integer> liste){
        String alleElemente = "";
        Iterator<Integer> it = liste.iterator();

        while(it.hasNext()){
            alleElemente = alleElemente + it.next();
        }
        return alleElemente;
    }

    /**
     * fasst alle elemente in einem string mittels index zusammen
     * @param liste die gegebene liste
     * @return der String
     */
    public static String listeIndex(List<Integer> liste){
        String alleElemente = "";

        for(int i = 0; i<liste.size(); i++){
            alleElemente = alleElemente + liste.get(i);
        }
        return alleElemente;
    }
}
