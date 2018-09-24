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
public class Kucing extends Hewan{
    private String warnaMata;

    public String getWarnaMata() {
        return warnaMata;
    }

    public void setWarnaMata(String warnaMata) {
        this.warnaMata = warnaMata;
    }
    public String getMakan(){
        return "Kucing Makan Ikan Asis";
    }
    
    /**
     * merupakan kelas override dari kelas kucing
     * @return menampilkan nilai String
     */
    @Override
    protected String mauMakanApa(){
        return "makan sesuatu yang cocok buat kucing";
    }
    
}
