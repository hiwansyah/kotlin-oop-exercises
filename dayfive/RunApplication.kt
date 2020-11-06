package dayfive

class RunApplication :Animal {

    //number 7 Pada kelas RunApplication buatlah objek Murai dari kelas Fowl dan berikan nilai pada method setter :
    object Murai {
        fun setData(name: String, age: Int, type: String) {
            println("Nama = $name, umur = $age, tipenya = $type")
        }
    }

    //number 9 Pada kelas RunApplication buatlah objek Tengiri dari kelas Fish dan berikan nilai pada konstruktor
    object Tengiri {
        fun setData(name: String, age: Int, type: String) {
            val a = Animal().animalState()


            println("Nama = $name, umur = $age, tipenya = $type")
        }
    }

}


