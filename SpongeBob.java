package latihan;

import java.util.Scanner;

public class SpongeBob {

    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//        System.out.println("angka1 : ");
//        int angka1 = scan.nextInt();
//        System.out.println("angka2 : ");
//        int angka2 = scan.nextInt();
//        
//        
//        for(int i = angka1; i <= angka2;i++){
//            System.out.println("angka ke : " + i);
//        }
//        
//        while(angka1 <= angka2){
//            System.out.println("angka ke : " + angka1 );
//            angka1++;
//        }

//       do{
//            System.out.println("angka ke : " + angka1);
//            angka1++;
//        }
//        while(angka1 <= angka2);
//

        for(int j = 1; j<=8;j++){
           if(j==5 ){
               System.out.print("|-");
           }else if( j==7){
               System.out.print("|");
           }else if(j==6){
               System.out.print("--");
           }else{
               System.out.print("  ");
           }
        }
        System.out.println("");
        
        for (int a = 1; a <= 5; a++) {
            for (int c = 1; c <= 3; c++) {
                if (a == 3 && c == 2 || a == 3 && c == 3 || a == 2 && c == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int b = 1; b <= 8; b++) {
                if (a == 2 && b == 2 || a == 2 && b == 4) {
                    System.out.print("0 ");
                } else if (a == 4 && b == 2
                        || a == 4 && b == 3) {
                    System.out.print("UU");
                } else if (a == 4 && b == 4) {
                    System.out.print("U ");
                } else if (a == 1 && b == 6 || a == 1 && b == 7 || a == 1 && b == 8
                        || a == 2 && b == 6 || a == 2 && b == 7 || a == 2 && b == 8
                        || a == 4 && b == 6 || a == 4 && b == 8 || a == 3 && b == 8
                        || a == 5 && b == 6 || a == 5 && b == 7 || a == 5 && b == 8) {
                    System.out.print("  ");

                } else if (a == 2 && b == 3 || a == 3 && b == 2 || a == 3 && b == 4) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println(" ");

        }
        for (int f = 1; f <= 1; f++) {
            for (int g = 1; g <= 8; g++) {
                if (f == 1 && g == 1 || f == 1 && g == 2 || f == 1 && g == 3) {
                    System.out.print("  ");
                } else if (f == 1 && g == 8) {
                    System.out.print("| ");
                } else if (f == 1 && g == 4) {
                    System.out.print("|_");
                } else {
                    System.out.print("__");
                }

            }
            System.out.println("");
        }
        for (int f = 1; f <= 3; f++) {
            for (int g = 1; g <= 8; g++) {
                if (f == 1 && g == 5 || f == 1 && g == 7
                        || f == 2 && g == 4 || f == 2 && g == 6) {
                    System.out.print("* ");
                } else if (f == 3 && g == 4 || f == 3 && g == 6) {
                    System.out.print("d");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
