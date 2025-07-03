package UAS;


import java.util.InputMismatchException; // Diperlukan untuk error handling
import java.util.Scanner;

public class TokoGameOnline {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("SELAMAT DATANG DI TOKO GAME MYSTERIO");
        System.out.println("========================================");
        
        Produk[] daftarGame = new Produk[3];
        daftarGame[0] = new ProdukGame("001", "Cyberpunk 2077", 250000, "RPG");
        daftarGame[1] = new ProdukGame("002", "Red Dead Redemption 2", 319000, "Open World");
        daftarGame[2] = new ProdukGame("003", "Elden Ring", 750000, "Action RPG");
        
        //Demonstrasi singkat Accessor dan Mutator
        System.out.println("Ada diskon!");
        System.out.println("\nHarga awal RDR 2: Rp" + daftarGame[1].getHarga());
        daftarGame[1].setHarga(255000); // Menggunakan Mutator (Setter)
        System.out.println("Harga baru RDR 2: Rp" + daftarGame[1].getHarga()); 
        
        System.out.println("\n--- KATALOG GAME YANG TERSEDIA ---\n");
        for (Produk game : daftarGame) {
            game.tampilkanInfo();
            System.out.println("--------------------");
        }
        
        System.out.print("\nMasukkan ID Game yang ingin dibeli: ");
        String idBeli = scanner.next();
        
        double budget = 0;
        while (true) { // Loop akan terus berjalan sampai input valid diterima
            try {
                System.out.print("Masukkan budget Anda: Rp");
                budget = scanner.nextDouble();

                if (budget < 0) {
                    System.out.println("Budget tidak boleh negatif. Silakan coba lagi.");
                    continue; // Mengulang loop jika budget negatif
                }
                break; // Keluar dari loop jika input adalah angka dan tidak negatif

            } catch (InputMismatchException e) {
                System.out.println("Input salah! Harap masukkan angka yang valid.");
                scanner.next(); // Membersihkan input yang salah dari scanner
            }
        }
        
        Produk gameDipilih = null;
        for (Produk game : daftarGame) {
            if (game.getIdProduk().equalsIgnoreCase(idBeli)) {
                gameDipilih = game;
                break;
            }
        }
        
        if (gameDipilih != null) {
            System.out.println("\nAnda memilih: " + gameDipilih.getNama());
            if (budget >= gameDipilih.getHarga()) {
                System.out.println("Selamat! Pembelian berhasil.");
                System.out.printf("Sisa budget Anda: Rp%,.0f\n", (budget - gameDipilih.getHarga()));
            } else {
                System.out.println("Maaf, budget Anda tidak mencukupi.");
                System.out.printf("Kekurangan: Rp%,.0f\n", (gameDipilih.getHarga() - budget));
            }
        } else {
            System.out.println("\nMaaf, game dengan ID '" + idBeli + "' tidak ditemukan di katalog.");
        }
        
        System.out.println("\nTerima kasih telah berkunjung!");
        
        scanner.close();
    }
}