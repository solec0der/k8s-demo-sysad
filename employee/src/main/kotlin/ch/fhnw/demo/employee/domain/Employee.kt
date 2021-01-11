package ch.fhnw.demo.employee.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "employee")
data class Employee(
        @Id
        val id: String? = null,
        val firstName: String,
        val lastName: String,
        val email: String
)
