package com.example.leriseviyefonksiyonlar

fun main(){

    ////predicate fonksiyonları olarak geçerler.

    val myNumList= listOf<Int>(1,3,5,7,10,13,15)

    //filter ve map liste dönerler!

    //filter, bir dizi elemanlarını filtrelememizi sağlar
    val smallerSixNumList=myNumList.filter { it<6 }
    println(smallerSixNumList)//altıdan küçük olan elemanları filtreler.


    //map, bir dizideki elemanları bir işleme tâbi tutar.
    val squaredList=myNumList.map { it*it }
    println(squaredList)//elemanların karesini alıp bir listeye atar.

    //ikisini birlikte kullanabiliriz
    val squaredListWhichSmallerSix=myNumList.filter { it<6 }.map { it*it }
    println(squaredListWhichSmallerSix)//ilk olarak 6 dan küçükleri alır sonra bunların karelerini bir listeye atar.



    //All,Any,Count,Find,Findlast


    val checkAll=myNumList.all { it > 5 }//tüm liste 5 ten büyükse true değilse false döner.
    println(checkAll)//false yazdı

    val checkAny=myNumList.any { it > 5 }//herhangi bir eleman 5 ten büyükse true değilse false döner.
    println(checkAny)//true yazdı

    val totalCount=myNumList.count { it > 5 }//5 ten büyük elemanların adedini döner.
    println(totalCount)//4 yazdı

    val findNum=myNumList.find { it > 5 }//5 ten büyük ilk elemanı döner.
    println(findNum)//7 yazdı

    val findLastNum=myNumList.findLast { it > 5 }//5 ten büyük son elemanı döner.
    println(findLastNum)//15 yazdı

    //predicate örneği

    val myPredicate={num:Int-> num<5}

    val withPredicateFilter=myNumList.filter(myPredicate)
    println(withPredicateFilter)//1,3 liste yazdı.

    val withPredicateMap=myNumList.map(myPredicate)
    println(withPredicateMap)//[true, true, false, false, false, false, false] yazdı.
    //burada ise ona uygun bir pedicate oluşturmamız daha iyi olur çünkü mapin yapması gereken elemanları değiştirmek.

    val myPredicateForMap={num:Int-> num*num}
    val withPredicateMap2=myNumList.map(myPredicateForMap)
    println(withPredicateMap2)//tüm elemanların karelerini yazar.


    val withPredicateCount=myNumList.count(myPredicate)
    println(withPredicateCount)//5 ten küçük eleman adedini yazar.


    val withPredicateCheckAny=myNumList.any(myPredicate)
    println(withPredicateCheckAny)//true yazdı.

    //devamı için ileri seviye fonksiyonlar 2.kt açınız....
}