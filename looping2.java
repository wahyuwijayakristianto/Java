/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author User
 */
public class looping2 {

    public static void main(String[] args) {
        for (int s = 0;s<1;s++){
            for(int d = 0;d<9;d++){
                System.out.print(" ");
            }for(int t=0;t<1;t++){
                System.out.print("X");
            }
            System.out.println(" ");
        }{
        for (int i = 0; i < 9; i++) {
            for (int x = 9; x > i; x--) {
                System.out.print(" ");
            }for(int l = 0;l<1;l++){
                System.out.print("^");
            }
            for (int y = 1; y <= i * 2; y++) {
                System.out.print("*");
            }for(int l = 0;l<1;l++){
                System.out.print("^");
            }
            System.out.println("");
        }}

        for (int z = 0; z <= 4; z++) {
            for (int k = 0; k <= 7; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4; j++) {
                System.out.print("+");
            }
            System.out.println(" ");
        }
          
        for(int w = 0; w <=8;w++)
            for(int ww = 0;ww<w;ww++){
                System.out.print("*");
            }
        System.out.println("");
        
    }
}
