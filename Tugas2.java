import java.util.Scanner;

public class Tugas2 {
    static int penjumlahanRekursif(int x) {
        if (x == 0) {
            return 0;
        }
        return x + penjumlahanRekursif(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        int hasil = penjumlahanRekursif(angka);
        System.out.println("Hasil penjumlahan Rekursif angka " + angka + " adalah " + hasil);
    }
}
