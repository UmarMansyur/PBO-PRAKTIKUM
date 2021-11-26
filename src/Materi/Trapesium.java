package Materi;

public class Trapesium extends BangunDatar{
    protected double tinggi;
    public Trapesium () {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }
    public Trapesium(double tinggi, double a, double b) {
        setPanjang(a);
        setLebar(b);
        setTinggi(tinggi);
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi < 1 ? 1 : tinggi;
    }
    public double getTinggi() {
        return this.tinggi;
    }
    @Override
    public double getLuas(){
        return this.tinggi*(this.panjang + this.lebar) /2;
    }
}
