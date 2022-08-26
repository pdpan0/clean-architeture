/*
 *
 *  Camada de domínio deve se focar nas regras de negócio e se tornar o mais próximo da vida real.
 *
*/

/**
 * Entidade de estudante
 */
class Student (
    private val cpf: Cpf,
    private val name: String,
    private val email: Email
)