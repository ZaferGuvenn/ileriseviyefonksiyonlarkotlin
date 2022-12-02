package com.example.leriseviyefonksiyonlar



fun main(){

    /*
    * Apply
    * */
    //Tekrar edilen durumlarda kullanılabilir.

    //normal gösterim
    val tekrar= Tekrar()

    tekrar.topla()
    tekrar.carp()

    //apply kullanarak
    val tekrar2=Tekrar().apply {
        topla()
        carp()
    }


    /*
    * With
    * */
    //apply'a benzer ancak bazen bir şey döndürmez.

    val emtyBook=with(Book("efiller",543)){
        name="Sefiller"
    }
    println(emtyBook)//Unit yazar. Apply yazsaydık çıktı Book(name=Sefiller, page=543) olurdu.



    val notEmtyBook=Book("efiller",543)

    with(notEmtyBook){
        name="Sefiller"
    }
    println(notEmtyBook)//Book(name=Sefiller, page=543)
}

class Tekrar(){

    fun topla(){
        println(3+4)
    }


    fun carp(){
        println(3*5)
    }
}