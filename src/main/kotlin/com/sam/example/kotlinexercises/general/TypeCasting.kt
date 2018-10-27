package com.sam.example.kotlinexercises.general


fun cast(data: Any) {
    when (data) {
        //is Int dedikten sonra eger Int ise sag tarafta Int'e cast edilmis halde geciyor.
        // Smart casting diyorlar bu olaya.
        is Int -> println(data::class)
        is Float -> println(data::class)
        is String -> println(data::class)
        is Boolean -> println(data::class)
    }
}

fun checkIsString(data: Any) {
    var result: Boolean = data is String //'!is' de kullanilabilir (bu tipden degil ise)
    println("is $data String ? = $result")
}

fun castToString(data:Any){
    var capitalized = (data as String).capitalize()

    println("capitalized = ${capitalized}")
}

fun main(args: Array<String>) {
    cast(15)
    cast(15L)
    cast(15F)
    cast("samet")
    cast(true)

    checkIsString("Samet")
    checkIsString(24)

    castToString("sam")

}