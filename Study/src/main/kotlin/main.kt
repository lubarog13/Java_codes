package main;
import java.math.BigInteger
import kotlin.math.pow;

class Main {
    fun digPow(n: Int, p: Int): Int {
        var ints = n.toString().toCharArray().map { it.toString().toDouble() }.toTypedArray();
        var sum = 0.0;
        for (i in 0..ints.size - 1) {
            sum += ints[i].pow(i + p);
        }
        var k = (sum / n).toInt();
        return if ((n * k).toDouble() == sum) k else -1;
    }

    fun findNb(m: Long): Long {
        var n = 0.toLong();
        var t = m;
        do {
            n++; t -= n.toDouble().pow(3).toLong();
        } while (t > 0)
        return if (t == 0.toLong()) n else -1;
    }

    fun reverseLetter(str: String): String {
        return Regex("[^A-Za-z]").replace(str, "").reversed();
    }

    fun toCamelCase(str: String): String = if(!str.equals("")) str[0] + str.split('_','-').map { it.capitalize() }.joinToString(separator = "").substring(1) else "";
    fun incrementString(str: String) : String =
        if (str == "" || str[str.lastIndex] !in '0'..'9') str + '1' else
        if(str[str.lastIndex].toString().toInt()!=9 && str[str.lastIndex].toString().toInt()!=0 ) (Regex("[0-9]").replace(str, "") + Regex("[^0]").replace(str, "") + (Regex("[^0-9]").replace(str, "").toInt() + 1).toString())
        else if(str.find { it=='0' }!=null)(Regex("[0-9]").replace(str, "") + Regex("[^0]").replace(str, "").substring(1) + (Regex("[^0-9]").replace(str, "").toInt() + 1).toString())
        else Regex("[0-9]").replace(str, "") + (Regex("[^0-9]").replace(str, "").toInt() + 1).toString()

    fun find(integers: Array<Int>): Int = if(integers.filter { x -> (x%2)==0 }.size==1) integers.filter { x -> (x%2)==0 }[0] else integers.filter { x -> (x%2)!=0 }[0];

    fun perimeter(n: Int): BigInteger {
        val feb = IntArray(n+2).map { it.toBigInteger() }.toTypedArray()
        feb[0] = BigInteger.valueOf(0)
        feb[1] = BigInteger.valueOf(1)
        for (i in 2 until (n+2)) {
            feb[i] = feb[i - 1] + feb[i - 2]
        }
        return BigInteger.valueOf(4) * feb.sumOf { it }
    }

    fun howmuch(m:Int, n:Int):String {
        var str = "["
        var a = arrayOf(m, n)
        a.sort()
        for (x in 4 until a[1]){
            if (9*x+1<a[0]) continue
            if(9*x+1>a[1]) break
            var y = ((9*x-1) / 7).toFloat()
            if (y == (9*x.toFloat()-1) / 7 && y*7+2>=a[0] && y*7+2<=a[1]) {
                str+="[M: %d B: %d C: %d]".format((y*7+2).toInt(), y.toInt(), x)
            }
        }
        return "$str]"
    }

    fun beggars(values: List<Int>, n: Int): List<Int> {
        var k=0;
        var arr = IntArray(n)
        do {
            for (i in 0 until n) {
                if ((i + k) < (values.size)) arr[i] += values[i + k]
            }
            k+=n
        } while (k<values.size && n!=0)
        return arr.toList()
    }
}

fun main(args: Array<String>) {
    val m = Main();
    println(m.incrementString("hVGcSdHkbW[]233207"));
    var str = "00233207"
    print(m.beggars(listOf(1,2,3,4,5), 0))
}
