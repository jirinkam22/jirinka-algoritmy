/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package linkedlist;

/**
 *
 * @author Kokes
 */
public class LinkedList {

    private Element head = null;
    private Element last = null;
    private int count = 0;

    public LinkedList() {
        last = new Element("sentinel");
        head = last;            // head i last ukazují na sentinel
        count = 0;              // both head and last point to sentinel
    }

    public int length() {
        return count;
    }

    public String toString() {
        String s = "";          // empty string - prázdný string
        Element i = head;       // i=auxiliary reference - i=pomocná reference        
        while (i != null) {     // loop for all elements - cyklus pro všechny elementy
            s = s + i.getData() + "-->";
            i = i.getLink();
        }
        return s;
    }

    public int addFirst(Element e) {
        e.setLink(head);
        head = e;
        count++;
        return count;
    }

    public int addLast(Element e) {
        last.setData(e.getData());
        Element newSentinel = new Element("sentinel");
        last.setLink(newSentinel);
        last = newSentinel;
        count++;
        return count;
    }

    public int indexOf(String key) {
        Element e = head;
        int index = -1;
        while (e != null) {
            index++;
            if (e.getData().equals(key)) {
                return index;
            }
            e = e.getLink();
        }
        return -1;
    }

    public Element get(int index) {
        if ((index < 0) || (index >= count)) {
            return null;
        }
        Element e = head;
        for (int i=0; i<index; i++){
            e = e.getLink();
        }
        return e;
    }

}
