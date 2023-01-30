/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FarmGoods;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FarmGoodsDirectory {
    
    ArrayList<FarmGoods> farmGoodsList;

    public FarmGoodsDirectory() {
        this.farmGoodsList = new ArrayList<FarmGoods>();
    }

    public ArrayList<FarmGoods> getFarmGoodsList() {
        return farmGoodsList;
    }

    public void setFarmGoodsList(ArrayList<FarmGoods> farmGoodsList) {
        this.farmGoodsList = farmGoodsList;
    }
}
