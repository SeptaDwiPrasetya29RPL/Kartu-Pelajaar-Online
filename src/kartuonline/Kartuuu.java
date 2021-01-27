
package kartuonline;

import java.util.Scanner;


public class Kartuuu {
    static Scanner in = new Scanner(System.in);
    //Menambahkan Sifat Static pada Variable
    static String nama;
    static String nisn;
    static String ttl;
    static String kelamin;
    static String agama;
    static String alamat;
    
    static void kartu(){
        System.out.print("masukkan nama : ");
        nama = in.nextLine();
        System.out.print("masukkan nisn : ");
        nisn = in.nextLine();
        System.out.print("masukkan ttl : ");
        ttl = in.nextLine();
        System.out.print("masukkan jenis kelamin : ");
        kelamin = in.nextLine();
        System.out.print("masukkan agama : ");
        agama = in.nextLine();
        System.out.print("masukkan alamat : ");
        alamat = in.nextLine();
    }
    static void out(){
        System.out.println("=========================");
        System.out.println("----- KARTU PELAJAR -----");
        System.out.println("NAMA            : "+nama);
        System.out.println("NISN            : "+nisn);
        System.out.println("T.T.L           : "+ttl);
        System.out.println("JENIS KELAMIN   : "+kelamin);
        System.out.println("AGAMA           : "+agama);
        System.out.println("ALAMAT          : "+alamat);
        System.out.println("=========================");
        
    }
    }
    
    
    

