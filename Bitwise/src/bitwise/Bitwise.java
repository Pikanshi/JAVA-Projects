/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwise;

/**
 *
 * @author asagarw
 */
public class Bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        byte a = 9, b = 12;
        byte c;
        c = (byte)(9 << 4);
        c = (byte)(c | 12);
        
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
    
}
