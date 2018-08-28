/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
    
    val boolTrue = true
    val angkaSaya = 123
    val karakterKu = "Z"
    
    println(angkaSaya)
    println(karakterKu)
    
    
    val a = 4
    val b = 8
    val c = 6
    
    val x = a < b && a > c
    val y = a < b && a > b
    val z = a < b && a < c
    val xz = a < b || a > c
    
    println(x)
    println(y)
    println(z)
    println(xz)
    
    val multiString = "Hai Nama Saya" + "  " + "Zidni Ridwan Nulmuarif"
    println(multiString)
    
    val tahunLahir = 1999
    val tahunIni = 2018
    val umurSaya = tahunIni-tahunLahir
    println(umurSaya)
    
    var simpleArray = arrayOf(1,2,3,4,5,6,7)
    println(simpleArray[0])
    
    val arrayCampuran = arrayOf(1,"Hai", true)
    
    println(arrayCampuran[2])
    
    var nameI = "Zidni"
    nameI = "Zidni Ridwan Nulmuarif"
    println(nameI)
    
for (number in 1..5) {
    println(number)
	}
 
 val numX = 7
 val numZ = 7
    
    if  (numX > numZ) {
        print("x Lebih besar dari z")
    }else if (numX < numZ) {
        println("x Lebih kecil dari z")
    }else{
        println("X dan Z Sama")
    }

    
}

/* class Siswa {
    val namaMurid : String = ""
    get() = field.toUpperCase()
    set (value) {
        field = "Name : $value"
    }
    
}
*/





