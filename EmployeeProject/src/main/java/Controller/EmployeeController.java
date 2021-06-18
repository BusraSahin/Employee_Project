package Controller;
import Entity.Employee;
import java.util.List;

public interface EmployeeController {

    Employee createNewEmployee (Employee employee);
    void deleteEmployee(Employee employee);
    List<Employee> getEmployeeList(int limit);
    Employee updateEmployee(Employee updateEmployee);


}
