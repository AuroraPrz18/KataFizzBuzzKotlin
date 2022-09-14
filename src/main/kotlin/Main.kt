fun main(args: Array<String>) {
    for (i in 1..1000000) {
        println("$i "+fizzBuzz(i))
    }
}

fun fizzBuzz(value: Int): String{
    if(value > 1000000)
        return "Numero demasiado grande"
    return if(value % 5 == 0 && value % 3 == 0 )
        "FizzBuzz!"
    else if(value % 5 == 0)
        "Fizz!"
    else if(value % 3 == 0)
        "Buzz!"
    else
        numToString(value)
}

fun numToString(value: Int):String{
    val valueStr = value.toString()
    var valueStrFinal = ""
    val length = valueStr.length
    var ini = 0


    if(length == 7){
        return "un millon"
    }
    if(length > 6)
        valueStrFinal += " "
    if(length > 3){
        // Para los miles
        if(length == 4 && valueStr[0]=='1')
            valueStrFinal += "mil "
        else valueStrFinal += numToString100(valueStr.substring(ini, length - 3)) + " mil "
        valueStrFinal += numToString100(valueStr.substring(length - 3))
    }else valueStrFinal += numToString100(valueStr)
    return valueStrFinal
}

fun numToString100(value: String):String{
    var valueStr = value
    var valueStrFinal = ""
    var ini = 0

    if(valueStr.length == 3){
        if(valueStr[ini] == '1'){
            if (valueStr == "100")
                return "cien "
            else
                valueStrFinal += "ciento "
        }
        else if(valueStr[ini] == '2')
            valueStrFinal += "doscientos "
        else if(valueStr[ini] == '3')
            valueStrFinal += "trescientos "
        else if(valueStr[ini] == '4')
            valueStrFinal += "cuatrocientos "
        else if(valueStr[ini] == '5')
            valueStrFinal += "quinientos "
        else if(valueStr[ini] == '6')
            valueStrFinal += "seiscientos "
        else if(valueStr[ini] == '7')
            valueStrFinal += "setecientos "
        else if(valueStr[ini] == '8')
            valueStrFinal += "ochocientos "
        else if(valueStr[ini] == '9')
            valueStrFinal += "novecientos "
        valueStr = valueStr.substring(1)
    }

    if(valueStr.length == 2){
        if(valueStr == "10")
            return valueStrFinal +"diez "
        else if(valueStr == "11")
            return valueStrFinal +"once "
        else if(valueStr == "12")
            return valueStrFinal +"doce "
        else if(valueStr == "13")
            return valueStrFinal +"trece "
        else if(valueStr == "14")
            return valueStrFinal +"catorce "
        else if(valueStr == "15")
            return valueStrFinal +"quince "
        else if(valueStr == "16")
            return valueStrFinal +"dieciseis "
        else if(valueStr == "17")
            return valueStrFinal +"diecisiete "
        else if(valueStr == "18")
            return valueStrFinal +"dieciocho "
        else if(valueStr == "19")
            return valueStrFinal +"diecinueve "
        else if(valueStr == "20")
            return valueStrFinal +"veinte "
        else if(valueStr[ini] == '2')
            valueStrFinal +=  "veinti"
        else if(valueStr[ini] == '3')
            valueStrFinal +=  "treinta "
        else if(valueStr[ini] == '4')
            valueStrFinal += "cuarenta "
        else if(valueStr[ini] == '5')
            valueStrFinal += "cincuenta "
        else if(valueStr[ini] == '6')
            valueStrFinal += "sesenta "
        else if(valueStr[ini] == '7')
            valueStrFinal += "setenta "
        else if(valueStr[ini] == '8')
            valueStrFinal += "ochenta "
        else if(valueStr[ini] == '9')
            valueStrFinal += "noventa "
        if(valueStr[ini+1] != '0'  && valueStr[ini] != '2'  && valueStr[ini] != '0')
            valueStrFinal += "y "
        valueStr = valueStr.substring(1)
    }

    if(valueStr.length == 1){
        if(valueStr[ini] == '1')
            valueStrFinal +=  "uno"
        else if(valueStr[ini] == '2')
            valueStrFinal +=  "dos"
        else if(valueStr[ini] == '3')
            valueStrFinal +=  "tres"
        else if(valueStr[ini] == '4')
            valueStrFinal += "cuatro"
        else if(valueStr[ini] == '5')
            valueStrFinal += "cinco"
        else if(valueStr[ini] == '6')
            valueStrFinal += "seis"
        else if(valueStr[ini] == '7')
            valueStrFinal += "siete"
        else if(valueStr[ini] == '8')
            valueStrFinal += "ocho"
        else if(valueStr[ini] == '9')
            valueStrFinal += "nueve"
    }
    return valueStrFinal
}