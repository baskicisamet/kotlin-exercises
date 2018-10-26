package com.sam.example.kotlinexercises.functions

class HighOrderFunction {

    /**Kotlin'de fonksiyonlar 'first-class' dir.
     ** first-class function ==> Bu fonksiyonlar degisken ve veri yapisi olarak tanimlanabilir. Ayrica 'higher-order' function larin
    parametreleri veya donus tipleri olabilirler.

     ** Higher-Order Functions ==> Bir function'i parametre olarak veya donus tipi olarak kullanabilirler.

     */

    //Collection lar icin kullanilacak bir method tanimliyoruz.
    //method 2 adet parametre aliyor, 1.parametreyi initial data olarak kullanicak, '2.parametrede de fonksiyon aliyor,bu fonksiyona collectiondaki datalari topluyacak. ve initial datanin tipinde bir data  döndürecek.
    fun <T, R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R { //Bu method iki adet paramtre aliyor.
        var accumulator: R = initial
        for (element: T in this) {
            accumulator = combine(accumulator, element)
        }
        return accumulator
    }
}


fun main(args: Array<String>) {
    /** Kullanim seklilleri : **/

    val items = listOf(1, 2, 3, 4, 5)


    //block lambda kulanimi(cok satirli) +++++++++++++++++++++++++++++++++++++++
    val result = items.fold(0, { acc: Int, i: Int ->
        val result = acc + i
        result //Son satirda yazili olan degisken return degeridir.
    })
    println("block lambda result = $result")
    //---------------------------------------------------------------



    //parametre tipleri belirtilmeden  ve tek satirlik ifade ile  ++++++++++++++++++++++++++
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })
    println("joinedToString = $joinedToString")
    //--------------------------------------------------------------



    //high order function cagrisi ++++++++++++++++++++++++++++++++++++++++++++++++
    val highOrderResult = items.fold(1, Int::times)
    println("high order function result = $highOrderResult")
    //--------------------------------------------------------------------------




}