package br.com.pdpano.school.domain.student

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
) { }