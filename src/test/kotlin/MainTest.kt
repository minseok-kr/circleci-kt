import com.minseok.circlecikt.main.Calculator
import com.minseok.circlecikt.main.CalculatorImpl
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * 근데 지금은 옳게 동작할 때만 테스트하잖아..? 근데 테스트의 목적은 안되는 것을 찾는 것이잖아?
 * 이 부분은 어떻게 바꾸지?
 */
class MainTest {
    val calculator = CalculatorImpl()

    @Test
    fun test_더하기() {
        // given..
        calculator.result = 2F

        // when..
        val result = calculator.addition(1)

        // then..
        assertEquals(3F, result)
    }

    @Test
    fun test_빼기() {
        // given..
        calculator.result = 2F

        // when..
        val result = calculator.abstract(2)

        // then..
        assertEquals(0F, result)

    }

    @Test
    fun test_곱하기() {
        // given..
        calculator.result = 2F

        // when..
        val result = calculator.times(2)

        // then..
        assertEquals(4F, result)
    }

    @Test
    fun test_나누기() {
        // given..
        calculator.result = 2F

        // when..
        val result = calculator.divide(2)

        // then..
        assertEquals(1F, result)
    }

    @Test
    fun test_결과보기() {
        // given..
        calculator.result = 13F

        // when..
        val result = calculator.result

        // then..
        assertEquals(13F, result)
    }

    @Test
    fun test_값_비우기() {
        // given..
        calculator.result = 11F

        // when..
        val result = calculator.reset()

        // then..
        assertEquals(0F, calculator.result)
    }
}

