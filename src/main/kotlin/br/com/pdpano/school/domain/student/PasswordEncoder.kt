package br.com.pdpano.school.domain.student

interface PasswordEncoder {
    fun encodePassword(password: String): String
    fun validatePassword(encodedPassword: String, password: String): Boolean
}