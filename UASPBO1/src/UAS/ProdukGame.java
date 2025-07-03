
package UAS;

//Inheritance
public class ProdukGame extends Produk {

    // Atribut tambahan khusus
    private String genre;

    // Constructor kelas anak, memanggil constructor induk menggunakan 'super'
    public ProdukGame(String idProduk, String nama, double harga, String genre) {
        super(idProduk, nama, harga); // Mengoper data ke constructor Produk
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Polymorphism - Override method dari kelas Produk
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Game: " + super.getIdProduk());
        System.out.println("Nama Game: " + super.getNama());
        System.out.println("Genre: " + this.genre);
        System.out.printf("Harga: Rp%,.0f\n", super.getHarga());
    }
}
