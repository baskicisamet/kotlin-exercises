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