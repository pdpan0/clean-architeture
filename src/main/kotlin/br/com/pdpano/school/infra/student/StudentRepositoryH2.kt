package br.com.pdpano.school.infra.student

import br.com.pdpano.school.domain.student.Cpf
import br.com.pdpano.school.domain.student.Student
import br.com.pdpano.school.domain.student.StudentRepository
import java.lang.RuntimeException
import java.sql.Connection
import java.sql.SQLException

class StudentRepositoryH2(private val connection: Connection): StudentRepository {

    override fun save(student: Student) {
        try {
            val sql = "INSERT INTO STUDENT VALUES (?, ?, ?)"
            val ps = connection.prepareStatement(sql)
            ps.setString(1, student.cpf.number)
            ps.setString(2, student.name)
            ps.setString(3, student.email.address)
            ps.execute()
        } catch (e: SQLException) {
            throw RuntimeException(e)
        }
    }

    override fun findByCpf(cpf: Cpf): Student? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Student> {
        TODO("Not yet implemented")
    }
}