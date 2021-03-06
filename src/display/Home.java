/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import graph.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    //private DiGraph digraph;
    private DiGraph<String> digraph;
    
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Home(DiGraph digraph) {
        initComponents();
        setLocationRelativeTo(null);
        this.digraph=digraph;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayArea = new javax.swing.JTextArea();
        readGraphButton = new javax.swing.JButton();
        deleteGraphButton = new javax.swing.JButton();
        addVertexButton = new javax.swing.JButton();
        showGraphButton = new javax.swing.JButton();
        setWeightButton = new javax.swing.JButton();
        addEdgeButton = new javax.swing.JButton();
        isEmptyButon = new javax.swing.JButton();
        containsVertexButton = new javax.swing.JButton();
        getWeightButton = new javax.swing.JButton();
        getNeighborButton = new javax.swing.JButton();
        totalVerticesButton = new javax.swing.JButton();
        vertexIndegreeButton = new javax.swing.JButton();
        totalEdgesButton = new javax.swing.JButton();
        vertexOutdegreeButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DisplayArea.setEditable(false);
        DisplayArea.setColumns(20);
        DisplayArea.setRows(5);
        jScrollPane1.setViewportView(DisplayArea);

        readGraphButton.setText("Read Graph");
        readGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readGraphButtonActionPerformed(evt);
            }
        });

        deleteGraphButton.setText("Delete Graph");
        deleteGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGraphButtonActionPerformed(evt);
            }
        });

        addVertexButton.setText("Add Vertex");
        addVertexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVertexButtonActionPerformed(evt);
            }
        });

        showGraphButton.setText("Show Graph");
        showGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGraphButtonActionPerformed(evt);
            }
        });

        setWeightButton.setText("Set Weight");
        setWeightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setWeightButtonActionPerformed(evt);
            }
        });

        addEdgeButton.setText("Add Edge");
        addEdgeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEdgeButtonActionPerformed(evt);
            }
        });

        isEmptyButon.setText("Is Empty");
        isEmptyButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isEmptyButonActionPerformed(evt);
            }
        });

        containsVertexButton.setText("ContainsVertex");
        containsVertexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                containsVertexButtonActionPerformed(evt);
            }
        });

        getWeightButton.setText("Get Weight");
        getWeightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getWeightButtonActionPerformed(evt);
            }
        });

        getNeighborButton.setText("Get Neighbor");
        getNeighborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNeighborButtonActionPerformed(evt);
            }
        });

        totalVerticesButton.setText("Total Vertices");
        totalVerticesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalVerticesButtonActionPerformed(evt);
            }
        });

        vertexIndegreeButton.setText("inDegree");
        vertexIndegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexIndegreeButtonActionPerformed(evt);
            }
        });

        totalEdgesButton.setText("Total Edges");
        totalEdgesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalEdgesButtonActionPerformed(evt);
            }
        });

        vertexOutdegreeButton.setText("outDegree");
        vertexOutdegreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexOutdegreeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalVerticesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isEmptyButon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(containsVertexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getNeighborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalEdgesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vertexIndegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addVertexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addEdgeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setWeightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getWeightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vertexOutdegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(readGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(showGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(readGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVertexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEdgeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setWeightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isEmptyButon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containsVertexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getNeighborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getWeightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalVerticesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vertexIndegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vertexOutdegreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalEdgesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readGraphButtonActionPerformed
        try {
            JFileChooser fc = new JFileChooser("C:\\Users\\ASUS\\Desktop\\teste");
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
            fc.addChoosableFileFilter(restrict);
            
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
  
            { 
                // set the label to the path of the selected file 
                digraph = DiGraph.readGraph(fc.getSelectedFile().getAbsolutePath());
            } 
            //DisplayArea.setText(fc.getSelectedFile().getAbsolutePath()); 
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_readGraphButtonActionPerformed

    private void deleteGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGraphButtonActionPerformed
        this.digraph.clear();
    }//GEN-LAST:event_deleteGraphButtonActionPerformed

    private void addVertexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVertexButtonActionPerformed
        JTextField addVertex = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("vertex:"));
        myPanel.add(addVertex);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertex Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if(digraph.addVertex(addVertex.getText()))
            JOptionPane.showMessageDialog(null, "Vertex "+ addVertex.getText() + 
                    " succesfully added!");
            else
                JOptionPane.showMessageDialog(null, "Failed to add vertex "+ 
                        addVertex.getText(),"Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addVertexButtonActionPerformed

    private void showGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGraphButtonActionPerformed
        DisplayArea.setText(digraph.toString());
    }//GEN-LAST:event_showGraphButtonActionPerformed

    private void setWeightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setWeightButtonActionPerformed
        JTextField sourceVertex = new JTextField(5);
        JTextField destVertex = new JTextField(5);
        JTextField weight = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("source:"));
        myPanel.add(sourceVertex);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("destination:"));
        myPanel.add(destVertex);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("weight:"));
        myPanel.add(weight);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertice Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            digraph.setWeight(sourceVertex.getText(), destVertex.getText(), 
                    Integer.parseInt(weight.getText()));
            JOptionPane.showMessageDialog(null, "Weight from vertex "+sourceVertex.getText()+
                    " to vertex "+destVertex.getText()+" is set to "+ weight.getText());
        }
    }//GEN-LAST:event_setWeightButtonActionPerformed

    private void addEdgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEdgeButtonActionPerformed
        JTextField sourceVertex = new JTextField(5);
        JTextField destVertex = new JTextField(5);
        JTextField weight = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("source:"));
        myPanel.add(sourceVertex);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("destination:"));
        myPanel.add(destVertex);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("weight:"));
        myPanel.add(weight);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertice Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            digraph.addEdge(sourceVertex.getText(), destVertex.getText(), 
                    Integer.parseInt(weight.getText()));
            JOptionPane.showMessageDialog(null, "Edge from vertex "+sourceVertex.getText()+
                    " to vertex "+destVertex.getText()+" with weight "+ weight.getText() +
                    " Succesfully added!");
        }
    }//GEN-LAST:event_addEdgeButtonActionPerformed

    private void isEmptyButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isEmptyButonActionPerformed
        if(digraph.isEmpty())
            JOptionPane.showMessageDialog(null, "Graph is Empty");
            //DisplayArea.setText("Graph is Empty");
        else
            JOptionPane.showMessageDialog(null, "Graph is not Empty");
            //DisplayArea.setText("Graph is not Empty");
    }//GEN-LAST:event_isEmptyButonActionPerformed

    private void containsVertexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_containsVertexButtonActionPerformed
        JTextField containVertex = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("vertex:"));
        myPanel.add(containVertex);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertex Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if(digraph.containsVertex(containVertex.getText()))
            JOptionPane.showMessageDialog(null, "Vertex "+ containVertex.getText() + 
                    " is in graph.");
            else
                JOptionPane.showMessageDialog(null, "No vertex "+ 
                        containVertex.getText() +" in graph!","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_containsVertexButtonActionPerformed

    private void getWeightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getWeightButtonActionPerformed
        JTextField sourceVertex = new JTextField(5);
        JTextField destVertex = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("source:"));
        myPanel.add(sourceVertex);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("destination:"));
        myPanel.add(destVertex);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertice Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Weight from vertex "+ sourceVertex.getText() +
                    " to " + destVertex.getText() +" is "+ digraph.getWeight(sourceVertex.getText(), destVertex.getText()));
        }
    }//GEN-LAST:event_getWeightButtonActionPerformed

    private void getNeighborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNeighborButtonActionPerformed
        JTextField vertexNeighbor = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("vertex:"));
        myPanel.add(vertexNeighbor);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertex Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Neighbor of Vertex "+vertexNeighbor.getText()
                    +" is "+digraph.getNeighbors(vertexNeighbor.getText()));
        }
    }//GEN-LAST:event_getNeighborButtonActionPerformed

    private void totalVerticesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalVerticesButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Number of Vertices is " + digraph.numberOfVertices());
        //DisplayArea.setText("Number of Vertices is " + digraph.numberOfVertices());
    }//GEN-LAST:event_totalVerticesButtonActionPerformed

    private void vertexIndegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertexIndegreeButtonActionPerformed
        JTextField inDegree = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("vertex:"));
        myPanel.add(inDegree);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertex Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Vertex "+ inDegree.getText() +
                    " have "+digraph.inDegree(inDegree.getText()) +" inDegree");
        }
    }//GEN-LAST:event_vertexIndegreeButtonActionPerformed

    private void totalEdgesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalEdgesButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Number of Edges is " + digraph.numberOfEdges());
        //DisplayArea.setText("Number of Edges is " + digraph.numberOfEdges());
    }//GEN-LAST:event_totalEdgesButtonActionPerformed

    private void vertexOutdegreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertexOutdegreeButtonActionPerformed
        JTextField outDegree = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("vertex:"));
        myPanel.add(outDegree);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
            "Please Enter Vertex Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Vertex "+ outDegree.getText() +
                    " have "+digraph.outDegree(outDegree.getText()) +" outDegree");
        }
    }//GEN-LAST:event_vertexOutdegreeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DisplayArea;
    private javax.swing.JButton addEdgeButton;
    private javax.swing.JButton addVertexButton;
    private javax.swing.JButton containsVertexButton;
    private javax.swing.JButton deleteGraphButton;
    private javax.swing.JButton getNeighborButton;
    private javax.swing.JButton getWeightButton;
    private javax.swing.JButton isEmptyButon;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton readGraphButton;
    private javax.swing.JButton setWeightButton;
    private javax.swing.JButton showGraphButton;
    private javax.swing.JButton totalEdgesButton;
    private javax.swing.JButton totalVerticesButton;
    private javax.swing.JButton vertexIndegreeButton;
    private javax.swing.JButton vertexOutdegreeButton;
    // End of variables declaration//GEN-END:variables
}
