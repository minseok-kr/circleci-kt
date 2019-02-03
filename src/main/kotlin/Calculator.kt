package com.minseok.circlecikt.main

interface Calculator {
    var result: Float

    fun addition(i: Number): Number
    fun abstract(i: Number): Number
    fun divide(i: Number): Number
    fun times(i: Number): Number
    fun reset()
}