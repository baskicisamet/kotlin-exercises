package com.sam.example.kotlinexercises.clazz

/**
 ** Primary constructorlar sinifin hemen yaninda tanimlanir.
 ** sinif icerisinde tanimlananlar secondary consturtorlardir. secondary constructorlarin primary consructorlari cagirma zorundaligi vardir.

 ** Calisma sirasi = primaryConstructor --> globalArea --> init -->  secondaryConstructor

 ** sinif initialize edildiginda kesin olarak calismasini istegimiz kodlar varsa,
    bunlari ayri ayri constructor combinasyonlarina yazmak yerine init alaninda yazmaliyiz.
    Spring'in @PostConstruct anatasyonun karsiladigi islevi burada dilin kendi native ozelligi ile halletmis oluyoruz aslinda.
    @PostConstruct ile aralarindaki fark:
        - init'in contruct blogundan once calismasi(bunun biir avantaji var midir? bilmiyorum).
  */

class ConstructorExample constructor(name:String) {
    var myName : String = name

    init {
        println("in init : $name")
        println("global variable = $myName")
    }

    constructor(name: String, surname: String) : this(name){ //primary constructor burada this ile cagriliyor.
        println("in secondary constructor : $surname")
    }

    constructor(name: String, surname: String, age:Int) : this(name,surname){ //2 parametre alan constructor cagriliyor
        println("in secondary constructor with three parameter : $age")
    }
}


fun main(args : Array<String>){
    ConstructorExample("samet")
    ConstructorExample("samet","baskici")
    ConstructorExample("samet","baskici",24)
}