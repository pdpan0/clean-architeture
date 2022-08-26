package br.com.pdpano.school.domain.indication

import br.com.pdpano.school.domain.student.Student
import java.time.LocalDateTime

/**
 * Entidade de indicação.
 */
class Indication(
    private val indicator: Student,
    private val indicatedBy: Student,
    private val indicatedAt: LocalDateTime = LocalDateTime.now()
) { }