package com.example.proyecto

fun main (){

    var conteo: Int = 0
    println("Bienvenidos al Quiz \nResponde las siguientes preguntas:" )

    println("Cual es el nombre de nuestra app? \na)Ayuda Canina \nb)Destiny \nc)Ponte a Prueba\n")

    print("opcion: ")
    var opcion1 = readln()
    if (opcion1 == "b") {
        conteo++
        println("respuesta correcta $conteo / 5")
    }else {
        println("respuesta incorrecta $conteo / 5")
    }

    println("Cual es el proposito de la app? \na)ver videos de perros \nb)apuestas \nc)Apoyo amocional\n")

    print("opcion: ")
    var opcion2 = readln()
    if (opcion2 == "c") {
        conteo++
        println("respuesta correcta $conteo / 5")
    }else {
        println("respuesta incorrecta $conteo / 5")
    }

}

