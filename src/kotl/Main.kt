package kotl

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass


fun main(args: Array<String>) {

    val array = arrayOf(1,"2", 3, "4")
    array.forEachIndexed{ index,data ->
        if(data is String)
            print(index)
    }


}



sealed class Result{
    class Success(val data:Int) : Result()
    class Error(val message:String): Result()
}

interface Repository{
    fun getData(): Result
}

