import Controller.EmployeeController;
import Controller.EmployeeControllerImpl;
import Entity.Employee;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        EmployeeController employeeController = new EmployeeControllerImpl();
        Employee employee = new Employee();
        employee.setFirstName("Büşra");
        employee.setLastName("ŞAHİN");
        employee.setDateOfBİrth("06/07/1999");
        employee.setPlaceOfBirth("Bolu");

        //employeeController.createNewEmployee(employee);
        employeeController.getEmployeeList(5);
      //  employeeController.deleteEmployee(employee);
        employeeController.updateEmployee(employee);
        employeeListesi();


    }


    public static void employeeListesi (){

        EmployeeController employeeController = new EmployeeControllerImpl();
        List<Employee> liste = employeeController.getEmployeeList(5);
        for(int i=0 ; i<liste.size();i++){

            Employee employee = liste.get(i);
            System.out.println("Adı/Soyadı : "+employee.getFirstName()+" " + employee.getLastName());
        }
    }

}


