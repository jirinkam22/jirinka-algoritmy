package sincos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class SinCos {

    public static void main(String[] args) throws IOException {
        sineWriter();
        cosineWriter(); 
    }

    static void sineWriter() throws IOException{
        FileWriter fw = new FileWriter("SinData.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        double step = 2 * PI / 1000;
        for(int i=0; i<=1000; i++){
            double x = i/1000.0;
            double y = sin(i * step);
            bw.write( Double.toString(x) + " " + Double.toString(y) );
            bw.newLine();
        }
        
        bw.close();
        fw.close();
    } 
    
    static void cosineWriter() throws IOException{
        FileWriter fw = new FileWriter("CosData.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        double step = 2 * PI / 1000;
        
        for(int i=0; i<250; i++){
            double x = i/1000.0;
            double y = sin(i * step);
            y = sqrt(1-y*y);
            bw.write( Double.toString(x) + " " + Double.toString(y) );
            bw.newLine();
        }
        for(int i=250; i<750; i++){
            double x = i/1000.0;
            double y = sin(i * step);
            y = - sqrt(1-y*y);
            bw.write( Double.toString(x) + " " + Double.toString(y) );
            bw.newLine();
        }
        for(int i=750; i<=1000; i++){
            double x = i/1000.0;
            double y = sin(i * step);
            y = sqrt(1-y*y);
            bw.write( Double.toString(x) + " " + Double.toString(y) );
            bw.newLine();
        }
                
        bw.close();
        fw.close();
    } 
}
