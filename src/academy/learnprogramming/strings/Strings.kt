package academy.learnprogramming.strings

fun main() {
    val dog1 = Dog("Spark", "Skip")
    println(dog1)

    val change = 4.22
    println("To show the value of change, we use $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")
    println("Dog 1's owner is named: ${dog1.owner}")
}

class Dog(var name: String, var owner: String) {

    // We can generate a override toString() method by right clicking inside the class and hitting
    // 'generate'. Then click on generate toString() option. IntelliJ will look at our class definition
    // and generate a toString method here for us.
    override fun toString(): String {
        // String templates are an added feature to Kotlin not present in Java
        return "Dog(name=$name, owner=$owner)"
    }
}