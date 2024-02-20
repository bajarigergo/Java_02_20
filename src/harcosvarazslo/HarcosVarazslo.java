/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harcosvarazslo;

import java.util.Random;

public class HarcosVarazslo {
    
    static Random veletlen = new Random();
    
    public static void main(String[] args) {
        String ures = "_";
        String harcos = "H";
        String varazslo = "V";
        String csata = "X";
        String palya = "___";
        String[] ter = {"_","_","_"};
        for (int i = 0; i < 10; i++) {
            int h = veletlen.nextInt(0,2);
            int v = veletlen.nextInt(0,2);
        if (v == h){
            ter[h] = csata;
        }else{
            ter[v] = varazslo;
            ter[h] = harcos;
        }
            for (int j = 0; j < ter.length; j++) {
                System.out.print(ter[j] +"");
            }
            System.out.println("");
        }
        
        }
    
    
}
