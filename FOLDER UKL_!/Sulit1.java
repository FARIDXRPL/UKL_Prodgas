import java.util.Scanner;

public class heh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        
        // Memastikan jumlah siswa valid
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            return;
        }
        
        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0;
        
        // Memasukkan nilai-nilai ujian siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
            totalNilai += nilaiSiswa[i];
        }
        
        // Menghitung rata-rata nilai
        double rataRata = totalNilai / jumlahSiswa;
        System.out.printf("Rata-rata nilai ujian: %.2f%n", rataRata);
        
        input.close();
    }
}