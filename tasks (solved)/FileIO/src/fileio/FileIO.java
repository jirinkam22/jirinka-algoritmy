/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Virtual
 */
public class FileIO {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        BufferedReader rdBuf = new BufferedReader(fr);
        FileWriter fw = new FileWriter("b.txt");
        BufferedWriter wrBuf = new BufferedWriter(fw);
        String s;
        
        while((s = rdBuf.readLine()) != null) {
            System.out.println(s);
            wrBuf.write(s);
            wrBuf.newLine();
        }
        
        wrBuf.close();
        fw.close();
    }
    
}
