package com.mycompany.practica1;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import logic.circle;
import logic.line;
import logic.polygon;
import logic.rectangle;
import logic.square;

public class shapes extends javax.swing.JFrame {

    private int iteration = 0;
    public static LinkedList<circle> circleShapes = new LinkedList<circle>();
    public static LinkedList<square> squareShapes = new LinkedList<square>();
    public static LinkedList<rectangle> rectangleShapes = new LinkedList<rectangle>();
    public static LinkedList<line> lineShapes = new LinkedList<line>();
    public static LinkedList<polygon> polygonShapes = new LinkedList<polygon>();

    /**
     * Creates new form shapes
     */
    public shapes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ejecución");
    }

    @Override
    public void paint(Graphics g) {
        iteration = iteration + 1;

        if (iteration == 1) {

            if (circleShapes.size() > 0) {
                for (int i = 0; i < circleShapes.size(); i++) {

                    switch (circleShapes.get(i).getColor()) {
                        case "azul":
                            g.setColor(Color.BLUE);
                            break;
                        case "rojo":
                            g.setColor(Color.RED);
                            break;
                        case "amarillo":
                            g.setColor(Color.YELLOW);
                            break;
                        case "verde":
                            g.setColor(Color.GREEN);
                            break;
                        case "negro":
                            g.setColor(Color.BLACK);
                            break;
                        case "anaranjado":
                            g.setColor(Color.ORANGE);
                            break;
                        case "morado":
                            g.setColor(new Color(128, 0, 128));
                            break;
                        case "marron":
                            g.setColor(new Color(139, 69, 19));
                            break;
                        case "rosado":
                            g.setColor(Color.PINK);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    g.fillOval((int) circleShapes.get(i).getPosx(), (int) circleShapes.get(i).getPosy(),
                            (int) circleShapes.get(i).getRadius(), (int) circleShapes.get(i).getRadius());

                    g.setColor(Color.BLACK);
                    g.drawString(circleShapes.get(i).getName(), (int) circleShapes.get(i).getPosx(),
                            (int) circleShapes.get(i).getPosy());
                }
            }

            if (squareShapes.size() > 0) {
                for (int i = 0; i < squareShapes.size(); i++) {

                    switch (squareShapes.get(i).getColor()) {
                        case "azul":
                            g.setColor(Color.BLUE);
                            break;
                        case "rojo":
                            g.setColor(Color.RED);
                            break;
                        case "amarillo":
                            g.setColor(Color.YELLOW);
                            break;
                        case "verde":
                            g.setColor(Color.GREEN);
                            break;
                        case "negro":
                            g.setColor(Color.BLACK);
                            break;
                        case "anaranjado":
                            g.setColor(Color.ORANGE);
                            break;
                        case "morado":
                            g.setColor(new Color(128, 0, 128));
                            break;
                        case "marron":
                            g.setColor(new Color(139, 69, 19));
                            break;
                        case "rosado":
                            g.setColor(Color.PINK);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    g.fillRect((int) squareShapes.get(i).getPosx(), (int) squareShapes.get(i).getPosy(),
                            (int) squareShapes.get(i).getLenght(), (int) squareShapes.get(i).getLenght());

                    g.setColor(Color.BLACK);
                    g.drawString(squareShapes.get(i).getName(), (int) squareShapes.get(i).getPosx(),
                            (int) squareShapes.get(i).getPosy());
                }

            }

            if (rectangleShapes.size() > 0) {
                for (int i = 0; i < rectangleShapes.size(); i++) {

                    switch (rectangleShapes.get(i).getColor()) {
                        case "azul":
                            g.setColor(Color.BLUE);
                            break;
                        case "rojo":
                            g.setColor(Color.RED);
                            break;
                        case "amarillo":
                            g.setColor(Color.YELLOW);
                            break;
                        case "verde":
                            g.setColor(Color.GREEN);
                            break;
                        case "negro":
                            g.setColor(Color.BLACK);
                            break;
                        case "anaranjado":
                            g.setColor(Color.ORANGE);
                            break;
                        case "morado":
                            g.setColor(new Color(128, 0, 128));
                            break;
                        case "marron":
                            g.setColor(new Color(139, 69, 19));
                            break;
                        case "rosado":
                            g.setColor(Color.PINK);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    g.fillRect((int) rectangleShapes.get(i).getPosx(), (int) rectangleShapes.get(i).getPosx(),
                            (int) rectangleShapes.get(i).getWidth(), (int) rectangleShapes.get(i).getHeight());

                    g.setColor(Color.BLACK);
                    g.drawString(rectangleShapes.get(i).getName(), (int) rectangleShapes.get(i).getPosx(),
                            (int) rectangleShapes.get(i).getPosy());
                }
            }

            if (lineShapes.size() > 0) {
                for (int i = 0; i < lineShapes.size(); i++) {

                    switch (lineShapes.get(i).getColor()) {
                        case "azul":
                            g.setColor(Color.BLUE);
                            break;
                        case "rojo":
                            g.setColor(Color.RED);
                            break;
                        case "amarillo":
                            g.setColor(Color.YELLOW);
                            break;
                        case "verde":
                            g.setColor(Color.GREEN);
                            break;
                        case "negro":
                            g.setColor(Color.BLACK);
                            break;
                        case "anaranjado":
                            g.setColor(Color.ORANGE);
                            break;
                        case "morado":
                            g.setColor(new Color(128, 0, 128));
                            break;
                        case "marron":
                            g.setColor(new Color(139, 69, 19));
                            break;
                        case "rosado":
                            g.setColor(Color.PINK);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    g.drawLine((int) lineShapes.get(i).getPosx(), (int) lineShapes.get(i).getPosy(),
                            (int) lineShapes.get(i).getPosxfinal(), (int) lineShapes.get(i).getPosyfinal());

                    g.setColor(Color.BLACK);
                    g.drawString(lineShapes.get(i).getName(), (int) lineShapes.get(i).getPosx(),
                            (int) lineShapes.get(i).getPosy());
                }
            }

            if (polygonShapes.size() > 0) {
                for (int i = 0; i < polygonShapes.size(); i++) {

                    switch (polygonShapes.get(i).getColor()) {
                        case "azul":
                            g.setColor(Color.BLUE);
                            break;
                        case "rojo":
                            g.setColor(Color.RED);
                            break;
                        case "amarillo":
                            g.setColor(Color.YELLOW);
                            break;
                        case "verde":
                            g.setColor(Color.GREEN);
                            break;
                        case "negro":
                            g.setColor(Color.BLACK);
                            break;
                        case "anaranjado":
                            g.setColor(Color.ORANGE);
                            break;
                        case "morado":
                            g.setColor(new Color(128, 0, 128));
                            break;
                        case "marron":
                            g.setColor(new Color(139, 69, 19));
                            break;
                        case "rosado":
                            g.setColor(Color.PINK);
                            break;
                        default:
                            throw new AssertionError();
                    }

                    int posx = (int) polygonShapes.get(i).getPosx();
                    int posy = (int) polygonShapes.get(i).getPosy();
                    int sides = (int) polygonShapes.get(i).getSides();
                    int width = (int) polygonShapes.get(i).getWidth();
                    int height = (int) polygonShapes.get(i).getHeight();

                    int[] pointsx = new int[sides];
                    int[] pointsy = new int[sides];

                    for (int j = 0; j < sides; j++) {
                        pointsx[j] = posx + (int) ((width / 2.0) * Math.cos(2 * Math.PI * j / sides));
                        pointsy[j] = posy + (int) ((height / 2.0) * Math.sin(2 * Math.PI * j / sides));
                    }

                    g.fillPolygon(pointsx, pointsy, sides);

                    g.setColor(Color.BLACK);
                    g.drawString(polygonShapes.get(i).getName(), (int) polygonShapes.get(i).getPosx(),
                            (int) polygonShapes.get(i).getPosy());
                }
            }
        }

    }

    public void cleanLists() {
        circleShapes.clear();
        rectangleShapes.clear();
        lineShapes.clear();
        squareShapes.clear();
        polygonShapes.clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton1.setText("Terminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(662, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cleanLists();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shapes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
