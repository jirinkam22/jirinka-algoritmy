/*
 *  This Software is protected by copyright law and international treaties.
 *  This Software is licensed (not sold), and its use is subject
 *  to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 *  The unauthorized use, copying or distribution of this Software
 *  may result in severe criminal or civil penalties,
 *  and will be prosecuted to the maximum extent allowed by law.
 */
package hashmapexamples;

import java.util.*;

/**
 *
 * @author Kokes
 */
public class HashMapExamples {

    public static void main(String args[]) {

        // Create a hash map
        HashMap hm = new HashMap();
        HashMap<String, Double> gm = new HashMap<>();

        // Put elements to the map
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));
        
        // Put elements to the generic map
        gm.put("Alpha", new Double(3434.34));
        gm.put("Beta", new Double(123.22));
        gm.put("Gamma", new Double(1378.00));
        gm.put("Delta", new Double(99.22));
        gm.put("Theta", new Double(-19.08));
        
        /**
         * Syntax with iterators and comparators
         */
        // Get a set of the entries
        Set set = hm.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        /**
         * Syntax with extended FOR
         */
        // Display elements
        for(String key : gm.keySet()){
            System.out.printf("%s: %f\n", key, gm.get(key));
        }
                
        // Deposit 1000 into Zara's account
        double balance = ((Double) hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + hm.get("Zara"));

        // Deposit 2000 into Alpha account
        balance = gm.get("Alpha");
        gm.put("Alpha", new Double(balance + 2000));
        System.out.println("New balance for Alpha: " + gm.get("Alpha"));
    }
}
