package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String? {
        var date: GregorianCalendar = GregorianCalendar(year.toInt(), month.toInt() - 1, day.toInt())
        if (day.toInt() == 29 && month.toInt() == 2 && !date.isLeapYear(year.toInt())) return "Такого дня не существует"
        if (day.toInt() >= 32 || month.toInt() > 12) return "Такого дня не существует"
        return SimpleDateFormat("dd MMMM, EEEE", Locale("ru")).format(date.time)
    }
}
