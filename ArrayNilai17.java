import java.util.Scanner;
public class ArrayNilai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nilaiAkhir = new int[n];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] >= 70) ? "Lulus" : "Tidak Lulus";
            if (nilaiAkhir[i] > 70)
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " - " + status);
        }
        int lulus = 0, tidakLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
    }
    
}

