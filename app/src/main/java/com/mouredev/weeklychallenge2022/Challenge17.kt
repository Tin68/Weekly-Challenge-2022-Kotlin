package com.mouredev.weeklychallenge2022

import java.util.*

/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */


fun main() {
    var acctions = arrayOf("run" , "run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"jump" , "jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump")
    var course = "___|__|_||__|__|__|__|"
    println(runIsOk(acctions, course))
    acctions = arrayOf("run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"jump" , "jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump")
    course = "___|__|_||__|__|__|__|"
    println(runIsOk(acctions, course))
    acctions = arrayOf("jump" , "run" ,"run" ,"run","run" ,"run" ,"jump","run" ,"jump" , "jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump")
    course = "___|__|_||__|__|__|__|"
    println(runIsOk(acctions, course))
    acctions = arrayOf("jump" , "jump" ,"run" ,"run","run" ,"run" ,"jump","run" ,"jump" , "jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump","run" ,"run" ,"jump")
    course = "___|__|_||__|__|__|__|"
    println(runIsOk(acctions, course))
}


fun runIsOk (athlete : Array<String>, track : String): Boolean {
    var trackTemp = ""
    var allOk = true
    if (athlete.size != track.length) {
        println("No coinciden los tamaños")
        return false
    } else {
        for (i in athlete.indices) {
            when (track[i].toString()){
                "_" ->{
                    if (athlete[i]=="run"){
                        trackTemp += "_"
                    } else {
                        trackTemp += "x"
                        allOk=false
                    }
                }
                "|" ->{
                    if (athlete[i]=="jump"){
                        trackTemp += "|"
                    } else {
                        trackTemp += "/"
                        allOk=false
                    }
                }
            }
        }
    }
    println(trackTemp)
    return allOk
}

