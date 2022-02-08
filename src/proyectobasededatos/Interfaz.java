/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;
import dao.AlumnosDAO;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Zeus
 */
public class Interfaz extends javax.swing.JFrame {

    // Creación de la interfaz gráfica
    public Interfaz() {
        initComponents();
        this.setTitle("Registro de Estudiantes");
        SimpleDateFormat formateador = new SimpleDateFormat("YYYY/MM/dd"); //Auto-set de la hora según el equipo actual
        Date fe= new Date();
        fech.setText(formateador.format(fe));
        fech.setEditable(false);
    }
     //función para limpiar los campos donde se ingresan datos.
    public void limpiar(){
       nom.setText(null);
       apell.setText(null);
       carre.setText(null);
       eda.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jno = new javax.swing.JLabel();
        jap = new javax.swing.JLabel();
        jed = new javax.swing.JLabel();
        jca = new javax.swing.JLabel();
        jfe = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        apell = new javax.swing.JTextField();
        carre = new javax.swing.JTextField();
        eda = new javax.swing.JTextField();
        fech = new javax.swing.JTextField();
        regis = new javax.swing.JButton();
        BotonConsu = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("SISTEMA DE REGISTRO DE ESTUDIANTES PARA INSTITUTO SUPERIOR");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 640, 40));

        jno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jno.setText("Nombre:");
        getContentPane().add(jno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 20));

        jap.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jap.setText("Apellido:");
        getContentPane().add(jap, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jed.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jed.setText("Edad:");
        getContentPane().add(jed, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jca.setText("Carrera:");
        getContentPane().add(jca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jfe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jfe.setText("Fecha de registro (AAAA/MM//DD):");
        getContentPane().add(jfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomKeyTyped(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 200, -1));

        apell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellActionPerformed(evt);
            }
        });
        apell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellKeyTyped(evt);
            }
        });
        getContentPane().add(apell, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 200, -1));

        carre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreActionPerformed(evt);
            }
        });
        carre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carreKeyTyped(evt);
            }
        });
        getContentPane().add(carre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 240, -1));

        eda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edaActionPerformed(evt);
            }
        });
        eda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edaKeyTyped(evt);
            }
        });
        getContentPane().add(eda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 180, -1));
        getContentPane().add(fech, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, -1));

        regis.setText("Registrar");
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });
        getContentPane().add(regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 100, -1));

        BotonConsu.setText("Consulta");
        BotonConsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsuActionPerformed(evt);
            }
        });
        getContentPane().add(BotonConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 100, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpeg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void carreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreActionPerformed
       
    }//GEN-LAST:event_carreActionPerformed
     
    private void nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume(); //validación para solo letras
    }//GEN-LAST:event_nomKeyTyped

    private void edaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edaKeyTyped
        char c = evt.getKeyChar();
        //if (c<'0' || c>'9') evt.consume();//validación para solo números
    }//GEN-LAST:event_edaKeyTyped

    private void apellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellKeyTyped
         char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();//validación para solo letras
    }//GEN-LAST:event_apellKeyTyped

    private void carreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carreKeyTyped
         char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();//validación para solo letras
    }//GEN-LAST:event_carreKeyTyped

    //Botón para registro y validación para no dejar campos vacios
    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        if (nom.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null,"Debe Ingresar un nombre.");
        }else{
            if (apell.getText().trim().length()==0){
                JOptionPane.showMessageDialog(null,"Debe Ingresar un apellido.");
            }else{
                if (eda.getText().trim().length()==0){
                    JOptionPane.showMessageDialog(null,"Debe Ingresar la edad.");
                }else{
                    if (carre.getText().trim().length()==0){
                        JOptionPane.showMessageDialog(null,"Debe Ingresar una Carrera.");
                    }else{
                        AlumnosDAO adao = new AlumnosDAO();
                        adao.agregarAlumno(nom.getText(),apell.getText().trim(),eda.getText().trim(),carre.getText(),fech.getText().trim());
                        JOptionPane.showMessageDialog(null,"Registro Exitoso.");
                        limpiar();
                    }
                }
            }
        }
        
        
        
    }//GEN-LAST:event_regisActionPerformed
           //botón para abrir la ventana de consultas
    private void BotonConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsuActionPerformed
        Busqueda abrir = new Busqueda();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConsuActionPerformed

    private void edaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edaActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
   
    }//GEN-LAST:event_nomActionPerformed

    private void apellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsu;
    private javax.swing.JTextField apell;
    private javax.swing.JTextField carre;
    private javax.swing.JTextField eda;
    private javax.swing.JTextField fech;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jap;
    private javax.swing.JLabel jca;
    private javax.swing.JLabel jed;
    private javax.swing.JLabel jfe;
    private javax.swing.JLabel jno;
    private javax.swing.JTextField nom;
    private javax.swing.JButton regis;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
