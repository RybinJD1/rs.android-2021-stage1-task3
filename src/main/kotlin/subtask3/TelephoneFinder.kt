package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        if (number.isEmpty() || number.toInt() < 0 || number.length > 10) {
            return null
        }

        val result = ArrayList<String>()

        for (i in number.indices) {
            val builder = StringBuilder(number)
            val listOptions = getListOptions(number[i])
            listOptions.forEach {
                builder.setCharAt(i, it)
                result.add(builder.toString())
            }
        }
        return result.toTypedArray()
    }

    private fun getListOptions(number: Char): List<Char> {
        return when (number) {
            '0' -> listOf('8')
            '1' -> listOf('2', '4')
            '2' -> listOf('1', '3', '5')
            '3' -> listOf('2', '6')
            '4' -> listOf('1', '5', '7')
            '5' -> listOf('2', '4', '6', '8')
            '6' -> listOf('3', '5', '9')
            '7' -> listOf('4', '8')
            '8' -> listOf('0', '5', '7', '9')
            else -> listOf('6', '8')
        }
    }

}
