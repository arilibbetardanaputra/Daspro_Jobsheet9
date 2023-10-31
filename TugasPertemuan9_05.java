import java.util.Scanner;

public class TugasPertemuan9_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai;
        int nilaitinggi = Integer.MIN_VALUE; 
        int nilairendah = Integer.MAX_VALUE; 
        int jmlhnilaitinggi = 0;
        int jmlhnilairendah = 0;
        int nilaitertinggi = 0;
        int nilaiterendah = 0;
        double total = 0;
        double ratanilaitinggi = 0;
        double ratanilarendah = 0;

        System.out.print("Masukkan Jumlah Nilai yang ingin ditambahkan : ");
        int x = input.nextInt();
        nilai = new int[x];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();

            if (nilai[i] > nilaitertinggi) {
                nilaitertinggi = nilai[i];
            }
            if (nilai[i] < nilaiterendah) {
                nilaiterendah = nilai[i];
            }
            
            if (nilai[i] > 70) {
                jmlhnilaitinggi += nilai[i];
            } else {
                jmlhnilairendah += nilai[i];
            }
        }

        if (jmlhnilaitinggi > 0) {
            ratanilaitinggi = (double) jmlhnilaitinggi / (nilai.length - jmlhnilairendah);
        }
        if (jmlhnilairendah > 0) {
            ratanilarendah = (double) jmlhnilairendah / (nilai.length - jmlhnilaitinggi);
        }

        System.out.println("Nilai tertinggi = " + nilaitertinggi);
        System.out.println("Nilai terendah = " + nilaiterendah);
        System.out.println("Rata-rata nilai tinggi = " + ratanilaitinggi);
        System.out.println("Rata-rata nilai rendah = " + ratanilarendah);

        input.close();
    }
}
