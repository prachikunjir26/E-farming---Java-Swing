/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Role;
import Business.Role.ShopOwner;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class FarmingShopsOrganization extends Organization {

    public FarmingShopsOrganization(String name) 
    {
        super(name, "Farming Shop Organization");
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShopOwner());
        return roles;
    }
}
