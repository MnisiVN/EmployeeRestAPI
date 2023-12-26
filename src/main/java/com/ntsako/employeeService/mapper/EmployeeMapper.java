package com.ntsako.employeeService.mapper;

import com.ntsako.employeeService.dto.EmployeeDto;
import com.ntsako.employeeService.entity.Employee;

public class EmployeeMapper {
	
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		if (employee == null) {
			return null;
		}
		
		return new EmployeeDto(employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail());
	}
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		if (employeeDto == null) {
			return null;
		}
		return new Employee(employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail());
	}

}
