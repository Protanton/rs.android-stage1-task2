package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var fib1 = 0
        var fib2 = 1
        while(fib1 * fib2 < n) {
            val temp = fib1 + fib2
            fib1 = fib2
            fib2 = temp
        }
        if(fib1 * fib2 == n) return intArrayOf(fib1, fib2, 1)
        return intArrayOf(fib1, fib2, 0)
    }
}
