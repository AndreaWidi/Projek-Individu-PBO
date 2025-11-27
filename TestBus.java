import java.util.Scanner;

public class TestBus {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();

        while (true) {
            System.out.println("\n===== BUS TRANS KOETARADJA =====");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");

            int pilihan = in.nextInt();
            in.nextLine();

            if (pilihan == 1) {
                System.out.print("ID Penumpang : ");
                int id = in.nextInt();
                in.nextLine();

                System.out.print("Nama : ");
                String nama = in.nextLine();

                System.out.print("Umur : ");
                int umur = in.nextInt();
