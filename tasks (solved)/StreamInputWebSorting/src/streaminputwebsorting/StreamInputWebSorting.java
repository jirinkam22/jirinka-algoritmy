package streaminputwebsorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;

public class StreamInputWebSorting {

    public static void main(String[] args) {
        try {
            LinkedList<String> list = new LinkedList<>();
            
            URL url = new URL("http://www.azlyrics.com/lyrics/beatles/julia.html");
            InputStream inputStream = url.openStream();
            InputStreamReader reader = new InputStreamReader(inputStream);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            
            list.sort(null);
            
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
