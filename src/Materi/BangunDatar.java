package Materi;

public class BangunDatar {
    protected double panjang, lebar;
    public BangunDatar () {
        this.panjang = 10;
        this.lebar = 10;
    }
    public BangunDatar(double panjang, double lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang < 1 ? 1 : panjang;
    }
    public double getPanjang() {
        return this.panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar < 1 ? 1 : lebar;
    }
    public double getLebar() {
        return this.lebar;
    }
    public double getLuas() {
        return this.lebar * this.panjang;
    }
}
