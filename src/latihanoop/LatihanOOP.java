/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanoop;

/**
 *
 * @author chochong
 */
public class LatihanOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kucing kucing = new Kucing();
        Hewan hewan = new Hewan();
        kucing.setNama("miaumiau");
        System.out.println(kucing.getNama());
        System.out.println(kucing.getMakan());
        System.out.println(kucing.mauMakanApa());
        System.out.println(kucing.mauMakanApa());
        System.out.println(hewan.mauMakanApa());  
    }
}
