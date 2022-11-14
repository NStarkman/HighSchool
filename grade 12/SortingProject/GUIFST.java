/*Author: Nathan Starkman
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comscifst;

import java.awt.Desktop;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nathan
 */
public class GUIFST extends javax.swing.JFrame {
boolean analyzeCheck = true; 
File file;

String fileName;
    /**
     * Creates new form ContactEditor
     */
    public GUIFST() {
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

        jLabel2 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PathPanel = new javax.swing.JPanel();
        PathPanel.setVisible(false);
        SortFilePanel1 = new javax.swing.JPanel();
        SortFilePanel1.setVisible(false);
        SortStyleChoose = new javax.swing.JPanel();
        SortStyleChoose.setVisible(false);
        SortFinalPanel = new javax.swing.JPanel();
        SortFinalPanel.setVisible(false);
        try {
            AnalyzePanel =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "comscifst.GUIFST_AnalyzePanel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        AnalyzePanel.setVisible(false);
        AnaLabel = new javax.swing.JLabel();
        TarasLabel = new javax.swing.JLabel();
        SortFinalLabel = new javax.swing.JLabel();
        DownloadButton = new javax.swing.JButton();
        TimeLabel = new javax.swing.JLabel();
        TimeLabel.setVisible(false);
        SortChooseLabel = new javax.swing.JLabel();
        QuickSortButton = new javax.swing.JButton();
        LinearInsertionButton = new javax.swing.JButton();
        ShellSortButton = new javax.swing.JButton();
        fileUserLabel = new javax.swing.JLabel();
        MenuLabel = new javax.swing.JLabel();
        AnalyzeButton = new javax.swing.JButton();
        SortButton = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();
        StartLabel = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Would you like to input a data set or a list?");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FST");
        setBackground(new java.awt.Color(43, 45, 47));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(java.awt.Color.darkGray);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(43, 45, 47));
        jPanel1.setLayout(null);

        PathPanel.setBackground(new java.awt.Color(43, 45, 47));
        PathPanel.setLayout(null);

        SortFilePanel1.setBackground(new java.awt.Color(43, 45, 47));
        SortFilePanel1.setLayout(null);

        SortStyleChoose.setBackground(new java.awt.Color(43, 45, 47));
        SortStyleChoose.setLayout(null);

        SortFinalPanel.setBackground(new java.awt.Color(43, 45, 47));
        SortFinalPanel.setLayout(null);

        AnalyzePanel.setLayout(null);

        AnaLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AnaLabel.setForeground(new java.awt.Color(255, 255, 255));
        AnaLabel.setText("The most efficient form of sorting for this array would be...");
        AnalyzePanel.add(AnaLabel);
        AnaLabel.setBounds(100, 10, 624, 32);

        TarasLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TarasLabel.setForeground(new java.awt.Color(255, 255, 255));
        TarasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AnalyzePanel.add(TarasLabel);
        TarasLabel.setBounds(270, 220, 230, 50);

        SortFinalPanel.add(AnalyzePanel);
        AnalyzePanel.setBounds(0, 0, 800, 600);
        SortFilePanel1.add(AnalyzePanel);

        SortFinalLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        SortFinalLabel.setForeground(new java.awt.Color(255, 255, 255));
        SortFinalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SortFinalLabel.setText("Using Linear Insertion, the code is now sorted!");
        SortFinalPanel.add(SortFinalLabel);
        SortFinalLabel.setBounds(30, 10, 734, 48);

