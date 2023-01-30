/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BigMarketManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class BigMarketOrganization extends Organization {

    public BigMarketOrganization(String name) 
    {
        super(name, "Big Market Organization");
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BigMarketManager());
        return roles;
    }
}
