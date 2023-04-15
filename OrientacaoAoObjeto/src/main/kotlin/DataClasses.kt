data class User(val name: String, val id: Int) {   // declare data class with properties
    override fun equals(other: Any?) =             // override equals() function
        other is User && other.id == this.id       // compare the IDs of both objects

    // no need to override hashCode() function as it's already generated automatically based on properties

}

fun main() {
    val user = User("Alex", 1)                     // create a new user object with name and ID
    println(user)                                   // print the user object

    val secondUser = User("Alex", 1)                // create another user object with same name and ID
    val thirdUser = User("Max", 2)                  // create another user object with different name and ID

    println("user == secondUser: ${user == secondUser}")   // compare user and secondUser using == operator and print result
    println("user == thirdUser: ${user == thirdUser}")     // compare user and thirdUser using == operator and print result

    // hashCode() function
    println(user.hashCode())                                // print hash code of user object
    println(secondUser.hashCode())                          // print hash code of secondUser object
    println(thirdUser.hashCode())                           // print hash code of thirdUser object

    // copy() function
    println(user.copy())                                    // create a copy of user object and print it
    println(user === user.copy())                           // compare user object and its copy using === operator and print result
    println(user.copy("Max"))                               // create a copy of user object with a different name and print it
    println(user.copy(id = 3))                              // create a copy of user object with a different ID and print it

    println("name = ${user.component1()}")                  // get the name of user object using component1() function
    println("id = ${user.component2()}")                    // get the ID of user object using component2() function
}
