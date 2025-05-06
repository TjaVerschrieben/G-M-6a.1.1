import javax.swing.*;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;


public class main {
    public static void main(String[] args){
        List<Integer> meineListe = new ArrayList<>();
        List<Integer> meineListe2 = new LinkedList<>();

        System.out.println("1: Elemente am Ende hinzufügen");

        long start = System.nanoTime();
        ListTester.addEnd(meineListe, 20000);
        long end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/10000);

        start = System.nanoTime();
        ListTester.addEnd(meineListe2, 20000);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/10000);

        System.out.println("2: Elemente am Anfang hinzufügen");

        start = System.nanoTime();
        ListTester.addFirst(meineListe, 20000);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/10000);

        start = System.nanoTime();
        ListTester.addFirst(meineListe2, 20000);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/10000);

        System.out.println("3: mit Iterator summieren");

        start = System.nanoTime();
        ListTester.summeIterator(meineListe);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/1000);

        start = System.nanoTime();
        ListTester.summeIterator(meineListe2);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/1000);

        System.out.println("4: mit Index summieren");

        start = System.nanoTime();
        ListTester.summeIndex(meineListe);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/1000);

        start = System.nanoTime();
        ListTester.summeIndex(meineListe2);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/1000);

        System.out.println("5: mit iterator zusammensetzen");

        start = System.nanoTime();
        ListTester.listeIterator(meineListe);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/100000);

        start = System.nanoTime();
        ListTester.listeIterator(meineListe2);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/100000);

        System.out.println("6: mit index zusammensetzen");

        start = System.nanoTime();
        ListTester.listeIndex(meineListe);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/100000);

        start = System.nanoTime();
        ListTester.listeIndex(meineListe2);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/100000);

        System.out.println("7: hälfte löschen");

        start = System.nanoTime();
        ListTester.deleteHalf(meineListe);
        end = System.nanoTime();
        System.out.println("ArrayList: " + (end-start)/10000);

        start = System.nanoTime();
        ListTester.deleteHalf(meineListe2);
        end = System.nanoTime();
        System.out.println("LinkedList: " + (end-start)/10000);


    }
}
