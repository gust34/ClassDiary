package ClassDiary.UI.View;

import ClassDiary.Business.Services.GetEntitiesService;
import ClassDiary.Domain.DTO.Aula;
import ClassDiary.Domain.DTO.Curso;
import ClassDiary.Domain.DTO.Disciplina;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class Cadastro extends javax.swing.JFrame {

    GetEntitiesService getService;
    Aula aula;
    
    public Cadastro(int UsuarioId) {
        initComponents();
        
        getService = new GetEntitiesService();
        aula = new Aula();
        aula.setUsuarioId(UsuarioId);
        DefaultComboBoxModel cmbCursoModel = new DefaultComboBoxModel(getService.GetCursos().toArray());
        cmbCurso.setModel(cmbCursoModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        cmbCurso = new javax.swing.JComboBox<>();
        cmbSemestre = new javax.swing.JComboBox<>();
        cmbDisciplina = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        btGravar = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione um Curso >", "Analise e Desenvolvimento de Sistemas", "Sistemas de Informação" }));
        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 390, 20));

        cmbSemestre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Semestre >", "1º Semestre", "2º Semestre", "3º Semestre", "4º Semestre", "5º Semestre", "6º Semestre", "7º Semestre", "8º Semestre" }));
        getContentPane().add(cmbSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 180, -1));

        cmbDisciplina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione a Disciplina >", "Ánalise e Projeto de Sistemas", "Banco de Dados", "Desenvolvimento de Aplicações Web", "Inovação Dispurtiva ", "Linguagem de Programação Orientada a Objetos" }));
        cmbDisciplina.setEnabled(false);
        getContentPane().add(cmbDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 600, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton1.setText("Matutino");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        btGravar.setBackground(new java.awt.Color(255, 255, 255));
        btGravar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/btngravaraula.png"))); // NOI18N
        btGravar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btGravar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 240, 40));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton2.setText("Noturno");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 195, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Periodo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 50, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Utiliza conteúdo SAGAH?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Sim");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Não");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 610, 120));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 490, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Link da Aula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Conteúdo densenvolvido em aula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
         
        
        
    }//GEN-LAST:event_btGravarActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        Curso cursoSelected = (Curso) cmbCurso.getSelectedItem();
        
        List<Disciplina> disciplinasByCurso = cursoSelected.getDisciplinas();
        if(!disciplinasByCurso.isEmpty())
        {
            DefaultComboBoxModel cmbDisciplinaModel = new DefaultComboBoxModel(disciplinasByCurso.toArray());
            cmbDisciplina.setModel(cmbDisciplinaModel);
            cmbDisciplina.setEnabled(true);
        }
        else
        {
            String[] DisciplinaLimpa = new String[1];
            DisciplinaLimpa[0] = "Selecione um curso";
            DefaultComboBoxModel cmbDisciplinaModel = new DefaultComboBoxModel(DisciplinaLimpa);
            cmbDisciplina.setModel(cmbDisciplinaModel);
            cmbDisciplina.setEnabled(false);
        }
    }//GEN-LAST:event_cmbCursoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JComboBox<String> cmbSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
