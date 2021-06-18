package mhs;

public class Dosen extends Uksw {

    private String nama;
    private String alamat;
    private String progdi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setProgdi(String progdi) {
        this.progdi = progdi;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getProgdi() {
        return progdi;
    }

    public String infoDosen(String nama, String progdi, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.progdi = progdi;
        return "Nama : " + this.nama + "\nprogdi : " + this.progdi + "\nalamat : " + this.alamat;
    }

    public String infoDosen(String nama, String progdi) {
        return "Nama : " + this.nama + "\nprogdi : " + this.progdi;
    }

    public String infoDosen(String nama) {
        return "Nama : " + this.nama;
    }
}
