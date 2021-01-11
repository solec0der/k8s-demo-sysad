package ch.fhnw.demo.employee.service

import ch.fhnw.demo.employee.domain.Employee
import ch.fhnw.demo.employee.domain.EmployeeRepository
import ch.fhnw.demo.employee.dto.EmployeeDTO
import ch.fhnw.demo.employee.dto.EmployeesDTO
import ch.fhnw.demo.employee.service.converter.EmployeeConverter
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {

    fun createEmployee(employeeDTO: EmployeeDTO): EmployeeDTO {
        val employee = Employee(
            firstName = employeeDTO.firstName,
            lastName = employeeDTO.lastName,
            email = employeeDTO.email
        )

        return EmployeeConverter.convertEmployeeToDTO(
            employeeRepository.save(employee)
        )
    }

    fun getEmployees(): EmployeesDTO {
        return EmployeesDTO(
                employees = employeeRepository
                        .findAll()
                        .map { EmployeeConverter.convertEmployeeToDTO(it) }
                        .toList()
        )
    }
}
