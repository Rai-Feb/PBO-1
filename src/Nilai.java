import java.util.Scanner;

public class Nilai {

    String nim, nama;
    double nilaiAbsen, nilaiTugas, nilaiUts, nilaiUas;

    public void Nilai() {
        // Scanner Input data
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Absen [10%]: ");
        nilaiAbsen = input.nextDouble() * 0.10;
        System.out.print("Masukkan Nilai Tugas [20%]: ");
        nilaiTugas = input.nextDouble() * 0.20;
        System.out.print("Masukkan Nilai UTS [30%]: ");
        nilaiUts = input.nextDouble() * 0.30;
        System.out.print("Masukkan Nilai UAS [40%]: ");
        nilaiUas = input.nextDouble() * 0.40;
    }

    public void CetakNilai() {
        double totalNilai = nilaiAbsen + nilaiTugas + nilaiUts + nilaiUas;
        
        System.out.println("\n===== Data Nilai Mahasiswa =====");
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.printf("Nilai Absen[10%%]  : %.2f\n", nilaiAbsen);
        System.out.printf("Nilai Tugas[20%%]  : %.2f\n", nilaiTugas);
        System.out.printf("Nilai UTS  [30%%]  : %.2f\n", nilaiUts);
        System.out.printf("Nilai UAS  [40%%]  : %.2f\n", nilaiUas);
        System.out.printf("Total Nilai    : %.2f\n", totalNilai);
        
        if (totalNilai >= 85) {
            System.out.println("Predikat Nilai : A");
        } else if (totalNilai >= 70) {
            System.out.println("Predikat Nilai : B");
        } else if (totalNilai >= 60) {
            System.out.println("Predikat Nilai : C");
        } else if (totalNilai >= 40) {
            System.out.println("Predikat Nilai : D");
        } else {
            System.out.println("Predikat Nilai : E");
        }
    }
}