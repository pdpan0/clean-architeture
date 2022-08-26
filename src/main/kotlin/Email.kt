class Email(email: String) {
    val address: String = validateEmail(email)

    private fun validateEmail(value: String): String {
        require(Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)) {
            "Invalid email"
        }

        return value
    }
}
