import java.util.Scanner;
class Sedang1{
    static void ni(int r, int t, double pi){
        double hasil = pi*r*r*t;
        System.out.println(hasil);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan jari jari dulu lau tinggi");
        ni(input.nextInt(), input.nextInt(), Math.PI);
        
    }
}