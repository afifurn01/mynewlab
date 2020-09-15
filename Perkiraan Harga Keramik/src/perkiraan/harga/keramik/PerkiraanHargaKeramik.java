/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkiraan.harga.keramik;

import java.util.Scanner;
/**
 *
 * @author Afif
 */
public class PerkiraanHargaKeramik {
    
    double Keramik_A;
    double Keramik_B;
    double Keramik_C;
    int Harga_A;
    int Harga_B;
    int Harga_C;
    
    void setnilai () {
        this.Keramik_A = 0.9 * 10;
        this.Keramik_B = 1.6 * 5;
        this.Keramik_C = 1.2 * 8;
        this.Harga_A = (int) Math.ceil (54000) ;
        this.Harga_B = (int) Math.ceil (65000) ;
        this.Harga_C = (int) Math.ceil (60000) ;
                
    }
    
    void perkiraan () {
        
        int Luas;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println ("-----------------------------------------------------");
        System.out.println ("         ### Perkiraan Harga Keramik ###         ");
        System.out.println ("-----------------------------------------------------");
        System.out.println ("Keramik A : 30 x 30 , 54.000/box , 1 box = 10 pcs");
        System.out.println ("Keramik B : 40 x 40 , 65.000/box , 1 box = 5 pcs");
        System.out.println ("Keramik C : 30 x 40 , 60.000/box , 1 bok = 8 pcs");
        System.out.println ("-----------------------------------------------------");
        System.out.print ("luas permukaan yang akan dipasang keramik (m) : ");
        
        Luas = keyboard.nextInt();
        
        int box_a = (int) Math.ceil (Luas / this.Keramik_A);
        int box_b = (int) Math.ceil (Luas / this.Keramik_B);
        int box_c = (int) Math.ceil (Luas / this.Keramik_C);
        
        double harga_a = Math.ceil (box_a * this.Harga_A) ;
        double harga_b = Math.ceil (box_b * this.Harga_B) ;
        double harga_c = Math.ceil (box_c * this.Harga_C) ;
        
        System.out.println ("-----------------------------------------------------");
        System.out.println ("Jumlah Keramik Yang Diperlukan Adalah (box): " + box_a);
        System.out.println ("Jumlah Keramik Yang Diperlukan Adalah (box): " + box_b);
        System.out.println ("Jumlah Keramik Yang Diperlukan Adalah (box): " + box_c);
        System.out.println ("-----------------------------------------------------");
        System.out.println ("Perkiraan Harga Keramik A : Rp " + harga_a);
        System.out.println ("Perkiraan Harga Keramik B : Rp " + harga_b);
        System.out.println ("Perkiraan Harga Keramik C : Rp " + harga_c);        
        System.out.println ("-----------------------------------------------------");
    }
    
    
    public static void main(String[] args) {
                
        PerkiraanHargaKeramik A = new PerkiraanHargaKeramik ();
        A.setnilai();
        A.perkiraan();
        
    }
    
}

