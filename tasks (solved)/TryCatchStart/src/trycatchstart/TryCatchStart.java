package trycatchstart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatchStart {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("demo.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner sc = new Scanner(br);
            
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);
            }
        } catch (Exception e) {
            System.err.println("ERROR");
        }
    }

}
