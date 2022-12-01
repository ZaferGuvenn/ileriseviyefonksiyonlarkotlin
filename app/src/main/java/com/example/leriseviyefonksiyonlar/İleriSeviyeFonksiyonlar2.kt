package com.example.leriseviyefonksiyonlar

//soon..

fun main(){

    /*
    Let
     */
    //null kontrolü ve not null yapabilme özelliği var.

    //gosterim I
    val myInt :Int?=null


    myInt?.let{//myInt null değil ise aşağıdakini yap
        val num=it+1
        println(num)//bir şey yazmaz çünkü myInt null
    }

    //gosterim II
    val myInt2:Int?=null

    val num2=myInt2?.let {//null olduğundan it+1 işlemini yapmaz.
        it+1
    }?:0

    println(num2)//0 yazar çünkü yukarıda "?:0" yazarak default değeri 0 yaptık.


    /*
    Also
     */
    //ayrıca bunu yap anlamına gelir


    val book1= Book("Yeraltından Notlar",97)
    val book2= Book("Kürk Mantolu Madonna", 177)
    val book3= Book("Sızma Sanatı", 300)

    val Library= listOf<Book>(book1,book2,book3)

    Library.filter{ it.page < 200 }.also { it.forEach()//200 sayfadan küçük olanları filtrele
                                                        //ayrıca isimleri yazdır.
        {
         println(it.name)//Yeraltından Notlar
                        //Kürk Mantolu Madonna  yazar
        }
    }

}

data class Book(var name: String, val page:Int)