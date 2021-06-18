package latihan_crud;

import java.io.*;
import java.time.Year;
import java.util.*;

public class Latihan_CRUD {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String pilihanUser;
        boolean lanjut = true;
        while (lanjut == true) {
            System.out.println("Database Perpustakaan");
            System.out.println("    1. lihat seluruh buku");
            System.out.println("    2. cari data buku");
            System.out.println("    3. tambah data buku");
            System.out.println("    4. ubah data buku");
            System.out.println("    5. hapus data buku");

            System.out.print("\n \nPilihan anda : ");
            pilihanUser = scan.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("LIST SELURUH BUKU");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("CARI DATA BUKU");
                    cariData();
                    break;
                case "3":
                    System.out.println("TAMBAH BUKU");
                    tambahData();
                    break;
                case "4":
                    System.out.println("UBAH BUKU");
                    break;
                case "5":
                    System.out.println("HAPUS BUKU");
                    break;
                default:
                    System.err.println("inputan salah atau tidak terdeteksi\nSilahkan pilih (1-5)");
            }
            System.out.println("Lanjut Ketik Y/T");
            lanjut = yesorno();
        }
    }

    private static void tampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);

        } catch (Exception e) {
            System.out.println("DataBase gagal ditemukan");
            return;
        }

        String data = bufferInput.readLine();
        System.out.print("|--|------|----------------------|------------|-----------------|");
        System.out.println("\n|NO|Tahun | Penulis\t\t |Penerbit    |Buku             |");
        System.out.println("|--|------|----------------------|------------|-----------------|");
        int no = 1;
        while (data != null) {
            StringTokenizer token = new StringTokenizer(data, ",");
            System.out.print("|" + no++);
            System.out.print(" | " + token.nextToken() + " | ");
            System.out.printf("%-20s | ", token.nextToken());
            System.out.printf("%-10s | ", token.nextToken());
            System.out.printf("%-15s | ", token.nextToken());
            System.out.print("\n");
            data = bufferInput.readLine();
        }
        System.out.println("|--|------|----------------------|------------|-----------------|");
    }

    private static void cariData() throws IOException {

        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            System.out.println("DataBase gagal ditemukan");
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan kata kunci untuk mencari buku");
        String cariString = scan.nextLine();
        String[] keywords = cariString.split("//s");
        cekBuku(keywords);
    }

    private static boolean cekBuku(String[] keywords) throws FileNotFoundException, IOException {

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        boolean isExist = false;
        String data = bufferInput.readLine();
        int jumlahData = 0;
        System.out.println("-----------------------------------------------------------------");
        while (data != null) {
            isExist = true;
            for (String keyword : keywords) {
                isExist = data.toLowerCase().contains(keyword.toLowerCase());
            }
            if (isExist == true) {
                StringTokenizer token = new StringTokenizer(data, ",");
                System.out.print("|" + jumlahData++);
                System.out.print(" | " + token.nextToken() + " | ");
                System.out.printf("%-20s | ", token.nextToken());
                System.out.printf("%-10s | ", token.nextToken());
                System.out.printf("%-15s | ", token.nextToken());
                System.out.print("\n");
            }
            data = bufferInput.readLine();
        }
        System.out.println("-----------------------------------------------------------------");
        return isExist;
        }

    private static void tambahData() throws IOException {
        FileWriter file = new FileWriter("database.txt", true);
        BufferedWriter bufferwriter = new BufferedWriter(file);

        Scanner scan = new Scanner(System.in);
        String penulis, tahun, penerbit, buku;

        System.out.println("masukan nama penulis : ");
        penulis = scan.nextLine();
        System.out.println("masukan nama penerbit : ");
        penerbit = scan.nextLine();
        System.out.println("masukan nama buku : ");
        buku = scan.nextLine();
        System.out.println("masukan tahun terbit : ");
        tahun = ambilTahun();
        String[] keywords = {tahun +","+penulis+","+penerbit+","+buku};
        System.out.println(keywords);
        bufferwriter.close();
    }

    private static String ambilTahun() throws IOException {
        Scanner scan = new Scanner(System.in);
        String tahun = scan.nextLine();
        boolean tahunboolean = false;
        while (tahunboolean = true) {
            try {
                Year.parse(tahun);
                tahunboolean = true;
                System.out.println("database berhasil ditambahkan");
                break;
            } catch (Exception e) {
                System.err.println("inputan tahun salah");
                System.out.println("masukan tahun terbit : ");

                tahun = scan.nextLine();
                tahunboolean = false;
            }
        }
        return tahun;
    }

    private static boolean yesorno() {
        Scanner scan = new Scanner(System.in);
        String stop = scan.next();
        Boolean PilihanUser = true;
        Boolean pilih2 = false;

        if ("y".equalsIgnoreCase(stop)) {
            PilihanUser = true;
        } else if ("t".equalsIgnoreCase(stop)) {
            PilihanUser = false;
            System.out.println("Program Dihentikan");

        }
        while (!"y".equalsIgnoreCase(stop) && !"t".equalsIgnoreCase(stop)) {

            System.out.println("pilih Y/T");
            stop = scan.next();
        }
        return PilihanUser;
    }

    private static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/C", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("gagal clearing data");
        }
    }
}
