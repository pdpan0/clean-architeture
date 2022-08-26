package br.com.pdpano.school.domain.student

interface StudentRepository {
    fun save(student: Student)

    fun findByCpf(cpf: Cpf): Student?

    fun findAll(): List<Student>
}