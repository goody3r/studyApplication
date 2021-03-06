package studyapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harjafff
 */
public class quizGUI extends javax.swing.JFrame {
private StartingMenu firstWindow;

int questionIndex = 0;
ArrayList<String> questions = new ArrayList();
ArrayList<String> mc1 = new ArrayList();
ArrayList<String> mc2 = new ArrayList();
ArrayList<String> mc3 = new ArrayList();
ArrayList<String> mc4 = new ArrayList();
ArrayList<Integer> correctIndex = new ArrayList();
    /**
     * Creates new form quizGUI
     */
    public quizGUI(StartingMenu m) {
        initComponents();
        firstWindow = m;
        File f = new File("src\\studyapplication\\questions.txt");
        try{
            Scanner s = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                questions.add(i, s.nextLine());
                mc1.add(i, s.nextLine());
                mc2.add(i, s.nextLine());
                mc3.add(i, s.nextLine());
                mc4.add(i, s.nextLine());
                correctIndex.add(i, Integer.parseInt(s.nextLine()));
            }
            change(questionIndex);
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        feedback = new javax.swing.JTextField();
        progressBar = new javax.swing.JProgressBar();
        menuBTN = new javax.swing.JButton();
        nextBTN = new javax.swing.JButton();
        questionText = new javax.swing.JLabel();
        confirmBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Question:");

        options.add(option1);

        options.add(option2);

        options.add(option3);

        options.add(option4);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Feedback:");

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressBarMouseClicked(evt);
            }
        });

        menuBTN.setText("Menu");
        menuBTN.setToolTipText("");
        menuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBTNActionPerformed(evt);
            }
        });

        nextBTN.setText("Next");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        confirmBTN.setText("Confirm");
        confirmBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 178, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(confirmBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(questionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(option1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option2))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feedback, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(option3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option4)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(confirmBTN)
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuBTN)
                    .addComponent(nextBTN))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progressBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressBarMouseClicked
        
    }//GEN-LAST:event_progressBarMouseClicked

    private void menuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBTNActionPerformed
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        
        if(options.getSelection()!=null && questionIndex<9){
           questionIndex++;
        change(questionIndex);
       options.clearSelection();
        }
         progressBar.setValue(questionIndex*10);
        
        
       
    }//GEN-LAST:event_nextBTNActionPerformed

    private void confirmBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBTNActionPerformed
        //If the confirm button is pressed, give feedback and tell user whether they got the answer right or wrong
        if (correctIndex.get(questionIndex)==0 && option1.isSelected()) {
            correct();
        }
        
        else if(correctIndex.get(questionIndex)==1 && option2.isSelected()){
            correct();
        }
        
        else if(correctIndex.get(questionIndex)==2 && option3.isSelected()){
            correct();
        }
        
        else if(correctIndex.get(questionIndex)==3 && option4.isSelected()){
            correct();
        }
        
        else{
            if(questionIndex == 0){
                feedback.setText("That is incorrect. Please review the Gantt Chart from the notes" );
            }
        }
        
        //if correct. Feedback: Correct! Well Done!
        //if incorrect. Feedback: That was incorrect. Please review *the specific material* from the notes
    }//GEN-LAST:event_confirmBTNActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton confirmBTN;
    private javax.swing.JTextField feedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menuBTN;
    private javax.swing.JButton nextBTN;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.ButtonGroup options;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel questionText;
    // End of variables declaration//GEN-END:variables

    private void change(int i) {
        questionText.setText(questions.get(i));
        option1.setText(mc1.get(i));
        option2.setText(mc2.get(i));
        option3.setText(mc3.get(i));
        option4.setText(mc4.get(i));
        
    }

    private void correct() {
        feedback.setText("Correct! Well Done");
    }
}
