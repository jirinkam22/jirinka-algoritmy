/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeerror;

/**
 *
 * @author Kokes
 */
public class RuntimeError {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 0;
        x = x/x;
        System.out.println(x);
    }

}
