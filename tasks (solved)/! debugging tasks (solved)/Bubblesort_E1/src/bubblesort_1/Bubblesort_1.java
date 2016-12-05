package bubblesort_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Bubblesort_1 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        int[] x = new int[100];
        int count = 0;
        
        while(sc.hasNextInt()){
            x[count] = sc.nextInt();
            System.out.println(x[count]);
            count++;
        }
        
        System.out.println("*********************");
        
        for(int j = 0; j<count; j++){
            for(int i = 0; i<count-1; i++){
                if(x[i]<x[i+1]) {
                    int aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
        }
        
        for(int i=0; i<count; i++){
            System.out.println(x[i]);
        
        }
    }
    
}
