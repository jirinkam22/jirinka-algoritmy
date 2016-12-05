package streaminputscanner;

import java.util.Scanner;

public class StreamInputScanner {

    public static void main(String[] args) {

        String s = "Hello World! 3 + 3,0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // check if the scanner has a token
        System.out.println("" + scanner.hasNext());

        // print token
        System.out.println("" + scanner.next());

        // print token
        System.out.println("" + scanner.next());

        // print integer
        System.out.println("" + scanner.nextInt());

        // print token
        System.out.println("" + scanner.next());

        // print double
        System.out.println("" + scanner.nextDouble());

        // print the rest of line
        System.out.println("" + scanner.nextLine());

        // check if the scanner has a line
        System.out.println("" + scanner.hasNext());

        // close the scanner
        scanner.close();
    }
}

