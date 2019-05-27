package pl.edu.ur.oopl5.companyAndEmployees.company;

import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractCompany;
import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;


/**
 */
public class Company extends AbstractCompany {

    Employee[] employee = new Employee[100];
    
    
    public Company(int n) {
        super(n);
    }

    @Override
    public void addEmployee(Employee e) {
        
    }

    @Override
    public Employee[] getEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
