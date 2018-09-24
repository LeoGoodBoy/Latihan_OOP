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
public class Burung extends Hewan{
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
}
