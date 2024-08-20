package com.mycompany.practica1;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import logic.TTokens;

public class reports extends javax.swing.JFrame {

    //Variables con los datos a manejar
    public static LinkedList<String> ColorsList = new LinkedList<String>();
    public static LinkedList<String> ObjectsList = new LinkedList<String>();
    public static LinkedList<String> AnimationsList = new LinkedList<String>();
    public static LinkedList<TTokens> TokensList = new LinkedList<TTokens>();

    public reports() {
        initComponents();
        this.setTitle("Reportes");
        printTables();
        this.setLocationRelativeTo(null);
    }

    //Atributo para limpiar todas las listas
    public void cleanLists() {
        ColorsList.clear();
        ObjectsList.clear();
        AnimationsList.clear();
        TokensList.clear();
    }

    //Atributos para generar y limpiar cada una de las tablas de reporte
    private void printTables() {
        printTokensTable();
        printColorsTable();
        printObjectsTable();
        printAnimationsTable();
    }

    private void cleanTables() {
        DefaultTableModel modelOne = (DefaultTableModel) operatorsTable.getModel();
        DefaultTableModel modelTwo = (DefaultTableModel) colorsTable.getModel();
        DefaultTableModel modelThree = (DefaultTableModel) objectsTable.getModel();
        DefaultTableModel modelFour = (DefaultTableModel) animationsTable.getModel();

        if (modelOne.getRowCount() > 0) {
            modelOne.getDataVector().removeAllElements();
        }

        if (modelTwo.getRowCount() > 0) {
            modelTwo.getDataVector().removeAllElements();
        }

        if (modelThree.getRowCount() > 0) {
            modelThree.getDataVector().removeAllElements();
        }

        if (modelFour.getRowCount() > 0) {
            modelFour.getDataVector().removeAllElements();
        }

    }

    private void printTokensTable() {
        DefaultTableModel model = (DefaultTableModel) operatorsTable.getModel();

        Object[] row;

        for (int i = 0; i < TokensList.size(); i++) {
            row = new Object[4];
            row[0] = TokensList.get(i).getOperator();
            row[1] = TokensList.get(i).getLine();
            row[2] = TokensList.get(i).getColumn();
            row[3] = TokensList.get(i).getOcurrency();

            model.addRow(row);
        }
    }

    private void printColorsTable() {
        int blue = 0;
        int red = 0;
        int yellow = 0;
        int green = 0;
        int black = 0;
        int orange = 0;
        int purple = 0;
        int brown = 0;
        int pink = 0;

        for (int i = 0; i < ColorsList.size(); i++) {
            switch (ColorsList.get(i)) {
                case "azul":
                    blue = blue + 1;
                    break;
                case "rojo":
                    red = red + 1;
                    break;
                case "amarillo":
                    yellow = yellow + 1;
                    break;
                case "verde":
                    green = green + 1;
                    break;
                case "negro":
                    black = black + 1;
                    break;
                case "anaranjado":
                    orange = orange + 1;
                    break;
                case "morado":
                    purple = purple + 1;
                    break;
                case "marron":
                    brown = brown + 1;
                    break;
                case "rosado":
                    pink = pink + 1;
                    break;
                default:
                    System.out.println("Error. Token incorrecto " + ColorsList.get(i));
                    throw new AssertionError();
            }
        }

        DefaultTableModel model = (DefaultTableModel) colorsTable.getModel();

        model.addRow(new Object[]{"Azul", blue});
        model.addRow(new Object[]{"Rojo", red});
        model.addRow(new Object[]{"Amarillo", yellow});
        model.addRow(new Object[]{"Verde", green});
        model.addRow(new Object[]{"Negro", black});
        model.addRow(new Object[]{"Anaranjado", orange});
        model.addRow(new Object[]{"Morado", purple});
        model.addRow(new Object[]{"Marron", brown});
        model.addRow(new Object[]{"Rosado", pink});
    }

    private void printObjectsTable() {
        int circle = 0;
        int square = 0;
        int rectangle = 0;
        int line = 0;
        int polygon = 0;

        for (int i = 0; i < ObjectsList.size(); i++) {
            switch (ObjectsList.get(i)) {
                case "circulo":
                    circle = circle + 1;
                    break;
                case "cuadrado":
                    square = square + 1;
                    break;
                case "rectangulo":
                    rectangle = rectangle + 1;
                    break;
                case "linea":
                    line = line + 1;
                    break;
                case "poligono":
                    polygon = polygon + 1;
                    break;
                default:
                    System.out.println("Error. Token incorrecto " + ObjectsList.get(i));
                    throw new AssertionError();
            }
        }

        DefaultTableModel model = (DefaultTableModel) objectsTable.getModel();

        model.addRow(new Object[]{"Circulo", circle});
        model.addRow(new Object[]{"Cuadrado", square});
        model.addRow(new Object[]{"Rectangulo", rectangle});
        model.addRow(new Object[]{"Linea", line});
        model.addRow(new Object[]{"Poligono", polygon});
    }

    private void printAnimationsTable() {
        int line = 0;
        int curve = 0;

        for (int i = 0; i < AnimationsList.size(); i++) {
            switch (AnimationsList.get(i)) {
                case "linea":
                    line = line + 1;
                    break;
                case "curva":
                    curve = curve + 1;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) animationsTable.getModel();
        
        model.addRow(new Object[]{"Línea", line});
        model.addRow(new Object[]{"Curva", curve});
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        operatorsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        colorsTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        objectsTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        animationsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setText("Reportes");

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel2.setText("Reporte de Ocurrencias de Operadores Aritméticos");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel3.setText("Reporte de Colores Usados");

        operatorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operador", "Línea", "Columna", "Ocurrencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        operatorsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(operatorsTable);
        if (operatorsTable.getColumnModel().getColumnCount() > 0) {
            operatorsTable.getColumnModel().getColumn(0).setResizable(false);
            operatorsTable.getColumnModel().getColumn(1).setResizable(false);
            operatorsTable.getColumnModel().getColumn(2).setResizable(false);
            operatorsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        colorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Cantidad de Uso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        colorsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(colorsTable);
        if (colorsTable.getColumnModel().getColumnCount() > 0) {
            colorsTable.getColumnModel().getColumn(0).setResizable(false);
            colorsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        objectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Objeto", "Cantidad de Uso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        objectsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(objectsTable);
        if (objectsTable.getColumnModel().getColumnCount() > 0) {
            objectsTable.getColumnModel().getColumn(0).setResizable(false);
            objectsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        animationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animación", "Cantidade Uso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        animationsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(animationsTable);
        if (animationsTable.getColumnModel().getColumnCount() > 0) {
            animationsTable.getColumnModel().getColumn(0).setResizable(false);
            animationsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel4.setText("Reporte de Objetos Usados");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel5.setText("Reporte de Animaciones Usadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(474, 474, 474)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane4))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        shapes shapesWindow = new shapes();
        shapesWindow.setVisible(true);
        shapesWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable animationsTable;
    private javax.swing.JTable colorsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable objectsTable;
    private javax.swing.JTable operatorsTable;
    // End of variables declaration//GEN-END:variables
}
