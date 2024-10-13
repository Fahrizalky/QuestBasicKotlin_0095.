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

// set adalah kumpulan data yang tidak memiliki atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// set bersifat mutable da read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// set read-only menggunakan setOf
// set mutable menggunakan mutablesetOf

fun ContohSet () {
    println()
    println("== Set ==")

    //Set ready-only
    val readOnlyAbjad = setOf("A", "B", "C",)
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //set read0-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)

}

// map adalah kumpulan data yang dalam pasangan key-value
// map bersifat unordered,artinya data yang dimasukkan tidak memiliki posisi tertentu
// map bersifat mutable dan read-only,artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// map read-only menggunakan mapOf
// map mutable menggunakan mutableOf

fun ContohMap() {

    println()
    println("=== Map ===")
    // Map read-only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

// Menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

// Menghapus data di dalam Map Mutable
    shape.remove("Circle")
    println(shape)

// Menghapus data di dalam Map Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Squre"] = 5
    println(shape)








