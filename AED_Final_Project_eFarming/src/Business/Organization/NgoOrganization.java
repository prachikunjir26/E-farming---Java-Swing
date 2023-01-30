/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.NgoOfficer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class NgoOrganization extends Organization {

    public NgoOrganization(String name) 
    {
        super(name, "NGO Organization");
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NgoOfficer());
        return roles;
    }
}
