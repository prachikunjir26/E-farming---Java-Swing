/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Farmer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class FarmerOrganization extends Organization {

    public FarmerOrganization(String name) 
    {
        super(name, "Farmer Organization");
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Farmer());
        return roles;
    }
}
