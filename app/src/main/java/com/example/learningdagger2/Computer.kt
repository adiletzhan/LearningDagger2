package com.example.learningdagger2

class Processor {

    override fun toString() = "AB2021"
}

class MotherBoard {

    override fun toString() = "X7 3000"
}

class RAM {

    override fun toString() = "16 GB"
}

data class Computer(
    val processor: Processor,
    val motherBoard: MotherBoard,
    val ram: RAM,
)