fun main() {

    //Задача 1
    println("Ответ к задаче 1:")
    val str1 = "Занятие"
    str1.forEach { println(it) }

    //Задача 2
    val checkNumber = { number: String ->
        number.take(2) == "+7" && number.length == 11
    }
    println("Пример выполнения решения задачи 2: " + checkNumber("+7123456789"))

    //Задача 3
    val str2 = "12345"
    println("Пример выполнения решения задачи 3: " + str2.reversed())

    //Задача 4
    val str3 = "kotlin2023course"
    var count = 0
    str3.forEach { if (it.isDigit()) count++ }
    println("Ответ к задаче 4: $count")
}