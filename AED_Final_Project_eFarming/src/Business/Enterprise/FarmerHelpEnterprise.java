/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FarmerHelpAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class FarmerHelpEnterprise extends Enterprise {

    public FarmerHelpEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FarmerHelp);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FarmerHelpAdmin());
        return roles;
    }
    
}
