  import java.util.Scanner;
public class StudyKasus105copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga = 18000;
        
        int kembalian = 0;
        int kurang = 0;
        int total = 0;
        double diskon = 0;
        System.out.print("berapa banyak kopi susu gula aren yang akan anda beli = ");
        int jumlah = sc.nextInt();
        System.out.print("masukkan nominal uang anda = ");
        int bayar = sc.nextInt();

         total += jumlah * harga;

        if (total >= 100000) {
             diskon = total * 10 / 100;
            
            
            
        }

        System.out.println("total harga = " + total);

        if (bayar >= total) {
                kembalian = bayar - total;

                System.out.println("kembalian anda = " + kembalian);
                System.out.println("diskon = " + diskon);

                
            }else{
                kurang = total - bayar;

                System.out.println("uang tidak cukup kurang Rp" + kurang);
            }

        
    }
}



