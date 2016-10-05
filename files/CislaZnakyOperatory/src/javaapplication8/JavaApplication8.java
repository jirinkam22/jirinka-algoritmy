/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author kokesjos
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*****************************
 *  Deklarace a inicializace *
 *****************************/
int i1; //pouze deklarace
i1 = 1500; //inicializace

int i2 = 1500; //deklarace s inicializaci - doporuceny postup
int i3, i4, i5; //deklarace vice promennych - neni doporuceno
int i6 = 7, i7 = 15, i8 = 17; //toto take neni doporuceno

/*****************************
 *         Cela cisla        *
 *****************************/
byte b = 100; //byte

short s = -30000; //short - zaporne cislo
short s2 = 30000; //short - kladne cislo

int i = 10000;

long l = 100;
long l2 = 150000000000l; //long - prilis velke cislo
long l3 = 150000000000L; //long - varianta L

/*****************************
 *        Realna cisla       *
 *****************************/
double d = 100.5;
double d2 = 0.5;
double d3 = d2-d; //0.5
double d4 = d2*d; //0.5
double d5 = d2/d; //0.5

float f = 100.5f;
float f2 = 100.5F;

/*****************************
 *           Znaky           *
 *****************************/
char ch = 'A';
char ch2 = 65; // A (ASCII hodnota)
char ch3 = '\u0041';

/*****************************
 *       Logicke hodnoty     *
 *****************************/
boolean bool = true;
boolean bool2 = false;

/*****************************
 *       Priklad vypisu      *
 *****************************/
System.out.println(d);
System.out.println(d2);
System.out.println(d3);
System.out.println(d5);
System.out.println(d4);


    }
    
}
