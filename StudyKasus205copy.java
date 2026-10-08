import java.util.Scanner;

public class StudyKasus205copy {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nama mahasiswa = ");
        String nama = sc.next();
        System.out.print("jenis kegiatan  (BELMAWA,BAKORMA,MANDIRI,PKM ATAU LAINNYA) = ");
        String kegiatan = sc.next();

        if (kegiatan.equalsIgnoreCase("lainnya")) {
            System.out.println(" tidak memperoleh dana penghargaan");
            
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