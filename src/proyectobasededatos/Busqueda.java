/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasededatos;

import dao.AlumnosDAO;
import entidad.Alumnos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zeus
 */
public class Busqueda extends javax.swing.JFrame {

    //Creación de Interfaz.
    public Busqueda() {
        initComponents();
        cargarTabla(); //Se llama a la tabla donde se muestra a los estudiantes
        this.setTitle("Consulta de Estudiantes");
    }
    //Creación de la tabla donde se muestra la información de los estudiantes.
    private void cargarTabla(){
        AlumnosDAO adao = new AlumnosDAO(); //se crea una nueva instancia para la clase AlumnosDAO
        ArrayList<Alumnos> lista = adao.getAlumnos(); 
        DefaultTableModel model = (DefaultTableModel)TablaCon.getModel();
        while(model.getRowCount()>0){ //se limpia la tabla para que no haya filas repetidas
            model.removeRow(0);
        }
        for (Alumnos alu : lista) {
            Object[] fila = {alu.getId(),alu.getNombre(),alu.getApellido(),alu.getEdad(),alu.getCarrera(),alu.getFecha()};
            model.addRow(fila); //se llena la fila con la información de Alumnos
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCon = new javax.swing.JTable();
        BotonVRegis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDcon = new javax.swing.JTextField();
        apellCon = new javax.swing.JTextField();
        buscID = new javax.swing.JButton();
        buscApell = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoBorrar = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        volverLista = new javax.swing.JButton();
        fondoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTA DE ESTUDIANTES REGISTRADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 410, -1));

        TablaCon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Carrera", "Fecha de registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaCon.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaCon);
        if (TablaCon.getColumnModel().getColumnCount() > 0) {
            TablaCon.getColumnModel().getColumn(0).setPreferredWidth(30);
            TablaCon.getColumnModel().getColumn(3).setPreferredWidth(40);
            TablaCon.getColumnModel().getColumn(4).setResizable(false);
            TablaCon.getColumnModel().getColumn(4).setPreferredWidth(180);
            TablaCon.getColumnModel().getColumn(5).setResizable(false);
            TablaCon.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 550, 390));

        BotonVRegis.setText("Volver a Registro");
        BotonVRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVRegisActionPerformed(evt);
            }
        });
        getContentPane().add(BotonVRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 130, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));
        getContentPane().add(IDcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 44, 140, 30));
        getContentPane().add(apellCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 44, 160, 30));

        buscID.setText("Buscar");
        buscID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscIDActionPerformed(evt);
            }
        });
        getContentPane().add(buscID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 40));

        buscApell.setText("Buscar");
        buscApell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscApellActionPerformed(evt);
            }
        });
        getContentPane().add(buscApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, 40));

        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));
        getContentPane().add(campoBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 50, 30));

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, 40));

        volverLista.setText("Ver Lista Completa");
        volverLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverListaActionPerformed(evt);
            }
        });
        getContentPane().add(volverLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        fondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpeg"))); // NOI18N
        getContentPane().add(fondoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
           //botón para volver al registro.    
    private void BotonVRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVRegisActionPerformed
        Interfaz abrir = new Interfaz(); //se llama a la interfaz de registro.
        abrir.setVisible(true);
        this.setVisible(false); //se vuelve invisible a la interfaz de busqueda.
    }//GEN-LAST:event_BotonVRegisActionPerformed
            //botón para buscar por id y mostrarlo en tabla
    private void buscIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscIDActionPerformed
        AlumnosDAO adao = new AlumnosDAO(); 
        ArrayList<Alumnos> lista = adao.getAlumnosID(Integer.parseInt(IDcon.getText()));
        DefaultTableModel model = (DefaultTableModel)TablaCon.getModel();
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        for (Alumnos alu : lista) {
            Object[] fila = {alu.getId(),alu.getNombre(),alu.getApellido(),alu.getEdad(),alu.getCarrera(),alu.getFecha()};
            model.addRow(fila);
        }
    
    }//GEN-LAST:event_buscIDActionPerformed
             //botón para buscar por apellido y mostrarlo en la tabla
    private void buscApellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscApellActionPerformed
         AlumnosDAO adao = new AlumnosDAO();
        ArrayList<Alumnos> lista = adao.getAlumnosApell(apellCon.getText());
        DefaultTableModel model = (DefaultTableModel)TablaCon.getModel();
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        for (Alumnos alu : lista) {
            Object[] fila = {alu.getId(),alu.getNombre(),alu.getApellido(),alu.getEdad(),alu.getCarrera(),alu.getFecha()};
            model.addRow(fila);
        }
    }//GEN-LAST:event_buscApellActionPerformed
           //botón para borrar a un alumno según su id
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
         AlumnosDAO adao = new AlumnosDAO();
        adao.deleteAlumnosID(Integer.parseInt(campoBorrar.getText()));
        campoBorrar.setText(null);
        cargarTabla();
    }//GEN-LAST:event_borrarActionPerformed
    //Botón para volver a cargar tabla con todo los estudiantes, despues de haber buscado a uno en específico.
    private void volverListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverListaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_volverListaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVRegis;
    private javax.swing.JTextField IDcon;
    private javax.swing.JTable TablaCon;
    private javax.swing.JTextField apellCon;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscApell;
    private javax.swing.JButton buscID;
    private javax.swing.JTextField campoBorrar;
    private javax.swing.JLabel fondoB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton volverLista;
    // End of variables declaration//GEN-END:variables
}
