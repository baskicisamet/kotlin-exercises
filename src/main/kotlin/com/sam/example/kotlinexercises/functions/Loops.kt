package com.sam.example.kotlinexercises.functions

class Loops {

    /**
     **  Range = 1..10 (1 ve 10 araligi icin bir tanimlama), range'ler sadece loop lar icin degil her yerde kulanilabilir.

     * */

    fun sumUntilTheNumber(number: Int) {
        var total = 0
        for (i: Int in 1..(number - 1)) {
            total += i
        }
        println("total = $total")
    }

    //until, sondaki sayinin dahil edilmesi istenmiyorsa kullanilabilir.
    fun sumUntilTheNumber2(number: Int) {
        var total = 0
        for (i in 1 until number) {
            total += i
        }
        println("total = $total")
    }

    fun iterateCollection(collection: Collection<String>){
        print("Collection items : ")
        for(item in collection) print("$item ")
        println()
    }

    fun iterateCollectionWithIndex(collection: Collection<String>){
        println("Collection items with index : ")
        collection.forEachIndexed { index, item -> println("$index = $item") }
    }



    //when ile range kullanimi
    fun whenRange(number: Int) {
        when (number) {
            0, 1 -> print("x == 0 or x == 1")
            in 2..10 -> print("between 2 and 10")
            !in 10..20 -> print("not between 10 and 20")
            else -> print("otherwise")
        }
    }


}


fun main(args: Array<String>) {

    val loops : Loops = Loops()

    loops.sumUntilTheNumber(10)
    loops.sumUntilTheNumber2(10)
    loops.iterateCollection(listOf("x","y","z"))
    loops.iterateCollectionWithIndex(listOf("x","y","z"))
    loops.whenRange(25)


}