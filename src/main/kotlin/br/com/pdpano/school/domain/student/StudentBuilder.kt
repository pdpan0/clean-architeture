package br.com.pdpano.school.domain.student

/**
 * Builder de um Estudante
 */
class StudentBuilder {
    private var student: Student? = null

    fun build(name: String, cpf: String, email: String, password: String): StudentBuilder {
        this.student = Student(
            name = name,
            cpf = Cpf(cpf),
            email = Email(email),
            password = password
        )
        return this
    }

    fun phone(ddd: String, number: String): StudentBuilder {
        this.student?.phone?.add(Phone(ddd, number))
        return this
    }
}