import br.com.pdpano.school.domain.student.Cpf
import br.com.pdpano.school.domain.student.Email
import br.com.pdpano.school.domain.student.Phone
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

    @Test
    fun `phone should be valid`() {
        val ddd = "11"
        val number = "972134247"

        assertDoesNotThrow { Phone(ddd, number) }
    }
}
