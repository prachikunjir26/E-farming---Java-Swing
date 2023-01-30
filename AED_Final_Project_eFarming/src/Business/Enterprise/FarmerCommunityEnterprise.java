/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.FarmerCommAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class FarmerCommunityEnterprise extends Enterprise {

    public FarmerCommunityEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FarmerCommunity);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FarmerCommAdmin());
        return roles;
    }
    
}
