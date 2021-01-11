package ch.fhnw.demo.employee.service.converter

import ch.fhnw.demo.employee.domain.Employee
import ch.fhnw.demo.employee.dto.EmployeeDTO

object EmployeeConverter {
    fun convertEmployeeToDTO(employee: Employee): EmployeeDTO {
        return EmployeeDTO(
                id = employee.id,
                firstName = employee.firstName,
                lastName = employee.lastName,
                email = employee.email
        )
    }
}
