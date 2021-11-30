package Kalkulator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-+");
        System.out.println("|         Program Kalkulator             |");
        System.out.println("+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-+");
        System.out.println("[1] Penjumlahan");
        System.out.println("[2] Pengurangan");
        System.out.println("[3] Perkalian");
        System.out.println("[4] Pembagian");
        System.out.print("Pilih :  ");
        int choice = scan.nextInt();
        System.out.print("Masukkan angka pertama: ");
        double a = scan.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = scan.nextDouble();
        Kalkulator kalkulator = new Kalkulator(a,b);
        switch (choice) {
            case 1:
                System.out.println(kalkulator.penjumlahan());
                break;
            case 2:
                System.out.println(kalkulator.pengurangan());
                break;
            case 3:
                System.out.println(kalkulator.perkalian());
                break;
            case 4:
                System.out.println(kalkulator.pembagian());
                break;
            default:
            break;
        }
        
    }
}
