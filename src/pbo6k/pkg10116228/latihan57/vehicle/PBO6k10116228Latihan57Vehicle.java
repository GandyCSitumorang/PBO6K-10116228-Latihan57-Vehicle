/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan57.vehicle;
/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripso Program : program ini berisi program yang menampilkan konstruktor
 *                    dari Vehicle
 */
public class PBO6k10116228Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyMOdel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyMOdel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        
        System.out.println("");
  
        Skateboard sb = new Skateboard();
        sb.setMyBrand("Ally Skate");
        sb.setMyMOdel("Rocket");
        sb.setMyBoardLenght(54.5);
        System.out.println("Brand : "+sb.getMyBrand());
        System.out.println("Model : "+sb.getMyMOdel());
        System.out.println("Panjangnya Board : "+sb.getMyBoardLenght());
        
    }
    
}
