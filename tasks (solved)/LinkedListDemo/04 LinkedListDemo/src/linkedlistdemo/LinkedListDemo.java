/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author kokesjos
 */
public class LinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
//        LinkedList<String> list = new LinkedList<>();
//        ArrayList<String> list = new ArrayList<>();
        
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        
        int[] arr = new int[5];
        list.add(arr);
        
        System.out.println(list.toString());
        
//        Double d = 3.14;
//        list.add(d);
//        list.add(Double.valueOf("3.14"));

        System.out.println(list.toString());
        
        System.out.println(list.get(3));
        System.out.println(list.indexOf("Four"));
                
    }
    
}
