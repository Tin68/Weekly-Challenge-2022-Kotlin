package com.mouredev.weeklychallenge2022


/*
 * Reto #22
 * CONJUNTOS
 * Fecha publicación enunciado: 01/06/22
 * Fecha publicación resolución: 07/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    var array01 = arrayListOf<String>("coche", "casa","tele", "Jose")
    var array02 = arrayListOf<String>("coche", "casa","tele","Maria", "Ana")
    var array03 = veen (array01, array02, false)

    for(i in array03)
        print("$i ")

    println()

    array03 = veen (array01, array02, true)

    for(i in array03)
        print("$i ")

    println()

    array01 = arrayListOf<String>("Lunes", "Miercoles","Viernes", "Domingo")
    array02 = arrayListOf<String>("Martes", "Miercoles","Jueves","Viernes", "Sabado")
    array03 = veen (array01, array02, true)

    for(i in array03)
        print("$i ")

    println()

    array03 = veen (array01, array02, false)

    for(i in array03)
        print("$i ")

    println()

}

fun veen (combined1 : ArrayList<String>, combined2: ArrayList<String>, election : Boolean): ArrayList<String> {
    var combined4= arrayListOf<String>()

    combined4= combined1.plus(combined2) as ArrayList<String>
    val combined3 = combined4.distinct() as ArrayList<String>
    if (election){
        for (i in combined3.size downTo  1){
            if (!combined1.contains(combined3[i-1]) || !combined2.contains(combined3[i-1])){
                combined3.remove(combined3[i-1])
            }
        }
    }else{
        for (i in combined3.size downTo  1){
            if ((combined1.contains(combined3[i-1]) && combined2.contains(combined3[i-1]))){
                combined3.remove(combined3[i-1])
            }
        }
    }

    return combined3
}