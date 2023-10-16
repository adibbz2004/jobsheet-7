import java.util.Scanner;

public class WhileGaji22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        ;
        String jabatan;

        System.out.print("Masukan jumlah karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("\nPilihan Jabatan - Manager, Direktur, Karyawan");
            System.out.print("Masukan Jumlah Karyawan ke-" + (i + 1) + " : ");
            jabatan = scan.next();
            System.out.print("Masukan Jumlah Jam Lembur : ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            else{
                System.out.println(jabatan + " adalah Jabatan yang Invalid!");
            }
            totalGajiLembur += gajiLembur;
        }

        System.out.println("Total Gaji Lembur adalah: " + totalGajiLembur);
    }
}

