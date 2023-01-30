/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGOHelp;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NGOHelp {
    
    private String DamageReason;
    private String DamageDetails;
    private String amount;
    private Date incidentDate;
    private UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getDamageReason() {
        return DamageReason;
    }

    public void setDamageReason(String DamageReason) {
        this.DamageReason = DamageReason;
    }

    public String getDamageDetails() {
        return DamageDetails;
    }

    public void setDamageDetails(String DamageDetails) {
        this.DamageDetails = DamageDetails;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }
}
