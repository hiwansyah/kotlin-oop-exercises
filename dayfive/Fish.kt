package dayfive


//number 3 make class fowl and fish
class Fish() : Animal() {

    var age: Int = 0                        //number 5 Pada kelas Fish membuat methode dengan named parameter dan default parameter
    fun calculateMass(weight: Int): Int {
        return age * weight
    }
    fun calculateMass(weight: Int, waterContent: Int): Int {
        return (age * weight) - waterContent
    }
}
fun main() {
    val a = Fish()
    a.age = 5
    println("massa ikan adalah ${a.calculateMass(10)}")
    println("massa ikan dikurangi volume air adalah ${a.calculateMass(10, 10)}")

    //lanjutan number 9 isi konstruktor
    val dataTengiri = RunApplication.Tengiri
    dataTengiri.setData("Tengiri",3,"vertebrata")
}