package Controller;
import Entity.Employee;
import java.util.List;

public interface EmployeeControllerD {

    Employee createNewEmployee (Employee employee);
    void deleteEmployee (Employee employee);
    List<Employee> getEmployeeList (int limit);
    Employee updateEmployee(Employee updateEmployee);


}
