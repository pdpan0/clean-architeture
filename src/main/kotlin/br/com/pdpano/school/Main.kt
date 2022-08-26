package br.com.pdpano.school

import br.com.pdpano.school.infra.student.StudentRepositoryInMemory
import br.com.pdpano.school.usecase.student.register.RegisterStudentUserCase
import br.com.pdpano.school.usecase.student.register.StudentDTO

fun main() {
    RegisterStudentUserCase(StudentRepositoryInMemory()).register(
        StudentDTO(
            "Lucas",
            "123",
            "a",
            ""
        )
    )
}