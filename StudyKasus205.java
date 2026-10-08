import java.net.Socket;
import java.util.Scanner;
public class StudyKasus205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nama mahasiswa = ");
        String nama = sc.next();
        System.out.print("jenis kegiatan  (BELMAWA,BAKORMA,MANDIRI,PKM ATAU LAINNYA) = ");
        String kegiatan = sc.next();
         if (kegiatan.equalsIgnoreCase("belmawa") || kegiatan.equalsIgnoreCase("bakorma") || kegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("peringkat juara berapa ? ");
            int juara = sc.nextInt();
            if (juara <= 3) {
                System.out.print("berapa dokumen yang sudah anda upload (1-4 )= ");
                int berkas = sc.nextInt();
                if (berkas == 4) {
                    System.out.println("anda lolos kualifikasi dan mendapatkan dana");
                    
                }else{
                    if (berkas < 4) {
                        berkas -= 4;

                        System.out.println("ststus : dokumen kurang (" + berkas + ") .dana penghargaan tidak diberikan");
                        
                    }
                }


                
            }else{
                System.out.println("tidak masuk kualifikasi");
            }
            
         }else if (kegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("apakah pkm lolos pendanaan (ya/tidak) ? ");
            String pkm = sc.next();
            if (pkm.equalsIgnoreCase("ya")) {
                System.out.print("berap dokumen yang sudah andaa upload 1-4 = ");
                int dokumen = sc.nextInt();
                if (dokumen == 4) {
                    System.out.println("anda lolos kualifikasi dan mendapatkan dana");
                    
                    
                }else{
                    if (dokumen < 4) {
                        dokumen -= 4;
                        
                    }
                    System.out.println("ststus : dokumen kurang (" + dokumen + ") .dana penghargaan tidak diberikan");
                }

                
            }
            
         }

    }
    
}
