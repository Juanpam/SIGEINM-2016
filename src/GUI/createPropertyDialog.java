/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DBconnect.DBconnect;
import SIGEINMLogic.property;
import SIGEINMLogic.user;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Minos
 */
public class createPropertyDialog extends javax.swing.JDialog {

    /**
     * Creates new form createUserDialog
     */
    public createPropertyDialog(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SIGEINM: CREAR PROPIEDAD");
        Image imagen = Toolkit.getDefaultToolkit().getImage("src/GUI/Icon.png");
        this.setIconImage(imagen);
        this.setVisible(true);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        ownerText = new javax.swing.JTextField();
        areaText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        floorNumberText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Dirección");

        jLabel2.setText("Dueño");

        jLabel3.setText("Área (m²)");

        jLabel4.setText("Precio");

        jLabel5.setText("Cant. de pisos");

        addressText.setColumns(10);

        ownerText.setColumns(10);

        areaText.setColumns(10);

        priceText.setColumns(10);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("CREAR PROPIEDAD");

        createButton.setText("Crear");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        floorNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorNumberTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressText, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(ownerText)
                    .addComponent(areaText)
                    .addComponent(priceText)
                    .addComponent(cancelButton)
                    .addComponent(floorNumberText))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ownerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(floorNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(cancelButton))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        // Input check and creation action
        if(addressText.getText().isEmpty() || areaText.getText().isEmpty()
                || floorNumberText.getText().isEmpty() || ownerText.getText().isEmpty()
                || priceText.getText().isEmpty()){ //If any of the fields is empty
            JOptionPane.showMessageDialog((Frame) this.getParent(), "Complete todos los campos para continuar","",JOptionPane.WARNING_MESSAGE);  
        }
        else if(Integer.parseInt(priceText.getText())<=0) { //If the price has an invalid value
            JOptionPane.showMessageDialog((Frame) this.getParent(), "El precio no puede ser nulo o negativo","",JOptionPane.WARNING_MESSAGE);  
        }
        else{//Insert the property item on the DB
            String address = addressText.getText();
            Integer area = Integer.parseInt(areaText.getText());
            Integer floorsNumber = Integer.parseInt(floorNumberText.getText());
            String owner = ownerText.getText();
            Integer price = Integer.parseInt(priceText.getText());
            DBconnect connect = new DBconnect();
            if(!connect.verifyProperty(address)){//If a property with the same address did'nt exist
                property propiedad = new property(address, owner, area, price, floorsNumber);
                connect.createProperty(propiedad);
                JOptionPane.showMessageDialog((Frame) this.getParent(), "Propiedad con código "+propiedad.getCode()+" creado satisfactoriamente","",JOptionPane.WARNING_MESSAGE);  
                addressText.setText("");
                areaText.setText("");
                floorNumberText.setText("");
                ownerText.setText("");
                priceText.setText("");
            }
        }
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void floorNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorNumberTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createPropertyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createPropertyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createPropertyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createPropertyDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createPropertyDialog dialog = new createPropertyDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField areaText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField floorNumberText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField ownerText;
    private javax.swing.JTextField priceText;
    // End of variables declaration//GEN-END:variables
}
