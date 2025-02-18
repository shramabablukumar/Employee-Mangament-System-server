package JBT.GROUP.service;

import JBT.GROUP.dto.EmployeeDto;
import java.util.List;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

     List<EmployeeDto> getAllEmployees();
     EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);
     void deleteEmployee(Long employeeId);
}
