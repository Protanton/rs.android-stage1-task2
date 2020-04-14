package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = "NO"
        var newString = ""
        for (indexA in 0..a.length - 1){
            for (indexB in 0..b.length - 1){
                if (a.toUpperCase().get(indexA) == b.get(indexB)){
                    newString = "${newString}${a.toUpperCase().get(indexA)}"
                }
            }
        }
        if (newString == b){
            result = "YES"
        }
        return result
    }
}
