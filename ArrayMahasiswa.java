/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ArrayMahasiswa { 
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Masukan jumlah data yang akan di input : ");
         int A = input.nextInt();
        Mahasiswa[] arrayMhs = new Mahasiswa[A];
        for (int i = 0 ; i < A ; i++) {
            input.nextLine();
            System.out.print("Masukan Nim     : ");
            String N = input.nextLine();
            System.out.print("Masukan Nama    : ");
            String C = input.nextLine();
            System.out.print("Masukan Jurusan : ");
            String D = input.nextLine();
            System.out.print("Masukan IPK     : ");
            double E = input.nextDouble();
            Mahasiswa mhs = new Mahasiswa(N,C,D,E);
            arrayMhs[i] = mhs;
            System.out.println(" ");
            
        }
        for (int i = 0; i < arrayMhs.length; i++) {
            System.out.println("\nMahasiswa ke-"+(i+1));
            System.out.println("Nim     : "+arrayMhs[i].getNim());
            System.out.println("Nama    : "+arrayMhs[i].getNama());
            System.out.println("Jurusan : "+arrayMhs[i].getJurusan());
            System.out.println("IPK     : "+arrayMhs[i].getIpk());
        }
    }
}

  