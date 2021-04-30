fun main() {

    println(namesList(listOf("Maha","Lesoni", "Kani", "Ngaza", "Furaha", "Kilimani", "Dani", "loreto", "Pangani", "Tetu")))
     println(hamdi(listOf(11.0,22.5,45.5,47.6)))
    persons()
    getpersons()
    var car= listOf(
       Car("KCA",456),
        Car("KCM",734),
        Car("kCL",356)
    )
    println(vehicle(listOf(456,734,356)))


}


fun namesList(names:List<String>):List<String> {
    var w = mutableListOf<String>()
    for ( name in names){
        if (names.indexOf(name)%2==0){
            w.add(name)

}
    }
    return w
}
 fun hamdi(height:List<Double>):Pair<Double,Double>{
   var total = height.sum()
     var average=height.average()
     return Pair(total,average)

 }

    data class Person(val name: String, val age: Int, val height: Int, val weight: Int)

fun persons() {
    var people = listOf(
        Person("John", 45, 5, 56),
        Person("Hamdi", 25, 3, 45),
        Person("Sara", 13, 4, 60)
    )
    var descendingSortedperson = people.sortedByDescending { person -> person.age }
    println(descendingSortedperson)
}


    data class Persons(val name: String, val age: Int, val height: Int, val weight: Int)

    fun getpersons () {
        var people = mutableListOf(
            Person("John", 45, 5, 56),
            Person("Hamdi", 25, 3, 45),
            Person("Sara", 13, 4, 60)
        )
        people.addAll(
            listOf(
                Person("Asmani",15,2,65),
                Person("Jacky",23,5,35)
        ))
        println(people)
    }

    data class Car(var registration:String,var mileage:Int)
    fun vehicle(mileage:List<Int>):Int {
        var speed = mileage.average().toInt()
        return speed

    }
