/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package streamoutputfile;

import java.io.*;

/**
 *
 * @author Kokes
 */
public class StreamOutputFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            byte[] data = {0x61, 0x62, 0x63, 0x64};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < data.length; x++) {
                os.write(data[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
