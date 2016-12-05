/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package linkedlist;

/**
 *
 * @author Kokes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create empty list - vytvořit prázdný seznam
        LinkedList demoList = new LinkedList();
        System.out.println(demoList.toString());
        
        // adding at the beginning - přidávání na začátek
        demoList.addFirst( new Element("one") );
        System.out.println(demoList.toString());
        demoList.addFirst( new Element("two") );
        System.out.println(demoList.toString());
        demoList.addFirst( new Element("three") );
        System.out.println(demoList.toString());
        
        // adding at the end - přidávání na konci
        demoList.addLast( new Element("aaa") );
        System.out.println(demoList.toString());
        demoList.addLast( new Element("bbb") );
        System.out.println(demoList.toString());
        
        // hledání - search
        System.out.println( demoList.indexOf("two") );
        
        // index-th element - vrací index-tý prvek
        System.out.println( demoList.get(2).getData() );
    }
        
}

/**
 * JAVADOC: 
 * 1) File --> Source Package, right click --> Tools --> Analyse JavaDoc
 * 2) edit
 * 3) Project --> Generate Javadoc
 */