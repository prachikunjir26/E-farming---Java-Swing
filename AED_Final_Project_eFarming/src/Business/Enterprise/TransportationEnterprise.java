/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.TransporterAdmin;
import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class TransportationEnterprise extends Enterprise {

    public TransportationEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Transportation);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new TransporterAdmin());
        return roles;
    }
    
}
