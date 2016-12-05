/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package longestlinelist;

/**
 *
 * @author Kokes
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.LinkedList;

public class LongestLineList {

    public static void main(String[] args) throws Exception {

        // attributes
        int max = 0;
        String maxStr = null;
        String s = null;
        FileReader fr = null;
        BufferedReader br = null;
        final LinkedList<String> list = new LinkedList<>();

        try {
            // new input stream created
            fr = new FileReader(".//test.txt");
            br = new BufferedReader(fr);
            // reads all lines in stream
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
            // calculate results
            for(String item : list){
                if(item.length() > max){
                    max = item.length();
                    maxStr = item;
                }
            }
            System.out.println(maxStr);
            System.out.println(max);
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
