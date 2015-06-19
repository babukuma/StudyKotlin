/**
 * Created by babukuma on 6/19/15.
 */
package sample

fun main(args: Array<String>) {
    val msg = "Hello, world!"
    println(msg)

    val user = User("babukua")
    user.hello()

    val user2 = User2("babukua")
    user2.hello()

    val user3 = User3("babukua")
    user3.hello()
}

class User(name: String) {
    var name = name

    fun hello() {
        println("Hello $name")
    }
}

class User2(val name: String) {
    fun hello() {
        println("Hello $name")
    }
}

class User3(var name: String) {
    fun hello() {
        println("Hello $name")
    }
}
