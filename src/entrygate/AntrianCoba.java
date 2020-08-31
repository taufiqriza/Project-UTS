package entrygate;

import java.util.Scanner;

public class AntrianCoba {
    
    //Atribut antrian
    private static int pilihan, x;
    private static String no;
    private static String nama;
    private static String prodi;
    private static boolean kondisi;
    
    private static final Scanner read = new Scanner(System.in);
    private static final Queue ktm = new Queue();
    
    
    //Implementasi queue
    public static void main(String[] args) {
        do{
            System.out.println("+--------------------------------------+");
            System.out.println("|  PENDAFTARAN KTM PERPUSTAKAAN UNIDA  |");
            System.out.println("+--------------------------------------+");
            System.out.println("|              Pilihan Menu            |");
            System.out.println("+--------------------------------------+");
            System.out.println("+--------------------------------------+");
            System.out.println("|        1. Pendaftaran                |");
            System.out.println("|        2. Lihat Daftar Antrian       |");
            System.out.println("|        3. Panggil Pendaftar          |");
            System.out.println("|        0. Keluar                     |");
            System.out.println("+--------------------------------------+");
            System.out.println("\n");
            
            System.out.println("---Library Universitas Darussalam Gontor---");
            System.out.println("-----------------------");
            System.out.print(" Masukan pilihan menu :");
            pilihan = read.nextInt();
            switch (pilihan) {
                case 1:
                    pendaftaran();
                    break;
                case 2:
                    daftarAntrian();
                    break;
                case 3:
                    keluarAntrian();
                    break;
                default:
                    invalidMenu();
            }
        }while (pilihan != 0);
    }
    
    //Prosedur memasukan data pada queue
    static void pendaftaran(){
        System.out.println("+-------------+");
        System.out.println("| Pendaftaran |");
        System.out.println("+-------------+\n");
        System.out.println("________________________");
        System.out.println("Masukan No Pendaftaran :  " );
        no = read.next();
        System.out.print("Masukan Nama Pendaftar :");
        nama = read.next();
        System.out.print("1Masukan program studi  :");
        prodi = read.next();
        //Pendaftar kartu = new Pendaftar(no, nama, prodi,  kondisi);
        
        //ktm.enqueue(kartu, 0); 
    }
    
    //Melihat isi data pada queue
    static void daftarAntrian(){
        System.out.println(" Lihat Daftar Antrian :");
        System.out.println("----------------------");
        ktm.cetak(no, nama, prodi, kondisi);
    }
    
    //Prosedur mengambil/menghapus data pada antrian
    static void keluarAntrian() {
        System.out.println("Panggil Pendaftar");
        System.out.println("-----------------------------");
        if (ktm.kosong() == true) {
            System.out.println("Antrian telah kosong");
        }else{
            Object dtHapus =ktm.dequeue();
            System.out.printf("%s telah keluar dari antrian\n", dtHapus);
        }
    }
    
    //Prosedur untuk input pilihan menu keluar atau tidak ada
    static void invalidMenu(){
        if (pilihan == 0){
            System.out.println("+----------------------------------------+");
            System.out.println("|           Keluar dari Program          |");
            System.out.println("|  Library Universitas Darussalam Gontor |");
            System.out.println("+----------------------------------------+");
        }else{
            System.out.println("\nPILIHAN TIDAK TERSEDIA!");
            System.out.println("Silahkan Input Ulang Pilihan\n");
        }
    }
    
    
}
