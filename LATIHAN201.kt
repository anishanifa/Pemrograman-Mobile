// Tulis fungsi untuk menghitung jarak dua buah titik t1(x1, y1) dan t2(x2, y2).
// Panggilah fungsi ini dalam fungsi main() dengan t1(2,3) dan t2(8,7), serta t1(5,3) dan t2(-8, -4).

import java.lang.Math

fun jarakduatitik(x1:Double,y1: Double,x2: Double,y2: Double):Double {
    var jarak = ( (x2 - x1) * (x2 - x1) ) + ( (y2 - y1) * (y2 - y1) )
    return Math.sqrt(jarak)
}

fun main (args: Array<String>) {
    var x1:Double
    var y1:Double
    var x2:Double
    var y2:Double
    x1 = 2.0
    y1 = 3.0
    x2 = 8.0
    y2 = 7.0
    println("Jarak antara t1(2,3) dan t2(8,7)")
    println("Jarak dua buah titik: " + jarakduatitik(x1, y1, x2, y2))

    x1 = 5.0
    y1 = 3.0
    x2 = -8.0
    y2 = -4.0
    println("Jarak antara t1(5,3) dan t2(-8, -4)")
    println("Jarak dua buah titik: " + jarakduatitik(x1, y1, x2, y2))
}