package Materi;

public class Main {
    public static void main(String[] args) {
        var persegi = new BangunDatar(2,2);
        System.out.println("Luas Persegi: " + persegi.getLuas());

        var persegiPanjang = new BangunDatar(2,5);
        System.out.println("Luas Persegi: " + persegiPanjang.getLuas());

        var segitiga = new SegiTiga(2,5);
        System.out.println("Luas segitiga: " + segitiga.getLuas());

        var lingkaran = new Lingkaran(7);
        System.out.println("Lingkaran : " + lingkaran.getLuas());

        var Trapesium = new Trapesium(2,2,4);
        System.out.println("Trapesium : " + Trapesium.getLuas());
    }
}