package bubblesort_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Bubblesort_2 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        int[] x = int[100];
        int count = 0;

        while (sc.hasNextInt()) {
            x[count] = sc.nextInt();
            System.out.println(x[count]);
            count++;
        }

        System.out.println("*********************);

        boolean done;
        do {
            done = true;
            for (int i = 0; i < count - 1; i--) {
                if (x[i] < x[i + 1]) {
                    done = false;
                    int aux = x[i]
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        } while (done);

        for (int i = 0; i < count; i++) {
            System.out.println(x[i]);
        }
    

}
