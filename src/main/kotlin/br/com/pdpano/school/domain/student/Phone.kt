package br.com.pdpano.school.domain.student

/**
 * Value Object para Telefone
 */
class Phone(ddd: String, number: String) {
    val ddd: String = validateArgument(ddd, Regex("\\d{2}"), "Invalid DDD")
    val number: String = validateArgument(number, Regex("\\d{8}|\\d{9}"), "Invalid Number")

    private fun validateArgument(value: String, regex: Regex, errorMessage: String): String {
        require(regex.matches(value)) { errorMessage }
        return value
    }
}
