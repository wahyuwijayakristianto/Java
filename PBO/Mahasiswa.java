package mhs;

public class Mahasiswa extends Uksw {

    private String nama;
    private String nim;
    private String alamat;
    private String progdi;

    Mahasiswa(String nama, String nim, String alamat, String progdi) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.progdi = progdi;
    }

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getProgdi() {
        return progdi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setProgdi(String progdi) {
        this.progdi = progdi;
    }

    @Override
    public String motto() {
        return "Kritis Kreatif Inovatif";
    }

    public String info() {

        return "Nama : " + this.nama
                + "\nNIM : " + this.nim
                + "\nAlamat : " + this.alamat
                + "\nProgdi : " + this.progdi;
    }

}
