package com.mycompany.practica1;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.JOptionPane;
import logic.lineNumber;

public class main extends javax.swing.JFrame {

    lineNumber lineNumb;
    
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        lineNumb = new lineNumber(codeTextPane);
        codeScrollPane.setRowHeaderView(lineNumb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        compileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codeScrollPane = new javax.swing.JScrollPane();
        codeTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        compileButton.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        compileButton.setText("Compilar");
        compileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setText("Línea:");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setText("Columna:");

        codeTextPane.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                codeTextPaneCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        codeScrollPane.setViewportView(codeTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compileButton)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(compileButton)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(codeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileButtonActionPerformed
        // TODO add your handling code here:
        //Verificando si el textPane no viene vacío
        String code = codeTextPane.getText();
        int lenghtCode = code.length();
        
        if (lenghtCode <= 0) {            
            JOptionPane.showMessageDialog(this, "No hay ningún código escrito.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("El contenido no es nulo");
        }
    }//GEN-LAST:event_compileButtonActionPerformed

    private void codeTextPaneCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_codeTextPaneCaretPositionChanged
        // TODO add your handling code here:
        System.out.println("El cursor cambió");
    }//GEN-LAST:event_codeTextPaneCaretPositionChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane codeScrollPane;
    private javax.swing.JTextPane codeTextPane;
    private javax.swing.JButton compileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
