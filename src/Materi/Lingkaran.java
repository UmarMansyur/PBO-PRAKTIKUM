package Materi;

public class Lingkaran extends BangunDatar {
    public Lingkaran() {
        this.panjang = 10;
    }
    public Lingkaran(double jari) {
        setPanjang(jari);
    }
    @Override
    public double getLuas() {
        return 3.14 * getPanjang()* getPanjang();
    }
}
