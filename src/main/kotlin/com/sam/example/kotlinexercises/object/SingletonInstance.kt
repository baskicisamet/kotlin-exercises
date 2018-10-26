package com.sam.example.kotlinexercises.`object`

object SingletonInstance {

    //Object tanimladigimiz yapilarda tek bir instance olusur. Java'daki gibi singleton class olusturmaya gerek yoktur.
    //Ayrıca objectler bir class'i veya interface'i kalitim alabilir.
    //kotlin de static yapilarda yoktur.

    private var count : Int = 0

    fun currentCount() = count

    fun increment() = ++count

    fun decrement() = --count

}

fun main(args:Array<String>){
    SingletonInstance.currentCount() //instance burada olusuyor.(Object tiplerde instance model'e ilk erisim aninda olusur)
    SingletonInstance.increment()
    SingletonInstance.increment()
    SingletonInstance.increment()
    println("current should be 3 = ${SingletonInstance.currentCount()}")

    SingletonInstance.decrement()
    SingletonInstance.decrement()
    println("current should be 1 = ${SingletonInstance.currentCount()}")
}