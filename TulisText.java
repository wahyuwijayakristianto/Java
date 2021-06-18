package StrBuff;

import java.io.*;

public class TulisText {

    public static void main(String[] args) {
        String fileName = "src/StrBuff/puisi.txt";
        String teks1 = "Air surut memungut bayam \n"
                + "\n"
                + "Sayur diisi ke dalam kantung ";
        String teks2 = "Jangan diikuti tabiat ayam \n"
                + "\n"
                + "Bertelur sebiji riuh sekampung";

        try {

//            FileWriter fileWriter = new FileWriter(fileName);
//            fileWriter.write(teks1);
//            fileWriter.write("\n");
//            fileWriter.write(teks2);
//            fileWriter.close();
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            buff.write(teks1);
            buff.write("\n");
            buff.write(teks2);
            buff.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

    }

}
