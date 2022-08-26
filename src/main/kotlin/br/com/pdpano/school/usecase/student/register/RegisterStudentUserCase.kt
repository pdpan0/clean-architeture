package br.com.pdpano.school.usecase.student.register

import br.com.pdpano.school.domain.student.StudentRepository

class RegisterStudentUserCase(
    private val repository: StudentRepository
) {

    fun register(student: StudentDTO) {
        repository.save(student.student())
    }
}