/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.BigMarketAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class BigMarketSetupEnterprise  extends Enterprise {

    public BigMarketSetupEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.BigMarketSetup);
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        roles = new ArrayList<Role>();
        roles.add(new BigMarketAdmin());
        return roles;
    }
    
}
