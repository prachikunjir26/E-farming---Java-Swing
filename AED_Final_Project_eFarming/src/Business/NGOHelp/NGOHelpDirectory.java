/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGOHelp;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NGOHelpDirectory {
    
    ArrayList<NGOHelp> ngoRequestList;

    public NGOHelpDirectory() {
        this.ngoRequestList = new ArrayList<NGOHelp>();
    }

    public ArrayList<NGOHelp> getNgoRequestList() {
        return ngoRequestList;
    }

    public void setNgoRequestList(ArrayList<NGOHelp> ngoRequestList) {
        this.ngoRequestList = ngoRequestList;
    }
    
}
