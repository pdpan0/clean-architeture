import br.com.pdpano.school.domain.student.*
import br.com.pdpano.school.domain.student.exceptions.PhoneLimitExceededException
import br.com.pdpano.school.usecase.student.register.StudentDTO
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

    @Test
    fun `student shouldnt more two phone registered`() {
        val ddd = "11"
        val number = "987654321"

        assertThrows(PhoneLimitExceededException::class.java) {
            val student = StudentBuilder().build(
                "Lucas", "443.450.428-28", "lucas.martins@gmail.com", "teste123"
            )

            student.phone(ddd, number)
            student.phone(ddd, number)
            student.phone(ddd, number)
        }
    }
}
