package br.com.pdpano.school.domain.student

import br.com.pdpano.school.domain.student.exceptions.PhoneLimitExceededException

/*
 *
 *  Camada de domínio deve se focar nas regras de negócio e se tornar o mais próximo da vida real.
 *
*/

/**
 * Entidade de estudante
 */
class Student (
    val cpf: Cpf,
    val name: String,
    val email: Email,
    val password: String,
    val phone: MutableList<Phone> = mutableListOf()
) {
    fun addPhone(ddd: String, phone: String) =
        if (this.phone.size == 2) throw PhoneLimitExceededException()
        else this.phone.add(Phone(ddd, phone))
}