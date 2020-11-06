package dayfive
//number 3 make class fowl and fish

open class Fowl : Animal() {
    override val umur: Int = 2
    override fun animalState(): String {    //Number 4 overriding animalState with Logic
        return when {
            umur < 1 -> "belum siap diternakan"
            umur >= 1 -> "siap diternakan"
            else -> "Unknown"
        }
    }
}

fun main() {
    var a = Fowl()
    println(a.animalState())

    //lanjutan number 9 isi konstruktor
    val dataMurai = RunApplication.Murai
    dataMurai.setData("murai batu", 6, "vertebrata")
}
