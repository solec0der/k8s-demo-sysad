package ch.fhnw.demo.employee.controller

import ch.fhnw.demo.employee.dto.EmployeeDTO
import ch.fhnw.demo.employee.dto.EmployeesDTO
import ch.fhnw.demo.employee.service.EmployeeService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import java.net.InetAddress

@RestController
@RequestMapping("/api/v1/employees")
internal class EmployeeController(
    private val employeeService: EmployeeService
) {

    private val logger = LoggerFactory.getLogger(EmployeeController::class.java)

    @PostMapping
    fun createEmployee(@RequestBody employeeDTO: EmployeeDTO): EmployeeDTO {
        logger.info("HTTP POST: /api/v1/employees from " + InetAddress.getLocalHost())
        return employeeService.createEmployee(employeeDTO)
    }

    @GetMapping
    fun getEmployees(): EmployeesDTO {
        logger.info("HTTP GET: /api/v1/employees from " + InetAddress.getLocalHost())
        return employeeService.getEmployees()
    }
}
