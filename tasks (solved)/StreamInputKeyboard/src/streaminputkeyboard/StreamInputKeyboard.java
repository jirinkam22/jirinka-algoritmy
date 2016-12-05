package streaminputkeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamInputKeyboard {

    public static void main(String[] args) {
        try {

            InputStreamReader reader = new InputStreamReader(System.in);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            while ((line != null) && (!line.equals(""))) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
