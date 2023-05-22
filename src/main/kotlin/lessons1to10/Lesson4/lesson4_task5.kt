package lessons1to10.Lesson4

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

    val withoutDamage = !isBodyDamaged && (crewAmount > CREW_MIN_AMOUNT &&  crewAmount <
                        CREW_RECOMMEND_AMOUNT) && foodStock > FOOD_MIN_AMOUNT

    val witMinorDamage = isBodyDamaged && crewAmount == CREW_RECOMMEND_AMOUNT && isWeatherGood
            && foodStock > FOOD_MIN_AMOUNT
    
    val goodForSail = withoutDamage || witMinorDamage

    if(goodForSail)
        println("Отплытие разрешено")
        else
        println("Отплытие запрещено")
}
