import java.util.Scanner;
public class StudiKasus2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.println("Nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.println("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.println("Peringkat Juara: ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                System.out.println("Status: Berhak memperoleh dana penghargaan (Juara " + peringkat + ", dokumen lengkap).");
            } else { 
                System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak dapat diberikan.");
            }
        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3).");
        }
    }
}