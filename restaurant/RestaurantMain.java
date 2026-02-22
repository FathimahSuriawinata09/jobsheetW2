package restaurant;
import java.util.Scanner;

public class RestaurantMain {    
    public static void main(String[] args) { 
        Restaurant menu = new Restaurant();
        Scanner sc = new Scanner(System.in);

        menu.tambahMenuMakanan("0. Pizza",250000, 20); 
        menu.tambahMenuMakanan("1. Spaghetti", 80000, 20); 
        menu.tambahMenuMakanan("2. Tenderloin Steak", 60000, 30); 
        menu.tambahMenuMakanan("3. Chicken Steak", 45000, 30); 

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n========== Menu Restoran ==========");
            menu.tampilMenuMakanan();

            System.out.println("\nMasukkan nomor menu yang ingin dipesan (ketik 0,1,2,3 atau -1 untuk keluar): ");
            int menuIndex;
            try{
                menuIndex = sc.nextInt();
            } catch(Exception e){
                System.out.println("Input tidak valid!");
                sc.next();
                continue;
            }
            
            if (menuIndex == -1) break;

            System.out.println("Jumlah yang ingin dipesan: ");
            int jumlah;
            try {
                jumlah = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input tidak valid. Masukkan angka!");
                sc.next();
                continue;
            }
            menu.pesanmakanan(menuIndex, jumlah);

            System.out.print("Apakah anda ingin memesan lagi? (ya/tidak): ");
            String jawaban = sc.next();
            lanjut = jawaban.equalsIgnoreCase("ya");
        }

        System.out.println("Terima kasih");
        sc.close();
    }
}
             