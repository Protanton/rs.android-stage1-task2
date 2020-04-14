package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val numbers = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
        val h = hour.toInt()
        if (h<0||h>24){
            return ""
        }

        return when (val m = minute.toInt()) {
            0 -> "${numbers[h]} o' clock"
            1 -> "one minute past ${numbers[h]}"
            15 -> "quarter past ${numbers[h]}"
            in 2..29 -> "${numbers[m]} minutes past ${numbers[h]}"
            30 -> "half past ${numbers[h]}"
            45 -> "quarter to ${numbers[(h % 12) + 1]}"
            in 31..58 -> "${numbers[60 - m]} minutes to ${numbers[(h % 12) + 1]}"
            59 -> "one minute to ${numbers[(h % 12) + 1]}"
            else -> ""
        }
    }
}
