package ClassDiary.UI.View;

import ClassDiary.Business.Services.AulaService;
import ClassDiary.Business.Services.GetEntitiesService;
import ClassDiary.Common.Services.Result;
import ClassDiary.Domain.DTO.Aula;
import ClassDiary.Domain.DTO.Curso;
import ClassDiary.Domain.DTO.Disciplina;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    GetEntitiesService getService;
    Aula aula;
    int _usuarioId;
    
    public Cadastro(int UsuarioId){
        initComponents();
        
        getService = new GetEntitiesService();
        _usuarioId = UsuarioId;
        List<Curso> cursos = getService.GetCursos();
        DefaultComboBoxModel cmbCursoModel = new DefaultComboBoxModel(cursos.toArray());
        cmbCurso.setModel(cmbCursoModel);
        
        AtualizarCmbSemestre();
        AtualizarCmbDisciplina();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        cmbCurso = new javax.swing.JComboBox<>();
        cmbSemestre = new javax.swing.JComboBox<>();
        cmbDisciplina = new javax.swing.JComboBox<>();
        rbtnMatutino = new javax.swing.JRadioButton();
        btGravar = new javax.swing.JButton();
        rbtnNoturno = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnSim = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConteudo = new javax.swing.JTextArea();
        txtLinkDaAula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUA = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
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
        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Curso>" }));
        cmbSemestre.setEnabled(false);
        cmbSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSemestreActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 200, -1));

        cmbDisciplina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o curso e o semestre>" }));
        cmbDisciplina.setEnabled(false);
        getContentPane().add(cmbDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 610, -1));

        rbtnMatutino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnMatutino);
        rbtnMatutino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnMatutino.setSelected(true);
        rbtnMatutino.setText("Matutino");
        getContentPane().add(rbtnMatutino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

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
        getContentPane().add(btGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 240, 40));

        rbtnNoturno.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnNoturno);
        rbtnNoturno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbtnNoturno.setText("Noturno");
        getContentPane().add(rbtnNoturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 195, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Utiliza conteúdo SAGAH?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        rbtnSim.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbtnSim);
        rbtnSim.setText("Sim");
        getContentPane().add(rbtnSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        rbtnNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbtnNo);
        rbtnNo.setSelected(true);
        rbtnNo.setText("Não");
        getContentPane().add(rbtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        txtConteudo.setColumns(20);
        txtConteudo.setLineWrap(true);
        txtConteudo.setRows(5);
        txtConteudo.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtConteudo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 610, 120));
        getContentPane().add(txtLinkDaAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 530, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Link da Aula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Conteúdo densenvolvido em aula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Semestre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 90, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Unidade de Aprendizagem");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 170, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Disciplina");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Curso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Periodo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 20));
        getContentPane().add(txtUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 230, -1));

        btVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back.png"))); // NOI18N
        btVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed

        aula = new Aula();
        aula.setPeriodo(rbtnMatutino.isSelected() ? "Matutino" : "Noturno");
        aula.setDisciplinaId(((Disciplina) cmbDisciplina.getSelectedItem()).getId());
        aula.setConteudoSagah(rbtnSim.isSelected());
        aula.setLinkDaAulaGravada(txtLinkDaAula.getText());
        aula.setConteudoDesenvolvido(txtConteudo.getText());
        aula.setUnidadeDeAprendizagem(txtUA.getText());
        aula.setUsuarioId(_usuarioId);
        
        AulaService service = new AulaService();
        Result resultado = service.Inserir(aula);
        
            JOptionPane.showMessageDialog(rootPane, "Aula inserida no banco com sucesso");

    }//GEN-LAST:event_btGravarActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed

        AtualizarCmbSemestre();
        AtualizarCmbDisciplina();

    }//GEN-LAST:event_cmbCursoActionPerformed

    private void cmbSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSemestreActionPerformed
        AtualizarCmbDisciplina();
    }//GEN-LAST:event_cmbSemestreActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void AtualizarCmbDisciplina()
    {
        Curso cursoSelected = (Curso) cmbCurso.getSelectedItem();
        List<Disciplina> disciplinasByCurso = 
                cursoSelected.getDisciplinas()
                        .stream()
                        .filter(d -> d.getSemestre() == ((int) cmbSemestre.getSelectedItem())).collect(Collectors.toList());
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
    }
    
    private void AtualizarCmbSemestre()
    {
        Curso cursoSelected = (Curso) cmbCurso.getSelectedItem();
        int qtdSemestre = cursoSelected.getQtdSemestre();
        int i = 1;
        Object[] semestres = new Object[qtdSemestre];
        while(i <= qtdSemestre){
            semestres[i - 1] = i;
            i++;
        }
        DefaultComboBoxModel cmbSemestreModel = new DefaultComboBoxModel(semestres);
        cmbSemestre.setModel(cmbSemestreModel);
        cmbSemestre.setEnabled(true);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbDisciplina;
    private javax.swing.JComboBox<String> cmbSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnMatutino;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnNoturno;
    private javax.swing.JRadioButton rbtnSim;
    private javax.swing.JTextArea txtConteudo;
    private javax.swing.JTextField txtLinkDaAula;
    private javax.swing.JTextField txtUA;
    // End of variables declaration//GEN-END:variables
}
