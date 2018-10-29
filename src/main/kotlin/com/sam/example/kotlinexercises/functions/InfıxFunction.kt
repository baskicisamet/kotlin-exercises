package com.sam.example.kotlinexercises.functions

/**
    ** olusturdurdugumuz function nun basina 'infix' keyword'u katarak bunun bir infix function oldugunu belirtirix.
    ** [member functionName parameter] olarak cagrilir. (basket add product) gibi.
    ** member function veya extension function olarak kullanilabilirler. bagimsiz bir sekilde olusturulamazlar.
    ** Sadece 1 adet parametre alma zorunlulugu vardir.

    ** infix functionlar aritmatik operator ler, type cast ve rangeTo ile yanyana kulaniliyor ise calisma sirasi olarak onlardan daha geridedir.
    ** boolean operatorden( &&, || vs gibi) de calismasi sirasi oalrak daha ondedir.

    ** dongulerde gordugumuz 'until', 'downTo', 'step' gibi keyword lerde kotlin tarafindan varsayilan olarak olusturulmus infix function lardir.


 * */

class Basket {

    val products: MutableList<String> = ArrayList()

    infix fun add(s:String){
        println("adding $s")
        products.add(s)
    }
}



fun main(args : Array<String>){


    var basket = Basket()

    basket add "prodcut1"
    basket add "prodcut2"
    basket add "prodcut3"
    basket add "prodcut4"

    println("all added products : ${basket.products}")
}



