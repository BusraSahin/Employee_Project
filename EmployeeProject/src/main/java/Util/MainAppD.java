package Util;
import Controller.EmployeeControllerD;
import Controller.EmployeeControllerImplD;
import Entity.EmployeeD;

import java.util.Date;

public class MainAppD {

    public static void main(String[] args) {

        EmployeeControllerD employeeControllerD = new EmployeeControllerImplD();

            EmployeeD employee = new EmployeeD();
            employee.setFirsname("Büşra");
            employee.setLastname("ŞAHİN");
            employee.setDateofBirth(new Date(1999/06/07));


        }
}
