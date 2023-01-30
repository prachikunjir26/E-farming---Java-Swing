/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.ShopItems.ShopItems;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Admin
 */
public class ItemOrderRequest extends WorkRequest {
    
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private String requestID;
    private UserAccount farmer;
    private ShopItems shopItems;
    int min = 100;
    int max = 999;

    public UserAccount getFarmer() {
        return farmer;
    }

    public void setFarmer(UserAccount farmer) {
        this.farmer = farmer;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public ShopItems getShopItems() {
        return shopItems;
    }

    public void setShopItems(ShopItems shopItems) {
        this.shopItems = shopItems;
    }
}
