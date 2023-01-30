package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sagar
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Admin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Admin", "Admin", employee, new SystemAdmin());
        
        return system;
    }
}
