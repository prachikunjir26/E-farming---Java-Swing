/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FarmGoods;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Admin
 */
public class FarmGoods {
    private String goodsName;
    private String measure;
    private String quantity;
    private String expectedPrice;
    private String bigMarket;
    private String comments;
    private UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getExpectedPrice() {
        return expectedPrice;
    }

    public void setExpectedPrice(String expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

    public String getBigMarket() {
        return bigMarket;
    }

    public void setBigMarket(String bigMarket) {
        this.bigMarket = bigMarket;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
