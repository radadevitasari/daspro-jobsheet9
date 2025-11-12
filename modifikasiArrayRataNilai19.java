import java.util.Scanner;

public class modifikasiArrayRataNilai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        double banyakLulus = 0, banyakTidakLulus = 0; 

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus = totalLulus + nilaiMhs[i];
                banyakLulus = banyakLulus + 1;
            } else {
                totalTidakLulus = totalTidakLulus + nilaiMhs[i];
                banyakTidakLulus = banyakTidakLulus + 1;
            }
        }
        double rataLulus = 0;
        double rataTidakLulus = 0;

        if (banyakLulus > 0) {
            rataLulus = totalLulus / banyakLulus;
        }
        if (banyakTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / banyakTidakLulus;
        }
        System.out.println("\nRata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}