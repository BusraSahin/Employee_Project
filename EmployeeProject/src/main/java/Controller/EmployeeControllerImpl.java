package Controller;
import Entity.Employee;
import dao.EmployeeDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeControllerImpl implements EmployeeController {

    public Employee createNewEmployee(Employee newEmployee){
        EmployeeDao ed = new EmployeeDao();

        if(Objects.nonNull(newEmployee)){

            ed.save(newEmployee);
        }else{
            throw new IllegalArgumentException("HATALI KAYIT!");
        }

        return newEmployee;
    }

    @Override
    public void deleteEmployee(Employee employee) {

        EmployeeDao employeeDao = new EmployeeDao();

        EmployeeController employeeController = new EmployeeControllerImpl();
        List<Employee> liste= employeeController.getEmployeeList(10);
        for (int i=0;i<liste.size();i++){
            employee=liste.get(i);
            if (employee.getLastName().equalsIgnoreCase("ŞAHİN"))
            {
                employeeDao.delete(employee);
            }
        }


    }

    @Override
    public List<Employee> getEmployeeList(int limit) {

        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = employeeDao.getList(limit);
        return employeeList;


    }

    @Override
    public Employee updateEmployee(Employee updateEmployee) {

        EmployeeDao ed = new EmployeeDao();
        EmployeeController employeeController = new EmployeeControllerImpl();
        List<Employee> liste=new ArrayList<>();
        int a= liste.size();
       liste = employeeController.getEmployeeList(a);
        if (Objects.nonNull(updateEmployee)){
            for (int i=0; i <liste.size();i++){
                updateEmployee=liste.get(i);
                if(updateEmployee.getLastName().equalsIgnoreCase("ŞAHİN")){

                    updateEmployee.setPlaceOfBirth("ANKARA");
                    ed.update(updateEmployee);
                }
            }

            ed.update(updateEmployee);
        }else {

            throw new IllegalArgumentException("Güncellenemedi!");
        }

        return updateEmployee;
    }
}



