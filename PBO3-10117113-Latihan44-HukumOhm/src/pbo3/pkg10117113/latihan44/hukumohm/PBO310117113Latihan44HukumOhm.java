/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan44.hukumohm;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menghitung tegangan/hukum ohm
 *            
 */
public class PBO310117113Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Baterai objBaterai = new Baterai(3, 12);
      Baterai objBaterai2 = new Baterai();
      System.out.println("");
      System.out.println("Kuat Arus : " + objBaterai.getKuatArus() + "ampere");
      System.out.println("Hambatan  : " + objBaterai.getHambatan() + "ohm");
      System.out.println("Hasil Tegangan : " + objBaterai.hitungTegangan() 
                         + "volt");
    }
    
}
