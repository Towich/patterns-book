package decorator.customInputStream

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream) : FilterInputStream(inputStream) {
    override fun read(): Int {
        val c = `in`.read()
        return if(c == -1) c else Character.toLowerCase(c)
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result = `in`.read(b, off, len)
        for(i in off until off+result) {
            b[i] = Character.toLowerCase(b[i].toInt()).toByte()
        }
        return result
    }
}