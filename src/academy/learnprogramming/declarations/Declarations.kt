package academy.learnprogramming.declarations

// We define type aliases at the top of our Kotlin files by convention. Type aliases help us
// cut down of the amount of code we write.
typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    // Using our EmployeeSet typealias
    val employeeSet: EmployeeSet

    // Val means the variable is immutable. This is equivalent to writing 'final' in java.
    // Kotlin compilers use type inference so we must declare a value to store in the variable and
    // not leave it uninitialized.
    val x = 25

    // Leave a variable declared but not initialized with a value
    val number: Int
    // Initialize it
    number = 10

    // If we want to declare a short variable, we need to be explicit and tell the compiler the value
    // of the variable type.
    val shortNumber: Short = 25

    // Variables declared with var are mutable variables, meaning we can change their value over the course
    // of the scope of the variable.
    // It's best practice in Kotlin to declare and initialize variables as val's rather than var's
    var m: Int
    m = 10
    m = 20
    // However, the we can't muitate the type of a var variable after declaration.
    // This code would result in a syntax error because the compiler can't change the type of the variable
    // while compiling.
    // m = "haha"

    // Notice here that we declare the employee1 object as an immutable object. However, the object has
    // mutable field definitions. Therefore, we can mutate the inner properties of an immutable object in
    // Kotlin. Instance properties are still mutable even if tehe variable storing the reference is immutable
    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"
    // This would result in an error
    // employee1 = Employee("Tim Watson", 43)

    val employee2: Employee
    val number2 = 100
    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }

    // When working with collections like array lists we no longer have to use arrayList.get(index) to access
    // an element. We can use square brackets to access offsets instead.
    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])
}

class Employee(var name: String, val id: Int) {

}