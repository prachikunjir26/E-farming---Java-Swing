/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.ShopItems.ShopItemDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author sagar
 */
public abstract class Role {
    
    public enum RoleType {
        
        Admin("Admin"),
        FarmerCommAdmin("FarmerCommAdmin"),
        TransporterAdmin("TransporterAdmin"),
        BigMarketAdmin("BigMarketAdmin"),
        FarmerHelpAdmin("FarmerHelpAdmin"),
        Farmer("Farmer"),
        ShopOwner("ShopOwner"),
        Transporter("Transporter"),
        BigMarketManager("BigMarketManager"),
        CompanyManager("CompanyManager"),
        NgoOfficer("NgoOfficer"),
        WeatherForecastManager("WeatherForecastManager"),
        SmartFarmingManager("SmartFarmingManager");
        
        private String value;
        
        private RoleType(String value){
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
    
   public abstract JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business
   );

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
