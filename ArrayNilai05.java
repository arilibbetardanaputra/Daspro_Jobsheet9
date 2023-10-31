import java.util.Scanner;

public class ArrayNilai05 {
    public static void main(String[] args) {
        int[] nilaiakhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiakhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiakhir.length; i++) {
            if (nilaiakhir[i] > 70) {System.out.println("Mahasiswa ke-" + i + " Lulus! ");
            } else {System.out.println("Mahasiswa ke-" + i + " Tidak Lulus! " );
        }
        }
    }
}
