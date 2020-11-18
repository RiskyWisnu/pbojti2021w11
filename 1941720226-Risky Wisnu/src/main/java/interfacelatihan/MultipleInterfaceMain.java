/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author Risky
 */
public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
       
        pakrektor.beriSertifikatMawapres(sarjanaCum);
        
        pakrektor.beriSertifikatMawapres(masterCum);
    }
}

