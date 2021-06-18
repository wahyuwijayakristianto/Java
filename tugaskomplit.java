/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class tugaskomplit {

    public static void main(String[] args) {
        try{
        Scanner scan = new Scanner(System.in);
        String ulang = null;
        do {
            System.out.print("masukan angka1: ");
            int angka1 = scan.nextInt();
            System.out.print("masukan op: ");
            String op = scan.next();
            System.out.print("masukan angka1: ");
            int angka2 = scan.nextInt();

            if ("+".equals(op)) {
                System.out.println("hasilnya adalah " + (angka1 + angka2));
                System.out.println("mau ulang atau tidak Y/N");
                String yn = scan.next();

                if (yn.equalsIgnoreCase("y")) {
                    ulang = "y";
                } else {
                    ulang = "z";
                }
            } else if ("-".equalsIgnoreCase(op)) {
                System.out.println("hasilnya adalah " + (angka1 - angka2));
                System.out.println("mau ulang atau tidak Y/N");
                String yn = scan.next();
                if (yn.equalsIgnoreCase("y")) {
                    ulang = "y";
                } else {
                    ulang = "z";
                }
            } else if ("/".equals(op)) {
                if (angka2 == 0) {
                    System.out.println("pembagian tidak bisa diberi 0");
                } else {
                    System.out.println("hasilnya adalah " + (angka1 / angka2));
                }
                System.out.println("mau ulang atau tidak Y/N");
                String yn = scan.next();
                if (yn.equalsIgnoreCase("y")) {
                    ulang = "y";
                } else {
                    ulang = "z";
                }
            } else if ("*".equals(op)) {
                System.out.println("hasilnya adalah " + (angka1 * angka2));
                System.out.println("mau ulang atau tidak Y/N");
                String yn = scan.next();
                if (yn.equalsIgnoreCase("y")) {
                    ulang = "y";
                } else {
                    ulang = "z";
                }
            } else {
                System.out.println("operator salah");

                System.out.println("mau ulang atau tidak Y/N");

                String yn = scan.next();
                if (yn.equalsIgnoreCase("y")) {
                    ulang = "y";
                } else {
                    ulang = "z";
                }

            }
        } while ("y".equals(ulang));
        }
        catch(Exception InputMismatchException){
            System.out.println("inputan bukan angka");
        }finally{
            System.out.println("program selesai");
        }
        
    }
}
