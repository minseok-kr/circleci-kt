package com.minseok.circlecikt.main

class CalculatorImpl : Calculator {
    override var result: Float = 0.0F

    override fun addition(i: Number): Number {
        this.result = this.result + i.toFloat()
        return this.result
    }

    override fun abstract(i: Number): Number {
        this.result = this.result - i.toFloat()
        return this.result
    }

    override fun divide(i: Number): Number {
        this.result = this.result / i.toFloat()
        return this.result
    }

    override fun times(i: Number): Number {
        this.result = this.result * i.toFloat()
        return this.result
    }

    override fun reset() {
//        this.result = 0F
    }
}