/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String etName, Enterprise.EnterpriseType type) 
    {
        Enterprise enterprise = null;
        if (null != type) 
        {
            switch (type) 
            {
                case FarmerCommunity:
                    enterprise = new FarmerCommunityEnterprise(etName);
                    enterpriseList.add(enterprise);
                    break;
                case Transportation:
                    enterprise = new TransportationEnterprise(etName);
                    enterpriseList.add(enterprise);
                    break;
                case BigMarketSetup:
                    enterprise = new BigMarketSetupEnterprise(etName);
                    enterpriseList.add(enterprise);
                    break;
                case FarmerHelp:
                    enterprise = new FarmerHelpEnterprise(etName);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
        }
        return enterprise;
    }
}
