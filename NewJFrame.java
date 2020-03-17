/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alex
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldGetName = new javax.swing.JTextField();
        jButtonSaleFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LabelOutPutFileName = new javax.swing.JLabel();
        jTextFieldOutPutName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldGetName.setToolTipText("");
        jTextFieldGetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGetNameActionPerformed(evt);
            }
        });

        jButtonSaleFile.setText("Отправить");
        jButtonSaleFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaleFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Поле ввода");

        LabelOutPutFileName.setText("Имя файла");

        jTextFieldOutPutName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOutPutNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(LabelOutPutFileName))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGetName, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jTextFieldOutPutName))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSaleFile)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelOutPutFileName)
                    .addComponent(jTextFieldOutPutName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSaleFile)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaleFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaleFileActionPerformed
        // TODO add your handling code here:\
        String fileName = jTextFieldOutPutName.getText();//Имя файла для сохранения
        if(fileName.isEmpty()){//Проверяем на пустую строку
            System.err.println("Не задано имя файла");
            return;//Завершаем функцию
        }
        
        String textData = jTextFieldGetName.getText();  
        if(textData.isEmpty()){//Проверяем на пустую строку
            System.err.println("Данные для сохранения не заданы");
            return;//Завершаем функцию
        }
        
        File file   = new File(fileName);
        //Создаём файл
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            //Записать содержимое в фаил
            writer.write(textData);
            writer.flush();//Выполнить запись
            writer.close();//Закрытие файла
        } catch(IOException error){
            System.err.print("Ошибка");
        }
    }//GEN-LAST:event_jButtonSaleFileActionPerformed

    private void jTextFieldGetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGetNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldGetNameActionPerformed

    private void jTextFieldOutPutNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOutPutNameActionPerformed
        // TODO add your handling code here:ъ
        
    }//GEN-LAST:event_jTextFieldOutPutNameActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelOutPutFileName;
    private javax.swing.JButton jButtonSaleFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldGetName;
    private javax.swing.JTextField jTextFieldOutPutName;
    // End of variables declaration//GEN-END:variables
}
