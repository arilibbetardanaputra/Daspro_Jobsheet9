import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0; 
        double totalTidakLulus = 0; 
        int countLulus = 0; 
        int countTidakLulus = 0; 

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        if (countLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / countLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (countTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / countTidakLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
    }
}
