package mhs;

public class Uksw {

    private String namaMhs;
    private String namaDosen;

    public String motto() {
        return "Takut akan Tuhan merupakan permulaan pegetahuan";
    }
    
    
    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public String skripsi(String namaMhs, String namaDosen) {
        this.namaDosen = namaDosen;
        this.namaMhs = namaMhs;
        return this.namaMhs + " & " + this.namaDosen;
    }
}
