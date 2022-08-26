package br.com.pdpano.school.usecase.student.register

import br.com.pdpano.school.domain.student.Cpf
import br.com.pdpano.school.domain.student.Email
import br.com.pdpano.school.domain.student.Student

data class StudentDTO(
    val name: String,
    val cpf: String,
    val email: String,
    val password: String
) {

    fun student() = Student(name = name, cpf = Cpf(cpf), email = Email(email), password = password)
}
