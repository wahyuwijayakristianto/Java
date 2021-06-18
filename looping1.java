package latihan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class looping1 {

    public static void main(String[] args) {
//      int arr[][] = new int[3][3];
//        arr[0][0] = 13;
//        arr[0][1] = 15;
//        arr[0][2] = 18;
//        
//        arr[1][0] = 19;
//        arr[1][1] = 11;
//        arr[1][2] = 14;
//        
//        arr[2][0] = 16;
//        arr[2][1] = 19;
//        arr[2][2] = 20;
//        for(int a = 0; a<= 2 ;a++){
//            for (int k = 0; k <= 2; k++) {
//                System.out.print(arr[a][k]+" ");
//            }
//            System.out.println();}

    String arr[][] = new String[5][5];
        arr[0][0] = " ";
        arr[0][1] = "*";
        arr[0][2] = "*";
        arr[0][3] = "*";
        arr[0][4] = " ";
            arr[1][0] = "*";
            arr[1][1] = " ";
            arr[1][2] = " ";
            arr[1][3] = " ";
            arr[1][4] = "*";
                arr[2][0] = "*";
                arr[2][1] = " ";
                arr[2][2] = "*";
                arr[2][3] = " ";
                arr[2][4] = "*";
                    arr[3][0] = "*";
                    arr[3][1] = " ";
                    arr[3][2] = " ";
                    arr[3][3] = " ";
                    arr[3][4] = "*";
                        arr[4][0] = " ";
                        arr[4][1] = "*";
                        arr[4][2] = "*";
                        arr[4][3] = "*";
                        arr[4][4] = " ";
        for(int a = 0; a<= 4 ;a++){
            for (int k = 0; k <= 4; k++) {
                System.out.print(arr[a][k]+" ");}
            System.out.println("indeks a ke-"+a);}
        
 System.out.print("0 1 2 3 4 ");
        System.out.println("");
        System.out.println("ini indeks k");
}}