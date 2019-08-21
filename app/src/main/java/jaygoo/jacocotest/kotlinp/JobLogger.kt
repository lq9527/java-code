package jaygoo.jacocotest.kotlinp


object JobLogger {

    fun d(msg: String) {
        println("hello the jacoco kotlin test")

        if (msg.length > 2) {
            println("hello the jacoco  branch1")
        } else {
            println("hello the jacoco  branch2")
        }

        if (msg.length > 1) {
            println("hello the jacoco  branch11")
        } else {
            println("hello the jacoco  branch22")
        }

    }

    fun e(e: Exception) {
    }


}
