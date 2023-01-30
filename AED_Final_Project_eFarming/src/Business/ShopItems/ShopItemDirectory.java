/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ShopItems;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ShopItemDirectory {
    
    ArrayList<ShopItems> shopItemList;

    public ShopItemDirectory() {
        this.shopItemList = new ArrayList<ShopItems>();
    }

    public ArrayList<ShopItems> getShopItemList() {
        return shopItemList;
    }

    public void setShopItemList(ArrayList<ShopItems> shopItemList) {
        this.shopItemList = shopItemList;
    }
    
}
