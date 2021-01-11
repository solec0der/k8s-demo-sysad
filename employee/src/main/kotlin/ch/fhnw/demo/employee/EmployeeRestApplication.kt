package ch.fhnw.demo.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class EmployeeRestApplication

fun main(args: Array<String>) {
	runApplication<EmployeeRestApplication>(*args)
}
