package com.example.projectandroid

fun ContohList(){
    println("=== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    val shape :MutableList<String> = mutableListOf("Circle","square","Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked : List<String> = shape
    println(shapesLocked)


}

fun main (){
    ContohList()
}