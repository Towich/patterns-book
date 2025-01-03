package decorator.customInputStream

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream

fun main() {
    var c: Int

    try {
        val inputStream: InputStream =
            LowerCaseInputStream(
                BufferedInputStream(
                    FileInputStream("src/main/kotlin/decorator/customInputStream/test.txt")
                )
            )

        c = inputStream.read()
        while (c >= 0) {
            print(c.toChar())
            c = inputStream.read()
        }

        inputStream.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}