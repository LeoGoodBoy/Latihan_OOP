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
public class Burung extends Hewan implements JalanInterface,JenisParuh{
    private String suara;

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }
    
    public String nyaniyan(){
        return "lalal";
    }
    //TEST

    @Override
    public String caraJalan() {
        return "loncat dan terbang";
    }

    @Override
    public String jalanMenggunakan() {
        return "dua kaki atau sayap";
    }

    @Override
    public String jenisParuh() {
        return "paruhnya kecil";
    }
}
