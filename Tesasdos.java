/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesasdos;

import java.util.Scanner;

/**
 *
 * @author wahyuwijayakris
 */
public class Tesasdos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String[][] data = new String[10][3];
        data[0][0] = "Wahyu";
        data[0][1] = "682018022";
        data[0][2] = "SI";

        data[1][0] = "Edi";
        data[1][1] = "672018223";
        data[1][2] = "TI";

        while (true) {
            int jumlah = 0;
            for (int i = 0; i < 10; i++) {
                if (data[i][0] == null) {
                    break;
                }
                jumlah = i;
            }

            System.out.println("Data Mahasiswa");
            System.out.println("1. List Mahasiswa\n"
                    + "2. Tambah Mahasiswa Baru\n"
                    + "3. Perbaharui Data Mahasiswa\n"
                    + "4. Hapus Data Mahasiswa\n"
                    + "5. Stop");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {

                case 1:
                    System.out.println("List Mahasiswa");
                    for (int i = 0; i < 10; i++) {
                        if (data[i][0] == null) {
                            break;
                        }
                        System.out.println("Nama : " + data[i][0] + " NIM : " + data[i][1] + " Progdi : " + data[i][2]);
                    }
                    System.out.println();
                    break;

                case 2:
                    if (jumlah < 10) {
                        System.out.println("Tambah Mahasiswa");
                        System.out.print("Nama : ");
                        data[jumlah + 1][0] = input.next();
                        System.out.print("NIM : ");
                        data[jumlah + 1][1] = input.next();
                        System.out.print("Progdi : ");
                        data[jumlah + 1][2] = input.next();
                        System.out.println("Data Berhasil Di Tambah");
                        System.out.println();
                        break;

                    } else {
                        System.out.println("data kelebihan");
                        break;
                    }

                case 3:
                    System.out.println("Perbaharui Data Mahasiswa");

                    for (int i = 0; i < 10; i++) {
                        if (data[i][0] == null) {
                            break;
                        }
                        System.out.println((i + 1) + ". " + "Nama : " + data[i][0] + " NIM : " + data[i][1] + " Progdi : " + data[i][2]);
                    }
                    System.out.println();
                    System.out.print("Pilih Mahasiswa Sesuai Nomernya : ");
                    int nomer = input.nextInt();
                    if (nomer <= jumlah + 1) {
                        System.out.println("1. Nama : " + data[nomer - 1][0]);
                        System.out.println("2. NIM : " + data[nomer - 1][1]);
                        System.out.println("3. Progdi : " + data[nomer - 1][2]);
                    } else {
                        System.err.println("nomer tidak ada");
                        System.out.println();
                        break;
                    }
                    System.out.println();
                    System.out.print("Nomer Data yang akan di perbaharui : ");
                    int nomer2 = input.nextInt();
                    if (nomer2 == 1 || nomer2 == 2 || nomer2 == 3) {
                        System.out.println();
                        System.out.print("perbaharuan : ");
                        String baru = input.next();
                        data[nomer - 1][nomer2 - 1] = baru;
                        System.out.println("Data Berhasil Di Perbaharui");
                        System.out.println();
                    } else {
                        System.err.println("nomer tidak ada");
                        System.out.println();
                    }
                    break;
                case 4:

                    for (int i = 0; i < 10; i++) {
                        if (data[i][0] == null) {
                            break;
                        }
                        System.out.println((i + 1) + ". " + "Nama : " + data[i][0] + " NIM : " + data[i][1] + " Progdi : " + data[i][2]);
                    }
                    System.out.println();
                    System.out.println("Pilih nomer Mahasiswa yang ingin di Hapus : ");
                    int nomer3 = input.nextInt();
                    if (nomer3 <= jumlah + 1) {
                        data[nomer3 - 1][0] = "-";
                        data[nomer3 - 1][1] = "-";
                        data[nomer3 - 1][2] = "-";
                        System.out.println("Data Berhasil Dihapus");
                        break;
                    } else {
                        System.err.println("nomer tidak ada");
                        System.out.println();
                        break;
                    }
                case 5:
                    System.out.print("Terima Kasih!!");
                    System.exit(0);
            }
        }
    }

}
