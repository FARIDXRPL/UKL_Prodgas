import java.util.Random;
import java.util.Scanner;

public class uklsedang{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Matematika quiz");
    System.out.println("Tulis keluar jika ingin keluar");
    Boolean ingin = true;
    // Random number generating
    while(ingin == true){
    Random generator = new Random();

      int N1 = generator.nextInt(100);
      int N2 = generator.nextInt(99); 
      char [] Rendom = {'+','-','x','/','%'};
      char operator = Rendom[generator.nextInt(Rendom.length)];
      
      double Jawab= 0;
      switch(operator){
        case '+' : Jawab = N1 + N2;break;
        case '-' : Jawab = N1 - N2;break;
        case 'x' : Jawab = N1 * N2;break;
        case '/' : Jawab = N1 / N2;break;
        case '%' : Jawab = N1 % N2;break;
      }
      

      System.out.println("Jawaban dari : " + N1 + " " + operator + " " + N2);
      String jawabanUser = input.next();

      // Periksa jika pengguna ingin keluar
      if (jawabanUser.equalsIgnoreCase("Keluar")) {
          ingin = false;
          System.out.println("Terima kasih telah bermain!");
          break;
      }

      try {
        
      int injawab = Integer.parseInt(jawabanUser);
      if (injawab == Jawab){
        System.out.println("Benar");
      }
      else{
        System.err.println("Salah, jawabnaya adalah : " + Jawab);
     }
    } catch (NumberFormatException e) {
      System.out.println("Input tidak valid. Silakan masukkan angka atau 'Keluar' untuk menghentikan.");}
    }
    }
}