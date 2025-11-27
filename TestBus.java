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
                System.out.print("Hamil? (1=ya, 0=tidak): ");
                int h = in.nextInt();

                Penumpang p;
                if (umur > 60 || umur < 10 || h == 1) {
                    p = new PenumpangPrioritas(id, nama, umur, h == 1);
                } else {
                    p = new Penumpang(id, nama, umur, h == 1);
                }
                if (bus.naikkanPenumpang(p))
                    System.out.println("Penumpang berhasil naik!");
                else
                    System.out.println("Gagal menaikkan penumpang!");
            }
            else if (pilihan == 2) {
                System.out.print("Masukkan nama penumpang yang turun: ");
                String nama = in.nextLine();
                if (bus.turunkanPenumpang(nama))
                    System.out.println("Penumpang berhasil turun.");
                else
                    System.out.println("Penumpang tidak ditemukan.");
            }
            else if (pilihan == 3) {
                System.out.println(bus);
            }

            else if (pilihan == 4) {
                System.out.println("Program selesai.");
                break;
            }
        }

        in.close();
    }
}
