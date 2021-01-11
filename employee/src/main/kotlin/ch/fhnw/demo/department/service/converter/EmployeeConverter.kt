package ch.fhnw.demo.department.service.converter

import ch.fhnw.demo.department.domain.Employee
import ch.fhnw.demo.department.dto.EmployeeDTO

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
