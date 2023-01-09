package kotl

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass


fun main(args: Array<String>) {

val repository = object : Repository{
    override fun getData(): Result {
        TODO("Not yet implemented")
    }
}
    when(val result = repository.getData()){
        is kotl.Result.Success -> print(result.data)
        is kotl.Result.Error -> throw IllegalArgumentException(result.message)
    }


}

sealed class Result{
    class Success(val data:Int) : Result()
    class Error(val message:String): Result()
}

interface Repository{
    fun getData(): Result
}

