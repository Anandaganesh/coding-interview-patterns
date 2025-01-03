package common.twopointers.tripletsum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TripletSumBruteForceTest {

    private val question = TripletSumBruteForce()

    @Test
    fun `Verify solution`() {
        val result = question.solution(listOf(0, -1, 2, -3, 1))
        assertEquals(2, result.size)
        assertEquals(result[0], listOf(-3, 1, 2))
        assertEquals(result[1], listOf(-1, 0, 1))
    }

}