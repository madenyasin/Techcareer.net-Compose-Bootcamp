package com.example.kotlin_dersleri.odev2

import com.example.kotlin_dersleri.object_oriented.ucretHesapla

fun main() {
    println(fahrenhiet(0.0))
    calculatePerimeter(10.0, 20.0)

    println(factorial(0))
    println(factorial(12))


    countAInWord("yasin maden")

    println(toplamIcaci(3))

    println(maasHesapla(3))
    println(maasHesapla(25))

    println(internetUcretHesapla(50))
    println(internetUcretHesapla(60))
}

fun fahrenhiet(derece: Double): Double {
    return derece * 1.8 + 32
}

fun calculatePerimeter(shortSide: Double, longSide: Double) {
    val result = 2 * (shortSide + longSide)
    println(result)
}

fun factorial(n: Int): Long {
    if (n <= 1)
        return 1
    var result: Long = 1
    for (i in n downTo 2 step 1) {
        result *= i
    }
    return result
}

fun countAInWord(word: String) {
    var counter = 0
    for (i in word.indices) {
        if (word[i].lowercase().first() == 'a')
            counter++
    }
    println(counter)
}

fun toplamIcaci(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gun: Int): Int {
    var toplamSaat = gun * 8
    var toplamUcret = 0
    if (toplamSaat <= 160) {
        toplamUcret = toplamSaat * 10
    } else {
        toplamUcret = ((toplamSaat - 160) * 20) + (160 * 10)
    }
    return toplamUcret
}

fun internetUcretHesapla(kota: Int): Int {
    if (kota <= 50)
        return 100
    else
        return 100 + ((kota - 50) * 4)
}