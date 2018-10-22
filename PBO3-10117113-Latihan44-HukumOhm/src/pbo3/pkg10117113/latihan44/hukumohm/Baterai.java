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
public class Baterai {
    private float kuatArus;
  private float hambatan;

    public Baterai() {
      System.out.println("=====HUKUM Ohm=====");
      System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
      System.out.println("akan berbanding lurus dengan beda potensial");
      System.out.println("pada ujung-ujung kawat penghantar tersebut");
      System.out.println("asalkan suhub kawat dijaga konstan."); 
    }
  
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
   public float hitungTegangan() {
      
       return kuatArus * hambatan;
       
   }
}
