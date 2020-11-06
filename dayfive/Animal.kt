package dayfive

// number 1
open class Animal {
    open val umur = 0                           //number 2 make encapsulation
    open fun animalState(): String {
        when {
            umur <1 -> println("Belum siap diternakan")
            umur <= 5 -> println("Siap diternakan")
           else -> println("Hewan sudah tua")
        }
        return umur.toString()
    }
}
fun main() {
    val coba = Animal()
    coba.animalState()
}

