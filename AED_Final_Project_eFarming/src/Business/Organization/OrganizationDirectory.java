/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author sagar
 */
public class OrganizationDirectory {
    
    private final ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<Organization> ();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type, String name) 
    {
        Organization organization = null;
                    System.out.println(type.getValue().equals(Organization.Type.Transporter.getValue()));

        if (type.getValue().equals(Organization.Type.Farmer.getValue())) 
        {
            organization = new FarmerOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.FarmingShopOwner.getValue())) 
        {
            organization = new FarmingShopsOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.Transporter.getValue())) 
        {
            organization = new TransporterOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.BigMarket.getValue())) 
        {
            organization = new BigMarketOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.Company.getValue())) 
        {
            organization = new CompanyOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.NGO.getValue())) 
        {
            organization = new NgoOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.WeatherForecast.getValue())) 
        {
            organization = new WeatherForecastOrganization(name);
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.SmartFarming.getValue())) 
        {
            organization = new SmartFarmingOrganization(name);
            organizationList.add(organization);
        } 
        return organization;
    }
}
