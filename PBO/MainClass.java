package mhs;

public class MainClass {

    public static void main(String[] args) {

        Mahasiswa Samuel = new Mahasiswa("Samuel Radja", "682020233", "Salatiga", "SI");
        Mahasiswa Nola = new Mahasiswa("Nola Novita Setyaningrum", "682020044", "Jakarta", "SI");
        Dosen PakPenidas = new Dosen();
        
        System.out.println("");
        PakPenidas.infoDosen("Pak Penidas", "SI");
        System.out.println(Samuel.motto());
        System.out.println(PakPenidas.motto());
    }
}