        DownloadButton.setBackground(new java.awt.Color(0, 0, 0));
        DownloadButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DownloadButton.setForeground(new java.awt.Color(255, 255, 255));
        DownloadButton.setText("Press here to see the sorted file!");
        DownloadButton.setBorder(null);
        DownloadButton.setBorderPainted(false);
        DownloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadButtonActionPerformed(evt);
            }
        });
        SortFinalPanel.add(DownloadButton);
        DownloadButton.setBounds(220, 460, 360, 120);

        TimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setText("It took BLANK miliseconds to sort!");
        SortFinalPanel.add(TimeLabel);
        TimeLabel.setBounds(20, 200, 760, 90);

        SortStyleChoose.add(SortFinalPanel);
        SortFinalPanel.setBounds(0, 0, 800, 600);

        SortChooseLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        SortChooseLabel.setForeground(new java.awt.Color(255, 255, 255));
        SortChooseLabel.setText("Which type of sorting would you like?");
        SortStyleChoose.add(SortChooseLabel);
        SortChooseLabel.setBounds(110, 10, 598, 48);

        QuickSortButton.setBackground(new java.awt.Color(0, 0, 0));
        QuickSortButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuickSortButton.setForeground(new java.awt.Color(255, 255, 255));
        QuickSortButton.setText("QuickSort");
        QuickSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuickSortButtonActionPerformed(evt);
            }
        });
        SortStyleChoose.add(QuickSortButton);
        QuickSortButton.setBounds(310, 460, 190, 60);

        LinearInsertionButton.setBackground(new java.awt.Color(0, 0, 0));
        LinearInsertionButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LinearInsertionButton.setForeground(new java.awt.Color(255, 255, 255));
        LinearInsertionButton.setText("Linear Insertion");
        LinearInsertionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinearInsertionButtonActionPerformed(evt);
            }
        });
        SortStyleChoose.add(LinearInsertionButton);
        LinearInsertionButton.setBounds(310, 170, 190, 60);

        ShellSortButton.setBackground(new java.awt.Color(0, 0, 0));
        ShellSortButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShellSortButton.setForeground(new java.awt.Color(255, 255, 255));
        ShellSortButton.setText("ShellSort");
        ShellSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShellSortButtonActionPerformed(evt);
            }
        });
        SortStyleChoose.add(ShellSortButton);
        ShellSortButton.setBounds(310, 320, 190, 60);

        SortFilePanel1.add(SortStyleChoose);
        SortStyleChoose.setBounds(0, 0, 800, 600);

        fileUserLabel.setBackground(new java.awt.Color(43, 45, 47));
        fileUserLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fileUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        fileUserLabel.setText("What file would you like to use?");
        SortFilePanel1.add(fileUserLabel);
        fileUserLabel.setBounds(140, 5, 505, 48);

        PathPanel.add(SortFilePanel1);
        SortFilePanel1.setBounds(0, 0, 800, 600);

        MenuLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        MenuLabel.setForeground(new java.awt.Color(255, 255, 255));
        MenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLabel.setText("What would you like to do?");
        PathPanel.add(MenuLabel);
        MenuLabel.setBounds(170, 20, 460, 100);

        AnalyzeButton.setBackground(new java.awt.Color(0, 0, 0));
        AnalyzeButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AnalyzeButton.setForeground(new java.awt.Color(255, 255, 255));
        AnalyzeButton.setText("Analyze");
        AnalyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeButtonActionPerformed(evt);
            }
        });
        PathPanel.add(AnalyzeButton);
        AnalyzeButton.setBounds(280, 390, 240, 60);

        SortButton.setBackground(new java.awt.Color(0, 0, 0));
        SortButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SortButton.setForeground(new java.awt.Color(255, 255, 255));
        SortButton.setText("Sort");
        SortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButtonActionPerformed(evt);
            }
        });
        PathPanel.add(SortButton);
        SortButton.setBounds(280, 240, 240, 60);

        jPanel1.add(PathPanel);
        PathPanel.setBounds(0, 0, 800, 600);

        StartButton.setBackground(new java.awt.Color(0, 0, 0));
        StartButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StartButton.setForeground(new java.awt.Color(255, 255, 255));
        StartButton.setText("Press to Begin!");
        StartButton.setBorderPainted(false);
        StartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton);
        StartButton.setBounds(540, 230, 230, 100);

        StartLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        StartLabel.setForeground(new java.awt.Color(255, 255, 255));
        StartLabel.setText("Welcome to the Com Sci FST ");
        jPanel1.add(StartLabel);
        StartLabel.setBounds(10, 260, 370, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
     protected void saveToFile()  {
    JFileChooser jFileChooser1 = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("txt Files", "txt", "text");
    jFileChooser1.setFileFilter(filter);
    int retval = jFileChooser1.showSaveDialog(null);
    if (retval == JFileChooser.APPROVE_OPTION) {
        this.file = jFileChooser1.getSelectedFile();
        this.fileName = this.file.getName();
    }else{
         fileUserLabel.setText("No File Selected. Please Try again");
         AnalyzePanel.setVisible(false);
         SortStyleChoose.setVisible(false);
    }
    }
    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here: 
        StartButton.setVisible(false);
        
    
        PathPanel.setVisible(true);
    }//GEN-LAST:event_StartButtonActionPerformed

    private void AnalyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeButtonActionPerformed
        // TODO add your handling code here:
        AnalyzeButton.setVisible(false);
        SortButton.setVisible(false);
        SortFilePanel1.setVisible(true);
        saveToFile();
        AnalyzePanel.setVisible(true);
        TarasLabel.setText("PLACEHOLDER TEXT");
    }//GEN-LAST:event_AnalyzeButtonActionPerformed

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        // TODO add your handling code here:
        AnalyzeButton.setVisible(false);
        SortButton.setVisible(false);
        SortFilePanel1.setVisible(true);
        saveToFile();
        SortStyleChoose.setVisible(true);
    }//GEN-LAST:event_SortButtonActionPerformed

    private void ShellSortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShellSortButtonActionPerformed
        // TODO add your handling code here:
        ShellSortButton.setVisible(false);
        LinearInsertionButton.setVisible(false);
        QuickSortButton.setVisible(false);
        SortFinalPanel.setVisible(true);
    try {
        ShellSort.sort(Utility.getData(file.getName()));
    } catch (Exception ex) {
        Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
    }
        SortFinalLabel.setText("Using Shell Sort, the code is now sorted!");
    try {
        Utility.sortedFile(ShellSort.sort(Utility.getData(file.getName())));
    } catch (Exception ex) {
        Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
    }
    TimeLabel.setVisible(true);
    TimeLabel.setText("It took "+ShellSort.getComputeTime()+" miliseconds to sort!");    
    }//GEN-LAST:event_ShellSortButtonActionPerformed

    private void LinearInsertionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinearInsertionButtonActionPerformed
        // TODO add your handling code here:
        ShellSortButton.setVisible(false);
        LinearInsertionButton.setVisible(false);
        QuickSortButton.setVisible(false);
        SortFinalPanel.setVisible(true);
        try{
            LinearInsertion.sort(Utility.getData(file.getName()));
        }catch(Exception ex){
            Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
        }
        SortFinalLabel.setText("Using Linear Insertion, the code is now sorted!");
        
        try {
            Utility.sortedFile(LinearInsertion.sort(Utility.getData(file.getName())));
        } catch (Exception ex) {
            Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
    }
    TimeLabel.setVisible(true);
    TimeLabel.setText("It took "+LinearInsertion.getComputeTime()+" miliseconds to sort!");

    }//GEN-LAST:event_LinearInsertionButtonActionPerformed

    private void QuickSortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuickSortButtonActionPerformed
        // TODO add your handling code here:
         ShellSortButton.setVisible(false);
        LinearInsertionButton.setVisible(false);
        QuickSortButton.setVisible(false);
        SortFinalPanel.setVisible(true);
        //Or's code
        try{
            QuickSort.sort(Utility.getData(file.getName()));
        }catch(Exception ex){
            Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
        }
        SortFinalLabel.setText("Using Quick Sort, the code is now sorted!");
        try {
            Utility.sortedFile(QuickSort.sort(Utility.getData(file.getName())));
        } catch (Exception ex) {
            Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
        }
        TimeLabel.setVisible(true);
        TimeLabel.setText("It took "+QuickSort.getComputeTime()+" miliseconds to sort!");

    }//GEN-LAST:event_QuickSortButtonActionPerformed

    private void DownloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadButtonActionPerformed
    try {
        Desktop.getDesktop().open(Utility.sortedFile);
    } catch (IOException ex) {
        Logger.getLogger(GUIFST.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_DownloadButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIFST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnaLabel;
    private javax.swing.JButton AnalyzeButton;
    private javax.swing.JPanel AnalyzePanel;
    private javax.swing.JButton DownloadButton;
    private javax.swing.JButton LinearInsertionButton;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JPanel PathPanel;
    private javax.swing.JButton QuickSortButton;
    private javax.swing.JButton ShellSortButton;
    private javax.swing.JButton SortButton;
    private javax.swing.JLabel SortChooseLabel;
    private javax.swing.JPanel SortFilePanel1;
    private javax.swing.JLabel SortFinalLabel;
    private javax.swing.JPanel SortFinalPanel;
    private javax.swing.JPanel SortStyleChoose;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel StartLabel;
    private javax.swing.JLabel TarasLabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fileUserLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}