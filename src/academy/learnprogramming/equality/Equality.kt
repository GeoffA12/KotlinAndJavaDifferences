package academy.learnprogramming.equality

fun main() {
    val person1 = Person("Jack", 2)
    val person2 = Person("Jill", 3)
    val person3 = Person("Jill", 3)
    println(person1 == person2) // false
    // VERY IMPORTANT DIFFERENCE between Kotlin and Java equality. In Kotlin the equals operator is equivalent to
    // the .equals() method in Java, where we check for structural equality and not referential equality between
    // objects. In Java, the below test would return us false because it would only check for referential equality
    println(person2 == person3) // true
    println(person1.equals(person2)) // false
    // Code below is same as line 12
    println(person2.equals(person3)) // true

    // Here using the triple equals operator we're checking for the referential equality between objects.
    println("\n")
    println(person1 === person2)
    println(person2 === person3)
    var person4 = person2
    println(person2 === person4)

    // Testing not equals
    println("\n")
    println(person4 != person2) // false
    println(person4 !== person2) // false
    println(person2 != person3) // false
    println(person2 !== person3) // true

    val something: Any = person4
    if (something is Person) {
        // The line below is redundant because we've already checked if the variable something is an instance of
        // a person class. Kotlin compilers will smart cast the something object automatically as a Person if the
        // if clause above returns true, giving us access to Person methods and attributes.
        // val newEmployee = something as Person
        println(something.name)
    }


}
class Person(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        // 'is' is equivalent to instanceOf() in java
        if (obj is Person) {
            return name == obj.name && id == obj.id
        }
        else {
            return false
        }
    }
}