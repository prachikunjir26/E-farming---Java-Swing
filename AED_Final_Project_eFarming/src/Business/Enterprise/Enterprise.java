/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author sagar
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name, "");
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType {
        FarmerCommunity("Farmer Community"),
        Transportation("Transportation"),
        BigMarketSetup("Big Market Setup"),
        FarmerHelp("Farmer Help");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
