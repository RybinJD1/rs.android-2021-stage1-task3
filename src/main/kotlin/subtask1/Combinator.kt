package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        if (m < 0 || n <= 0) {
            return null
        }
        for (k in 1..n) {
            if (getBinomialCoefficient(k, n) == m)
                return k
        }
        return null
    }

    private fun getBinomialCoefficient(k: Int, n: Int): Int {
        return (factorial(n) / (factorial(k) * factorial(n - k))).toInt()
    }

    private fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)

}
