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
public class Hewan implements JalanInterface{
    private String nama;
    private int umur;
    private char jeniskelamin;

    /**
     * 
     */
    public Hewan(){
        
    }
    /**
     * 
     * @param nama
     * @param umur
     * @param jeniskelamin 
     */
    public Hewan(String nama, int umur, char jeniskelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jeniskelamin = jeniskelamin;
    }
    
    /**
     * 
     * @return 
     */
    public String getNama() {
        return nama;
    }

    /**
     * 
     * @param nama 
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * 
     * @return 
     */
    public int getUmur() {
        return umur;
    }

    /**
     * 
     * @param umur 
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * 
     * @return 
     */
    public char getJeniskelamin() {
        return jeniskelamin;
    }

    /**
     * 
     * @param jeniskelamin 
     */
    public void setJeniskelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    
    /**
     * 
     * @return 
     */
    protected String mauMakanApa(){
        return "makan sesuatu";
    }

    @Override
    public String caraJalan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String jalanMenggunakan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
