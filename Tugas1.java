import java.util.Scanner;

public class Tugas1 {
    static void descendingIteratif(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void descendingRekursif(int x) {
        if (x < 0) {
            return;
        }
        System.out.print(x + " ");
        descendingRekursif(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        System.out.print("Deret Descending Iteratif: ");
        descendingIteratif(angka);
        System.out.println();
        System.out.print("Deret Descending Rekursif: ");
        descendingRekursif(angka);
    }
}
