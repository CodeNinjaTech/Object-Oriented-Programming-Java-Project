/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author leftq
 */
public class Main {
    public static void main(String[] args) {
        
        Student lefteris = new Student(1111, "Lefteris", "Souflas", "JAVA", 2010, 4);
        System.out.println(lefteris.toString());
        
        Staff souflas = new Staff(1111, "Lefteris", "Souflas", "SSE", 1200.123456789);
        System.out.println(souflas.toString());

    }//main
}//class
