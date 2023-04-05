package Lesson4

const val CREW_RECOMMEND_AMOUNT = 70
const val CREW_MIN_AMOUNT = 55
const val FOOD_MIN_AMOUNT = 50
fun main(){

    println("Для принятия решения о возможности отплытия ответьте на следующие вопросы:")
    println("1. Есть ли повреждения корпуса?(true/false): ")
    var isBodyDamaged = readln().toBoolean()
    println("2. Численность экипажа (чел.): ")
    var crewAmount = readln().toInt()
    println("3. Количество провизии (ящиков): ")
    var foodStock = readln().toInt()
    println("4. Благоприятны ли метеоусловия?(true/false): ")
    var isWeatherGood = readln().toBoolean()

    var goodForSail = (!isBodyDamaged && (crewAmount > CREW_MIN_AMOUNT &&
            crewAmount < CREW_RECOMMEND_AMOUNT) && foodStock > FOOD_MIN_AMOUNT) ||
            (isBodyDamaged && crewAmount == CREW_RECOMMEND_AMOUNT && isWeatherGood
             && foodStock > FOOD_MIN_AMOUNT)
    if(goodForSail)
        println("Отплытие разрешено")
        else
        println("Отплытие запрещено")
}
