/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.FarmGoods.FarmGoodsDirectory;
import Business.NGOHelp.NGOHelpDirectory;
import Business.Role.Role;
import Business.ShopItems.ShopItemDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sagar
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ShopItemDirectory shopItemDirectory;
    private NGOHelpDirectory ngoHelpDirectory;
    private FarmGoodsDirectory farmGoodsDirectory;
    private int organizationID;
    private static int counter = 0;
    public ArrayList<Role> roles;
    private String orgType;
    private Type type;

    public enum Type {
        Admin("Admin Organization"),
        Farmer("Farmer Organization"),
        FarmingShopOwner("FarmingShopOwner Organization"),
        Transporter("Transporter Organization"),
        BigMarket("BigMarket Organization"),
        Company("Company Organization"),
        NGO("NGO Organization"),
        WeatherForecast("WeatherForecast Organization"),
        SmartFarming("SmartFarming Organization");

        private String value;

        private Type(String value) {
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
    
    public ShopItemDirectory getShopItemDirectory() {
        if (shopItemDirectory == null) {
            shopItemDirectory = new ShopItemDirectory();
        }
        return shopItemDirectory;
    }
    
    public NGOHelpDirectory getNGOHelpDirectory() {
        if (ngoHelpDirectory == null) {
            ngoHelpDirectory = new NGOHelpDirectory();
        }
        return ngoHelpDirectory;
    }
    
    public FarmGoodsDirectory getFarmGoodsDirectory() {
        if (farmGoodsDirectory == null) {
            farmGoodsDirectory = new FarmGoodsDirectory();
        }
        return farmGoodsDirectory; 
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Organization(String name, String orgType) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new ArrayList<>();
        this.orgType = orgType;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
