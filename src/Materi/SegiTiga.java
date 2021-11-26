package Materi;

public class SegiTiga extends BangunDatar {
    public SegiTiga() {
        this.panjang = 10;
        this.lebar = 10;
    }
    public SegiTiga (double panjang, double lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }
    @Override
    public double getLuas () {
        return super.getLuas()/2;
    }
}   
