class Cpf(number: String) {
    val number = validateCpf(number)

    private fun validateCpf(value: String): String {
        require(Regex("(?!(\\d)\\1{2}.\\1{3}.\\1{3}-\\1{2})\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}").matches(value)) {
            "Invalid CPF"
        }

        return value
    }
}