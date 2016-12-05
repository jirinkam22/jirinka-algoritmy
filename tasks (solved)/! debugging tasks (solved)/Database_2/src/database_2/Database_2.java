package database_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Database_2 {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        double[] salary = new double[100];
        String[] name = new String[100];
        int count = 0;
        
        while(sc.hasNextLine()){
            name[count] = sc.next();
            salary[count] = sc.nextDouble();
            System.out.println(name [count] + " " + salary[count]);
            count++;
        }
        
        Scanner kbd = new Scanner(System.in);
        double x;
        
        System.out.println("enter salary");
        x = kbd.nextDouble();
        for(int i=0; i<count; i++){
            if (salary[i]==x){
                System.out.println(name [i] + " " + salary[i]);
                break;                
            }           
        }
    }
    
    }
    
}
