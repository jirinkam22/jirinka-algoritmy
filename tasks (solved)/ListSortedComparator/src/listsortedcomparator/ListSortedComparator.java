/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package listsortedcomparator;

/**
 *
 * @author Kokes
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListSortedComparator {

    public static void main(String[] args) throws Exception {

        // my implementation of Comparator 
        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() < str2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // attributes
        final LinkedList<String> list = new LinkedList<>();
        String line;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // new input stream created
            fr = new FileReader(".//test.txt");
            br = new BufferedReader(fr);
            // reads all lines in stream
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            
            // sorting
            Collections.sort(list, myComparator);
            
            // print results
            for(String s : list){
                System.out.println(s);
            }
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        } finally {
            // releases system resources associated with this stream
            if (fr != null) {
                fr.close();
            }
        }
    }
}
