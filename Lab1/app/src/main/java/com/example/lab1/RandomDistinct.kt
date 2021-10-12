package com.example.lab1

import kotlin.random.Random

class RandomDistinct {
    var numbers: List<Int> = listOf()
    init {
        updateNumbers()
        sort()
        sort1()
    }
    fun updateNumbers(){
        numbers = List(15){ Random.nextInt(1, 15) }
    }
    fun sort(): List<Int> {
        return numbers.distinct().sorted()

    }
    fun sort1(): List<Int>{
        return listOf(numbers.distinct().count())
    }


}