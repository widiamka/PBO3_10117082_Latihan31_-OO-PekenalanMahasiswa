/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan31_.object.oriented.perkenalanmahasiswa;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk memperkenalkan mahasiswa 
* dengan nim juga dan dari data yang ada
 */
public class PBO3_10117082_Latihan31_ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
     mhs1.nim = "10117082";
     mhs1.nama = "WIDIAMEGA K";
     mhs1.perkenalanDiri(mhs1.nim, mhs1.nama);
     
         Mahasiswa mhs2 = new Mahasiswa();
     mhs2.nim = "10117098";
     mhs2.nama = "SANTI S";
     mhs2.perkenalanDiri(mhs2.nim, mhs2.nama);     
        
      Mahasiswa mhs3 = new Mahasiswa();
     mhs3.nim = "19953012";
     mhs3.nama = "KIM TAEHYUNG";
     mhs3.perkenalanDiri(mhs3.nim, mhs3.nama);
     
                
      
    }
    
}
