package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val squareNumber = number.toLong() * number.toLong()
        return calculate(squareNumber, number)?.toTypedArray()
    }

    private fun calculate(squareNumber: Long, number: Int): ArrayList<Int>? {
        if (squareNumber < 0) return null
        if (squareNumber == 0L) return arrayListOf()

        var result: ArrayList<Int>? = null
        var temp = number
        while (result == null && temp > 1) {
            temp--
            val newSquareNumber = squareNumber - (temp.toLong() * temp.toLong())
            result = calculate(newSquareNumber, temp)
        }
        result?.add(temp)
        return result
    }

}
