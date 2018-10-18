/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeclientserver.ClientCustomer;

/**
 * Form component for Menu Items
 * @author stephenfleming & kosta  
 */
public class MenuItems extends javax.swing.JPanel {

    /**
     * Creates new form MenuItems
     */
    public MenuItems() {
        initComponents();
        //Disable combo-boxes        
        foodItemDropdown.setEnabled(false);
        beverageItemDropdown.setEnabled(false);
        //Used to fix combobox items being hidden bug
        //Sourced from : https://community.oracle.com/thread/1495739
        foodItemDropdown.setLightWeightPopupEnabled(false);
        beverageItemDropdown.setLightWeightPopupEnabled(false);
        //End borrowed code
    }
    /**
     * Resets inputs to their original state
     * Disables:
     *      - foodItemDropdown
     *      - beverageItemDropdown
     */
    public void resetMenuItems()
    {
        //Remove all items
        foodItemDropdown.removeAllItems();
        beverageItemDropdown.removeAllItems();
        //Add default text
        foodItemDropdown.addItem("Select Food");
        beverageItemDropdown.addItem("Select Beverage");
        //Disable combo-boxes
        foodItemDropdown.setEnabled(false);
        beverageItemDropdown.setEnabled(false);
    }
    /**
     * Method to enable combo-boxes
     */
    public void EnableMenuDropdowns() {
        foodItemDropdown.setEnabled(true);
        beverageItemDropdown.setEnabled(true);
    }
    /**
     * Boolean check to see if combo-boxes are enabled
     * @return boolean combo-boxes enabled check
     */
    public boolean isMenuDropdownsEnabled()
    {
        return foodItemDropdown.isEnabled();
    }
    /**
     * Sets items in food combo-box
     * @param arr array of items to add to combo-box
     */
    public void setFoodItems(String[] arr)
    {
        //Remove all pre-existing items
        foodItemDropdown.removeAllItems();
        //Add all new items from array
        for (String s : arr)
        {
            foodItemDropdown.addItem(s);
        }
    }
    /**
     * Sets items in beverage combo-box
     * @param arr array of items to add to combo-box
     */
    public void setBeverageItems(String[] arr)
    {
        //Remove all pre-existing items
        beverageItemDropdown.removeAllItems();
        //Add all new items from array
        for (String s : arr)
        {
            beverageItemDropdown.addItem(s);
        }
    }
    /**
     * Returns currently selected item from food combo-box
     * @return String of selected item
     */
    public String getCurrentFood()
    {
        return (String) foodItemDropdown.getSelectedItem();
    }
    /**
     * Returns currently selected item from beverage combo-box
     * @return String of selected item
     */
    public String getCurrentBeverage()
    {
        return (String) beverageItemDropdown.getSelectedItem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        foodItemDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        beverageItemDropdown = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Food: ");

        foodItemDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food " }));
        foodItemDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodItemDropdownActionPerformed(evt);
            }
        });

        jLabel2.setText("Beverage");

        beverageItemDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Beverage" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodItemDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beverageItemDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(foodItemDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(beverageItemDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void foodItemDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodItemDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodItemDropdownActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> beverageItemDropdown;
    private javax.swing.JComboBox<String> foodItemDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
