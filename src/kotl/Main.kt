package kotl

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass


fun main(args: Array<String>) {
val x = C("Hello")

print(x.doOne())

}

interface A {

    val data: String
    fun doOne() {
        print(data)
    }

}

interface B {
    val data:String
    fun doOne() {
        print(data+data)
    }
}

class C(override val data:String): A,B{
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

