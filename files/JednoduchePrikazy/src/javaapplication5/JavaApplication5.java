package javaapplication5;

/**
 *
 * @author kokesjos
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
String c = "";        
String s = "hokus pokus";
String aei="aeiouy";
String bcd="bcdfghjklmnpqrstvwxz";
        int a=0;        int b = 0;
for(int i = 1; i < s.length(); i++){
    c = "";
    c = c+s.charAt(i);
if (aei.contains(c)) a++;
if (bcd.contains(c)) b++;
}

System.out.println(a);
System.out.println(b);
System.out.println(s.length()-a-b);
    }
}
