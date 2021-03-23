package studyapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class quizGUI extends javax.swing.JFrame {
private StartingMenu firstWindow; 
    int questionIndex = 0;
                ArrayList <String> questions = new ArrayList();
            ArrayList <String> mc1 = new ArrayList();
            ArrayList <String> mc2 = new ArrayList();
            ArrayList <String> mc3 = new ArrayList();
            ArrayList <String> mc4 = new ArrayList();
            ArrayList <Integer> correctIndex = new ArrayList();

    /**
     * Creates new form quizGUI
     */
    public quizGUI(StartingMenu m) {
        initComponents();
        firstWindow = m;
        File f = new File("src\\studyapplication\\questions.txt");
        try {

            
            Scanner s = new Scanner(f);
            
            for (int i = 0; i < 10; i++) {
                
                questions.add(i, s.nextLine());
                mc1.add(i, s.nextLine());
                mc2.add(i, s.nextLine());
                mc3.add(i, s.nextLine());
                mc4.add(i, s.nextLine());
                correctIndex.add(i, Integer.parseInt(s.nextLine()));
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        change(questionIndex);

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
        jProgressBar1 = new javax.swing.JProgressBar();
        menuBTN = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        questionText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Question:");

        options.add(option1);

        options.add(option2);

        options.add(option3);

        options.add(option4);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Feedback:");

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProgressBar1MouseClicked(evt);
            }
        });

        menuBTN.setText("Menu");
        menuBTN.setToolTipText("");
        menuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBTNActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 79, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option2)
                                    .addComponent(option1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(option4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(questionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(option1)
                        .addGap(18, 18, 18)
                        .addComponent(option2))
                    .addComponent(feedback, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(option4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(2, 2, 2)))
                .addComponent(menuBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProgressBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProgressBar1MouseClicked
        
    }//GEN-LAST:event_jProgressBar1MouseClicked

    private void menuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBTNActionPerformed
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBTNActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        questionIndex += 1;
        change(questionIndex);
    }//GEN-LAST:event_btnNextActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField feedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton menuBTN;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.ButtonGroup options;
    private javax.swing.JLabel questionText;
    // End of variables declaration//GEN-END:variables

    private void change(int questionIndex) {
        questionText.setText(questions.get(questionIndex));
        option1.setText(mc1.get(questionIndex));
        option2.setText(mc2.get(questionIndex));
        option3.setText(mc3.get(questionIndex));
        option4.setText(mc4.get(questionIndex));
    }
}
