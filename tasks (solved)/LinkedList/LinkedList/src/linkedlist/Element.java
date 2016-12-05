/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package linkedlist;

/**
 *
 * @author Kokes
 */
public class Element {

    // link to next element
    private Element link = null;
    // data
    private String data = "";

    public Element(String data) {
        this.link = null;
        this.data = data;
    }

    public Element() {
        this.link = null;
        this.data = null;
    }

    public String toString() {
        String s = "[data=" + data + "link=";
        if (link == null) {
            s += "null]";
        } else {
            s += "(" + link.data + ")]";
        }
        return s;
    }

    public Element getLink() {
        return link;
    }

    public void setLink(Element link) {
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
