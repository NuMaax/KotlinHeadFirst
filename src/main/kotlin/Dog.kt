@file:Suppress("unused", "CanBeParameter")
@Suppress("MemberVisibilityCanBePrivate")

    //Dog(...val name: String...) это и есть конструктор
class Dog(val name: String, var weight: Int, val breed_param: String) {

    //можно добавить в конструктор другие значения
    val activities = arrayOf("Walks")

    //или изменить значение перед объявлением .toUpperCase() - преобразование
    // букв в верхний регистр
    val breed = breed_param.toUpperCase()

    //init - зарезервированное слово, означает, что при реализации объекта
    //Dog обязательно выполнится init
    init {
        println("Dog $name has been initialised")
    }
}