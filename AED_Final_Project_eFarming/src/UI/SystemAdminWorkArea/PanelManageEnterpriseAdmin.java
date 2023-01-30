/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.BigMarketAdmin;
import Business.Role.FarmerCommAdmin;
import Business.Role.FarmerHelpAdmin;
import Business.Role.TransporterAdmin;
import Business.UserAccount.UserAccount;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sagar
 */
public class PanelManageEnterpriseAdmin extends javax.swing.JPanel {

    /**
     * Creates new form PanelManageEnterpriseAdmin
     */
    private final EcoSystem system;
    
    public PanelManageEnterpriseAdmin(EcoSystem system) {
        initComponents();
        this.system = system;
        populateTable();
        populateCmbNetwork();
        populateCmbEnterprise();
        System.out.println("Constructor : " + system.getEnterpriseDirectory().getEnterpriseList());
    }
    
    private void populateTable() 
    {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriseAdmin.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) 
        {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) 
                {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateCmbNetwork() {
        cmbNetwork.removeAllItems();
        
        System.out.println("populateCmbNetwork() System : " + Arrays.toString(system.getNetworkList().toArray()));
        for (Network network : system.getNetworkList())
        {
            cmbNetwork.addItem(network.toString());
        }
    }

    private void populateCmbEnterprise() 
    {
        Network network = null;
        String networkName = cmbNetwork.getSelectedItem().toString();
        
        
        for(Network n : system.getNetworkList())
        {
            if(n.getNetworkName().equals(networkName))
            {
                network = n;
            }
        }
        
        if (network != null)
        {
            cmbEnterprise.removeAllItems();

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                cmbEnterprise.addItem(enterprise.toString());
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnterpriseAdmin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblNetwork = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        lblEnterpriseType = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterpriseAdmin = new javax.swing.JTable();
        lblEntAdminName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(223, 238, 234));
        setPreferredSize(new java.awt.Dimension(1140, 800));

        btnEnterpriseAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnEnterpriseAdmin.setText("Create Enterprise Admin");
        btnEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseAdminActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");
        lblPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        lblNetwork.setText("Network :");
        lblNetwork.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        lblUsername.setText("Username:");
        lblUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblEnterpriseType.setText("Enterprise:");
        lblEnterpriseType.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Enterprise Admin");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblEnterpriseAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblEnterpriseAdmin);

        lblEntAdminName.setText("Enter Name:");
        lblEntAdminName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(167, 196, 188)));

        jPanel7.setPreferredSize(new java.awt.Dimension(1140, 154));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/TRY2 copy.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcons/TRY2 copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEntAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbNetwork, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEnterpriseAdmin)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5))))))))
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEnterpriseAdmin)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseAdminActionPerformed

        Enterprise enterprise = null;
        String ent  = cmbEnterprise.getSelectedItem().toString();
        System.out.println("getEnterpriseList : " + Arrays.toString(system.getEnterpriseDirectory().getEnterpriseList().toArray()));
        for (Network network : system.getNetworkList())
        {
            for (Enterprise et : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(et.getName().equals(ent))
                {
                    enterprise = et;
                }
            }
        }

        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String name = txtName.getText();

        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || cmbEnterprise.getSelectedItem() == null || cmbNetwork.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!system.validatePasswordFormat(password))
        return;
        if (!system.checkUniqueUsername(username))
        return;

//        JOptionPane.showMessageDialog(null, "enterprise " + enterprise);
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        UserAccount account = null;

        if (null != enterprise.getEnterpriseType())
        {
            switch (enterprise.getEnterpriseType())
            {
                case FarmerCommunity:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FarmerCommAdmin());
                break;
                case Transportation:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new TransporterAdmin());
                break;
                case BigMarketSetup:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new BigMarketAdmin());
                break;
                case FarmerHelp:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FarmerHelpAdmin());
                break;
                default:
                break;
            }
        }

        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
        JOptionPane.showMessageDialog(null, "User Account created sucessfully");
        populateTable();
    }//GEN-LAST:event_btnEnterpriseAdminActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterpriseAdmin;
    private javax.swing.JComboBox<String> cmbEnterprise;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntAdminName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblEnterpriseAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}