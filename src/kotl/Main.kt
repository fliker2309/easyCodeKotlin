package kotl

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass


fun main(args: Array<String>) {

    var x : Int = 5
    (x as? String)?.length



}

fun max (a:Int, b:Int) = if (a > b) a else b

fun checkNumber(x:Int){
  when(x){
      in 1..100 -> println("positive")
      in -100..-1 -> println("negative")
      else -> println("out of range")

  }
}

fun check(x:Any?) = when(x){
    is String -> print("it's a string")
    is String? -> print("it's a string or null")
    else -> print("unknown type")
}

fun chechy(x:Any){
    print((x as String).isEmpty())
}

fun convertGrade(grade:Int){
    when(grade){
        5-> println("a")
        4-> println("b")
        3-> println("c")
        2,1-> println("d")

        else -> throw IllegalArgumentException("unknown grade")
    }
}

