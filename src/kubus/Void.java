/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kubus;

/**
 *
 * @author MOKLET-1
 */
public class Void {
    int sisi;
    int hasil;
    
    void New (int sisi){
        this.sisi=sisi;
    }
    int sisi (){
        
        return sisi;
    }
    int hitung (){
        hasil=6*sisi*sisi;
        System.out.println("Luas Permukaan : "+hasil);
    return hasil;
    }
}
