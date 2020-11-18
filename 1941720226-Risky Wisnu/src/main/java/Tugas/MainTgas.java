/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risky
 */
public class MainTgas {
    public static void main(String[] args) {
        Singa sga=new Singa("Singa",4,"arghhh","Coklat ");
        Keledai kel=new Keledai("Keledai",4,"ngihaa","Putih");
        Gorilla gor=new Gorilla("Gorilla",2,"gerrr","Hitam ");
        
        sga.displayBinatang();
        sga.displayMakan();
        sga.displayData();
        System.out.println("");
        kel.displayBinatang();
        kel.displayMakan();
        kel.displayData();
        System.out.println("");
        gor.displayBinatang();
        gor.displayMakan();
        gor.displayData();
        System.out.println("");
    }
}
