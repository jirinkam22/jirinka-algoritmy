/*
 *  This Software is protected by copyright law and international treaties.
 *  This Software is licensed (not sold), and its use is subject
 *  to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 *  The unauthorized use, copying or distribution of this Software
 *  may result in severe criminal or civil penalties,
 *  and will be prosecuted to the maximum extent allowed by law.
 */
package overdriving;

/**
 *
 * @author Kokes
 */
public class Overdriving {

    private static class Man {

        String name;
        int age;
        double height;
        double weight;

        String getData() {
            String s = String.format("name=%s, age=%d, height=%f, weight = %f",
                    name, age, height, weight);
            return s;
        }

        Man() {
            name = "John Doe";
            age = 5;
            height = 176;
            weight = 80.5;
        }

        Man(String aName) {
            name = aName;
            age = 5;
            height = 176;
            weight = 80.5;
        }

        Man(String name, int age){
            this.name = name;
            this.age = age;
            height = 176;
            weight = 80.5;
        }
        
        Man(String name, int age, double height, double width){
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = width;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Man a = new Man();
        System.out.println(a.getData());

        Man b = new Man("Ben Williams", 22);
        System.out.println(b.getData());

        Man c = new Man("Charles Aznavour", 32, 192, 83.5);
        System.out.println(c.getData());
    }

}
