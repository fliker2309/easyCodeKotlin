package kotl


fun main(args: Array<String>) {


    val list = mutableListOf<String>()
    list.add("one")
    list.add("two")
    list.addItem("one")
    print(list.size)
}

private fun print(vararg args: String) {
    for (string in args) {
        println(string)
    }
}

fun log(header: String, body: String = "", footer: String) {
    if (header.isNotEmpty()) print(header)
    if (body.isNotEmpty()) print(body)
}

private fun sum(a: Int, b: Int) = a + b

class MyObject {
    private val list = ArrayList<String>()

    infix fun add(str: String) {
        list.add(str)
    }
}

fun <T> singletonList(`object`: T): List<T>{
    val list = ArrayList<T>(1)
    list.add(`object`)
    return list
}

private tailrec fun printIt(str: String, times:Int){
    if(times == 0)
        println("done")
    else {
        println(str + times)
        printIt(str, times -1)
    }
}

fun <T> MutableList<T>.addItem(item:T){
    if(!contains(item)){
        add(item)
    }
}