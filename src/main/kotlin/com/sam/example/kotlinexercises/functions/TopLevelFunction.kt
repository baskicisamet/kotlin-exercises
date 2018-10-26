package com.sam.example.kotlinexercises.functions

/**

 ** Genelde utility operasyonlari icin bu yontem kullanilir.

 ** Kotlin de static type yoktur, Java da static sekilde  olusturdugumuz methodlari bu sekilde class dan bagimsiz bir sekilde
 olusturup istedigimiz yerde istedigimiz gibi cagirip kullanabiliriz.

 ** Bu yontemle Library de bulanan class lar icin de util method tanimlari yapabilir.(className.methodName seklinde annotate eder isek)

 */

fun sum(a:Int, b:Int) : Int = a + b

fun String.lengthIsEven():Boolean = length % 2 == 0 //lengthIsEven methodunu String sinifinin bir methodu gibi kullanabilecegiz. Mikemmel bir ozellik :O


/** Using utils **/
class XService{

    fun writeSum(a:Int, b:Int) : Unit {
        println("sum = ${sum(a,b)}")
    }

    fun writeTextType(text:String){
        if (text.lengthIsEven()){
            println("text type is even")
        }else{
            println("text type is odd")
        }
    }
}

/** Test **/
fun main(args:Array<String>){
    val xService = XService()

    xService.writeSum(5,10)
    xService.writeTextType("Hey I can be the answer!")

}




