/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrBuff;

import java.io.*;
import java.util.Scanner;
public class BacaText {

    public static void main(String[] args) {
        String fileName = "src/StrBuff/puisi.txt";
        try {
            File myFile = new File(fileName);

//            Scanner fileReader = new Scanner(myFile);
//            while (fileReader.hasNextLine()) {
//                String data = fileReader.nextLine();
//                System.out.println(data);
//            }

//            FileReader fileReader = new FileReader(myFile);
//            BufferedReader buff = new BufferedReader(fileReader);
//            String teks;
//            while ((teks = buff.readLine()) != null) {
//                System.out.println(teks);
//                
//            }

            InputStream instream = new FileInputStream(fileName);
            int teks;
            while ((teks = instream.read()) != -1) {
                System.out.print((char) teks);
            }
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());

        }
    }
}
