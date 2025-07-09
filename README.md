# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pembelian game digital online menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa idproduk, nama, dan harga , dan memberikan output berupa informasi detail dari id produk tersebut seperti nama game, harga game, genre, dan budget kita.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Produk`, `ProdukGame`, dan `TokoGameOnline` adalah contoh dari class.

```bash
public abstract class Produk {
    ...
}

public class ProdukGame extends Produk {
    ...
}

public class TokoGameOnline {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarGame[0] = new ProdukGame("001", "Cyberpunk 2077", 250000, "RPG");` adalah contoh pembuatan object.

```bash
daftarGame[1] = new ProdukGame("002", "Red Dead Redemption 2", 319000, "Open World");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `idProduk` `nama` dan `harga` adalah contoh atribut.

```bash
String idProduk;
String nama;
harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Produk` dan `ProdukGame`.

```bash
    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }
}
public ProdukGame(String idProduk, String nama, double harga, String genre) {
        super(idProduk, nama, harga);
        this.genre = genre;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setHarga` adalah contoh method mutator.

```bash
 public void setHarga(double harga) {
        if (harga >= 0) { // Validasi sederhana
            this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getIdProduk`, `getNama`,  dan `getHarga` adalah contoh method accessor.

```bash
public String getIdProduk() {
        return idProduk;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `idProduk` `getNama` dan `getHarga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String idProduk;
    private String nama;
    private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ProdukGame` mewarisi `Produk` dengan sintaks `extends`.

```bash
public class ProdukGame extends Produk {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `produk` merupakan overloading method `tampilkanInfo` dan `tampilkanInfoo` di `ProdukGame` merupakan override dari method `displayInfo` di `Produk`.

```bash
public abstract void tampilkanInfo();
}

@Override
    public void tampilkanInfo() {
        System.out.println("ID Game: " + super.getIdProduk());
        System.out.println("Nama Game: " + super.getNama());
        System.out.println("Genre: " + this.genre);
        System.out.printf("Harga: Rp%,.0f\n", super.getHarga());
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `main` pada file `TokoGameOnline.java`. Seleksi ini digunakan untuk memeriksa apakah game yang dipilih ditemukan dan apakah budget pengguna mencukupi.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Produk game : daftarGame) {
            game.tampilkanInfo();
            System.out.println("--------------------");
        }

for (Produk game : daftarGame) {
    if (game.getIdProduk().equalsIgnoreCase(idBeli)) {
        gameDipilih = game;
        break;
    }
}
```


12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("\nMasukkan ID Game yang ingin dibeli: ");
String idBeli = scanner.next();

System.out.print("Masukkan budget Anda: Rp");
budget = scanner.nextDouble();

System.out.println("========================================");
System.out.println("SELAMAT DATANG DI TOKO GAME MYSTERIO");
//...
System.out.println("Selamat! Pembelian berhasil.");

    System.out.println("ID Game: " + super.getIdProduk());
    System.out.println("Nama Game: " + super.getNama());
    System.out.println("Genre: " + this.genre);
    System.out.printf("Harga: Rp%,.0f\n", super.getHarga());
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `daftarGame[0] = new ProdukGame("001", "Cyberpunk 2077", 250000, "RPG");` adalah contoh penggunaan array.

```bash
daftarGame[0] = new ProdukGame("001", "Cyberpunk 2077", 250000, "RPG");
daftarGame[1] = new ProdukGame("002", "Red Dead Redemption 2", 319000, "Open World");
daftarGame[2] = new ProdukGame("003", "Elden Ring", 750000, "Action RPG");

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    System.out.print("Masukkan budget Anda: Rp");
    budget = scanner.nextDouble();
} catch (InputMismatchException e) {
    System.out.println("Input salah! Harap masukkan angka yang valid.");
    scanner.next(); // Membersihkan input yang salah dari scanner
    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Achmad Fadillah Fikri
NPM: 2310010211
