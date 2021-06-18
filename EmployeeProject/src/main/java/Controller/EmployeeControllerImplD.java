package Controller;
import Entity.Employee;

import dao.EmployeeDaoD;

import java.util.List;
import java.util.Objects;

public class EmployeeControllerImplD implements EmployeeControllerD{




    @Override
    public Employee createNewEmployee(Employee newEmployee) {

        EmployeeDaoD ed = new EmployeeDaoD();

        if (Objects.nonNull(newEmployee)){

            ed.save(newEmployee);

        }else {
            throw new IllegalArgumentException("HATALI KAYIT!");
        }
      return newEmployee;
    }


    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public List<Employee> getEmployeeList(int limit) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee updateEmployee) {
        return null;
    }
}
