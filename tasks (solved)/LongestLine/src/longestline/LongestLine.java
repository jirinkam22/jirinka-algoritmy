/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package longestline;

/**
 *
 * @author Kokes
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

public class LongestLine {

    public static void main(String[] args) throws Exception {

        // attributes
        int max = 0;
        String maxStr = null;
        String s = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // new input stream created
            fr = new FileReader(".//test.txt");
            br = new BufferedReader(fr);

            // reads till the end of the stream
            while ((s = br.readLine()) != null) {
                // prints string
//                System.out.println(s);
                // remember longest till now
                if (s.length() > max) {
                    max = s.length();
                    maxStr = s;
                }
            }
            // print results
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
