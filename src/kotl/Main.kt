package kotl

import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.net.URL
import java.util.logging.StreamHandler

fun main(args: Array<String>) {

val url="https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_10MG.mp4"

    Streams(BufferedInputStream(URL(url).openStream()),
    File("someVidoe.mp4").outputStream()){inputStream, outputStream ->
        inputStream.copyTo(outputStream)
    }.start()




}



class Streams(
    private val inStream:InputStream,
    private val outStream:OutputStream,
    private val streamHandler: (InputStream, OutputStream) -> Unit
){
   fun start () = inStream.use {
       outStream.use {
           streamHandler.invoke(inStream, outStream)
       }
   }
}