package eu.nullstack.kidlike.kyu6

/**
 * https://www.codewars.com/kata/playing-with-digits/train/kotlin
 */
fun digPow(n: Int, p: Int): Int {
    var pD = p.toDouble()

    val sumOfPow = n.toString().map { c -> Integer.parseInt(c.toString()).toDouble() }
            .stream()
            .map { a -> Math.pow(a, pD++) }
            .reduce { a, b -> a + b }
            .get()

    if (sumOfPow % n == 0.0) {
        return (sumOfPow / n).toInt()
    }

    return -1
}
