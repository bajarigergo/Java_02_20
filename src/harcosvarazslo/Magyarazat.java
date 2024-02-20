/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harcosvarazslo;

/**
 *
 * @author BajáriGergő(SZF_2023
 */
public class Magyarazat {
    public static void main(String[] args) {
    String eredeti = "abc.12x";
       
    System.out.println("első: "+ eredeti.charAt(0));
    System.out.println("utolsó: "+ eredeti.charAt(eredeti.length()-1));
    String uj = eredeti.substring(3);
    System.out.println(uj);
    
    uj = eredeti.substring(4,6);
    System.out.println(uj);
    
    int k = eredeti.indexOf(".");
    int v = eredeti.length();
    
    uj = eredeti.substring(4,6);
    int szam = Integer.parseInt(uj);
    System.out.println(szam+2);
    boolean abcKezdes = eredeti.startsWith("abc");
    boolean vege2x = eredeti.endsWith("2x");
    boolean vanBennePont = eredeti.contains(".");
    System.out.println("abc-vel kezdődik: " + abcKezdes);
    System.out.println("2x a vége. " + vege2x);
    System.out.println("van benne \".\" : " + vanBennePont);
    
    String csere = eredeti.replace("x", "q");
    System.out.println(csere);
    
    
    }

}

