package pa_dasar1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        try {
            boolean start = true;
            int  total, pilihan, susu = 0, shampoo = 0, sereal = 0, sabun = 0;
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Masukan Jumlah Uang Anda : ");
            String uang = scan.next();
            
            do {
                System.out.println("---------------------------");
                System.out.println("1. Daftar Menu: ");
                System.out.println("2. Pesan Menu: ");
                System.out.println("3. Keluar");
                System.out.println("---------------------------");
                System.out.println("");
                System.out.print("Masukan Pilihan (angka) : ");
                pilihan = scan.nextInt();

                if (pilihan == 1) {
                    System.out.println("Daftar Menu :");
                    menu();
                    System.out.println("");
                    start = false;
                } else if (pilihan == 2) {
                    System.out.print("Susu (2500) Beli : ");
                    susu = scan.nextInt();
                    System.out.print("Shampoo (7000) Beli : ");
                    shampoo = scan.nextInt();
                    System.out.print("Sereal (5000) Beli : ");
                    sereal = scan.nextInt();
                    System.out.print("Sabun (4000) Beli : ");
                    sabun = scan.nextInt();
                    System.out.print("nugget (15000) Beli : ");
                    int nugget = scan.nextInt();
                    System.out.println("---------------------------");
                    System.out.println("Total susu : " + susu * 2500);
                    System.out.println("Total shampoo : " + shampoo * 7000);
                    System.out.println("Total sereal : " + sereal * 5000);
                    System.out.println("Total sabun : " + sabun * 4000);
                    System.out.println("Total nugget : " + nugget * 15000);
                    System.out.println("---------------------------");
                    total = (susu * 2500) + (shampoo * 7000) + (sereal * 5000) + (sabun * 4000) + (nugget * 15000);
                    System.out.println("Total Harga : " + total);
                    System.out.println("Uang : " + uang);
                    if (total > Integer.parseInt(uang)) {
                        System.out.println("UANG TIDAK CUKUP!");
                    } else {
                        System.out.println("Kembalian : " + (Integer.parseInt(uang) - total));
                        System.out.println("TERIMA KASIH!");

                    }
                    start = false;
                } else if (pilihan == 3) {
                    start = true;
                } else if (pilihan > 3) {
                    System.out.println("PILIH 1 / 2 / 3 !!!!");
                    start = false;
                }

            } while (start == false);
        } catch (InputMismatchException e) {
            System.out.println("inputan harus ANGKA!");
        }
    }

    static void menu() {
        System.out.println("1. susu (2500) ");
        System.out.println("2. shampoo (7000) ");
        System.out.println("3. sereal (5000) ");
        System.out.println("4. sabun (4000) ");
        System.out.println("5. nugget (15000) ");
    }
}




































