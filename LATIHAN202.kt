// Buatlah fungsi inline dengan nama pangkat, dengan contoh pemanggilan seperti berikut.
// println("4 pangkat 3 = ${pangkat4.3)}")

fun pangkat(x:Int, y:Int): Double {
    val num = x
    val expo = y
    val oc = Math.pow(num.toDouble(),expo.toDouble())
    return oc
}

fun main (args: Array<String>){
    println("4 pangkat 3 = ${pangkat(4,3)}")
}