import java.util.Scanner;

public class DoWhileCuti22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? : ");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Jumlah Jatah Cuti : " + jatahCuti + "\n");
                } else if (jumlahHari > jatahCuti) {
                    System.out.println("\nJumlah Hari yang Anda Masukan Lebih Besar Daripada Jatah Cuti");
                    System.out.println("Sisa Jatah Cuti yang Anda Miliki adalah " + jatahCuti);
                    System.out.println("Silahkan Mengisi Kembali Jumlah Hari Anda!\n");
                }
            }

        } while (jatahCuti > 0 );

    }

}
