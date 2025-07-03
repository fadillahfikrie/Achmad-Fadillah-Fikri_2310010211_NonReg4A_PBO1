package UAS;

//Class
//Kelas abstrak sebagai template untuk semua produk.
//Encapsulation - Semua atribut 'private'.
public abstract class Produk {

    //Atribut
    private String idProduk;
    private String nama;
    private double harga;

    //Constructor
    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    //Accessor (Getter)
    public String getIdProduk() {
        return idProduk;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    //Mutator (Setter)
    public void setHarga(double harga) {
        if (harga >= 0) { // Validasi sederhana
            this.harga = harga;
        }
    }
    
    //Method abstrak untuk menampilkan info, akan di-override (Polymorphism)
    public abstract void tampilkanInfo();
}
