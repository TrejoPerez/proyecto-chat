/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.chat;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author root
 */
public class InterfazMensaje extends javax.swing.JFrame {
    static Integer  cuenta=0;
    /**
     * Creates new form NewJFrame
     */
    
    public InterfazMensaje() {
        initComponents();
        persistenciaLibro pes = new persistenciaLibro();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String p="";
                int i=0;
                while(i<=persistenciaLibro.leerLibro().size()){
                    if(i==persistenciaLibro.leerLibro().size()){
                        TextAreaEnvariMensaje.setText(p);
                        TextAreaLeerLibro.setText(p);   
                    }else if(i<=persistenciaLibro.leerLibro().size()){
                        p = p+persistenciaLibro.leerLibro().get(i).getMensaje()+"\n";    
                        System.out.println(p);
                        
                        
                    }
                    System.out.println("El valor de i es " + i); 
                     i+=1;
                }
            }
        });
        t1.start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelRespuesta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaLeerLibro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaEnvariMensaje = new javax.swing.JTextArea();
        btnEnviarMensaje = new javax.swing.JButton();
        labelEstadoMensaje = new javax.swing.JLabel();
        btnRespuestaMensaje = new javax.swing.JButton();
        LaberRespuestaMensaje = new javax.swing.JLabel();
        TextEnviarMensaje = new javax.swing.JTextField();
        TextResponderMensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextAreaLeerLibro.setColumns(20);
        TextAreaLeerLibro.setRows(5);
        jScrollPane1.setViewportView(TextAreaLeerLibro);

        TextAreaEnvariMensaje.setColumns(20);
        TextAreaEnvariMensaje.setRows(5);
        jScrollPane2.setViewportView(TextAreaEnvariMensaje);

        btnEnviarMensaje.setText("Enviar");
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        labelEstadoMensaje.setText("Sin estado");

        btnRespuestaMensaje.setText("Responder");
        btnRespuestaMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuestaMensajeActionPerformed(evt);
            }
        });

        LaberRespuestaMensaje.setText("Sin estado");

        javax.swing.GroupLayout LabelRespuestaLayout = new javax.swing.GroupLayout(LabelRespuesta);
        LabelRespuesta.setLayout(LabelRespuestaLayout);
        LabelRespuestaLayout.setHorizontalGroup(
            LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelRespuestaLayout.createSequentialGroup()
                .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LabelRespuestaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextEnviarMensaje)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(TextResponderMensaje)))
                    .addGroup(LabelRespuestaLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnEnviarMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRespuestaMensaje)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LabelRespuestaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelEstadoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(LaberRespuestaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        LabelRespuestaLayout.setVerticalGroup(
            LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelRespuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextEnviarMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(TextResponderMensaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarMensaje)
                    .addComponent(btnRespuestaMensaje))
                .addGap(34, 34, 34)
                .addGroup(LabelRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstadoMensaje)
                    .addComponent(LaberRespuestaMensaje))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        // TODO add your handling code here:
        enviarMensajes(TextEnviarMensaje.getText());
        labelEstadoMensaje.setText("Mensaje Enviado");
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnRespuestaMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuestaMensajeActionPerformed
        // TODO add your handling code here:
        //TextAreaLeerLibro.setText(persistenciaLibro.leerLibro().toString());
       enviarMensajes(TextResponderMensaje.getText());
       LaberRespuestaMensaje.setText("Haz respondido el mensaje");
        
    }//GEN-LAST:event_btnRespuestaMensajeActionPerformed
    public void enviarMensajes(String mensaje){
         libro librito = new libro();
        librito.setId(persistenciaLibro.generarId()+1);
        librito.setMensaje(mensaje);
        String p="";
        try {
            persistenciaLibro.guardarLibro(librito);
            for(int i=0;i<persistenciaLibro.leerLibro().size();i++){
                System.out.println("el id para" +persistenciaLibro.leerLibro().get(i).getMensaje() +" es " + i);
                p=p+persistenciaLibro.leerLibro().get(i).getMensaje()+"\n";
            }
            TextAreaLeerLibro.setText(p);
            
            TextAreaEnvariMensaje.setText(p);
            
        } catch (Exception ex) {
            System.out.println("Error al responder el mensaje" + ex.getMessage());
        }
    }
                
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
            java.util.logging.Logger.getLogger(InterfazMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabelRespuesta;
    private javax.swing.JLabel LaberRespuestaMensaje;
    private javax.swing.JTextArea TextAreaEnvariMensaje;
    private javax.swing.JTextArea TextAreaLeerLibro;
    private javax.swing.JTextField TextEnviarMensaje;
    private javax.swing.JTextField TextResponderMensaje;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnRespuestaMensaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelEstadoMensaje;
    // End of variables declaration//GEN-END:variables
}
