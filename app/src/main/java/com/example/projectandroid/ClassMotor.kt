package com.example.projectandroid

class ClassMotor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1,"mary@gmail.com")
    //Prints the value of the porperty: email
    println(contact.email)

// Update the value of the property: email
    contact.email = "jane@gmail.com"

}
