package br.com.pdpano.school.infra.student

import br.com.pdpano.school.domain.student.Cpf
import br.com.pdpano.school.domain.student.Student
import br.com.pdpano.school.domain.student.StudentRepository

class StudentRepositoryInMemory: StudentRepository {
    val students: MutableList<Student> = mutableListOf()

    override fun save(student: Student) {
        students.add(student)
    }

    override fun findByCpf(cpf: Cpf): Student? =
        students.find { it.cpf.number == cpf.number }

    override fun findAll(): List<Student> {
        TODO("Not yet implemented")
    }
}