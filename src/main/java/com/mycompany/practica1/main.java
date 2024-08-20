package com.mycompany.practica1;

import analyzers.L_Analyzer;
import analyzers.S_Analyzer;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.BufferedReader;
import java.io.StringReader;
import javax.swing.JOptionPane;
import logic.lineNumber;

public class main extends javax.swing.JFrame {

    lineNumber lineNumb;
    errorReport EReport = new errorReport();
    reports TReports = new reports();

    public main() {
        initComponents();
        this.setTitle("Inicio");
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

        codeTextPane.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
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
            String data = codeTextPane.getText();
            L_Analyzer lexic = new L_Analyzer(new BufferedReader(new StringReader(data)));
            S_Analyzer sintactic = new S_Analyzer(lexic);

            try {
                sintactic.parse();
            } catch (Exception e) {
            }

            if (EReport.errorsLenght() == 0) {
                reports reportsWindow = new reports();
                reportsWindow.setVisible(true);
                reportsWindow.setLocationRelativeTo(null);
                TReports.cleanLists();
            } else {
                EReport.setVisible(true);
                EReport.setLocationRelativeTo(null);
                EReport.cleanTable();
                EReport.printTable();
                EReport.cleanList();
            }

        }
    }//GEN-LAST:event_compileButtonActionPerformed

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
