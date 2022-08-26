import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class StudentTest {
    @Test
    fun `email should be valid`() {
        val mock = "lucas.martins@gmail.com.br"

        assertDoesNotThrow { Email(mock) }
    }

    @Test
    fun `cpf should be valid`() {
        val mock = "443.450.428-28"

        assertDoesNotThrow { Cpf(mock) }
    }
}
