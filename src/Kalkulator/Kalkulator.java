package Kalkulator;

public class Kalkulator {
    protected double a;
    protected double b;
    
    Kalkulator(){
       this.a = 1;
       this.b = 1; 
    }
    Kalkulator(double a, double b){
        this.a = a;
        this.b = b; 
    }
    double penjumlahan () {
        return this.a + this.b;
    }
    double pengurangan () {
        return this.a - this.b;
    }
    double perkalian () {
        return this.a * this.b;
    }
    double pembagian () {
        return this.a / this.b;
    }
}
