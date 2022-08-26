package br.com.pdpano.school.infra.student

import br.com.pdpano.school.domain.student.PasswordEncoder
import java.util.Base64

class PasswordEncoderBase64: PasswordEncoder {
    override fun encodePassword(password: String): String =
        Base64.getEncoder().encodeToString(password.toByteArray())

    override fun validatePassword(encodedPassword: String, password: String): Boolean =
        encodedPassword == encodePassword(password)
}