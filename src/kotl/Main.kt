package kotl

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass


fun main(args: Array<String>) {


    val array = Array(5) { i -> i + 1 }
    array.forEach { print(it) }

    println("")
    val array2 = Array(5) { 0 }
    array2.forEach { print(it) }

    val array3 = Array(5) { 0 }
    array3[2] = 4
    array3.forEach { print(it) }

    val differentArray = arrayOf(1, "2", 3, "4")
    differentArray.forEach {
        if (it is String) print(it)
    }

    val anotherArray = arrayOf(1, "2", 3, "4")
    anotherArray.plus("new").forEach {
        if (it is String) print(it)
    }

}

interface A {

    val data: String
    fun doOne() {
        print(data)
    }

}

interface B {
    val data: String
    fun doOne() {
        print(data + data)
    }
}

class C(override val data: String) : A, B {
    override fun doOne() {
        super<A>.doOne()
        super<B>.doOne()
        println("do one C $data")
    }

}


sealed class Result {
    class Success(val data: Int) : Result()
    class Error(val message: String) : Result()
}

interface Repository {
    fun getData(): Result
}

