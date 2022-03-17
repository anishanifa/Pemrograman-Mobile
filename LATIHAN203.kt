// Buat kelas Barang dengan properti: nama, harga, jumlah, dan diskon.
// Berilah nilai default pada konstruktornya. Tambahkan fungsi(method):
// tampil()  untuk menampilkan semua propertinya
// hitungTotal() untuk menghitung harga x jumlah x diskon
// Buatlah fungsi main() untuk mengakses kelas Barang

class Barang (var nama:String="Nama", var harga:Double=999999.99, var jumlah:Int=999, var diskon:Double=999999.99){
    var namaProd:String
    var hargaProd:Double
    var jumlahProd:Int
    var diskonProd:Double

    init {
        if (nama == "nama"){
            namaProd = "(Kosong)"
            hargaProd = 0.0
            jumlahProd = 0
            diskonProd = 0.0
        } else {
            namaProd = nama
            hargaProd = harga
            jumlahProd = jumlah
            diskonProd = diskon
        }
    }

    fun tampil(){
        println("Nama Produk : $namaProd")
        println("Harga Produk : $hargaProd")
        println("Jumlah Produk : $jumlahProd")
        println("Diskon Produk : $diskonProd")
    }

    fun hitungTotal():Double {
        var totalHarga = harga * jumlah * diskon
        return totalHarga
    }
}

fun main(args: Array<String>){
    val produkA = Barang("Keju",7500.00,2,0.05)
    produkA.tampil()
    println("Harga Diskon: ${produkA.hitungTotal()}\n")

    val produkB = Barang("Sirup",17500.00,2,0.25)
    produkB.tampil()
    println("Harga Diskon: ${produkB.hitungTotal()}\n")

    val produkC = Barang("Roti", 15000.00, 1,0.10)
    produkC.tampil()
    println("Harga Diskon: ${produkC.hitungTotal()}\n")
}
