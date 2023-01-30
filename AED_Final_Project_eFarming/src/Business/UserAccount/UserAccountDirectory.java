/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author sagar
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().toLowerCase().equals(username.toLowerCase()) && ua.getPassword().equals(password)) {
                System.out.println("ua : " + ua);
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setName(employee.getName());

        userAccountList.add(userAccount);
        System.out.println("userAccount added " + userAccount);
        return userAccount;
    }
}
