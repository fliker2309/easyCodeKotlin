package kotl

import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.net.URL
import java.util.logging.StreamHandler

fun main(args: Array<String>) {
val source = listOf(-4,2,-10,0,10)
  print(getNewList(source, "num"))
    print(listOf(1,2,3,4,5).subList(1,3))




}

fun getNewList(source: List<Int>, prefix: String) =
    source.filter { it>0 }.map { prefix + it }