package Graficacion_2D;

/*librerias que se utilizaron mayormente para 
lograr la forma de importar una imagen*/

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ariana
 */
public class Graficacion_2D extends javax.swing.JFrame {

    /**
     * Creates new form Graficacion_2D
     */
    public Graficacion_2D() {
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

        btn_tras = new javax.swing.JButton();
        btn_esc = new javax.swing.JButton();
        btn_rot = new javax.swing.JButton();
        btn_ses = new javax.swing.JButton();
        btn_ima = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Jlabel_graf = new javax.swing.JLabel();
        jLb_ima = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_tras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Traslacion.png"))); // NOI18N
        btn_tras.setText("Traslacion");
        btn_tras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trasActionPerformed(evt);
            }
        });

        btn_esc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Escalamiento.png"))); // NOI18N
        btn_esc.setText("Escalamiento");
        btn_esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escActionPerformed(evt);
            }
        });

        btn_rot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rotacion.png"))); // NOI18N
        btn_rot.setText("Rotacion");
        btn_rot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rotActionPerformed(evt);
            }
        });

        btn_ses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesgado.png"))); // NOI18N
        btn_ses.setText("Sesgado");
        btn_ses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesActionPerformed(evt);
            }
        });

        btn_ima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.png"))); // NOI18N
        btn_ima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imaActionPerformed(evt);
            }
        });

        jButton6.setText("Usar figura");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Jlabel_graf.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        Jlabel_graf.setForeground(new java.awt.Color(0, 102, 204));
        Jlabel_graf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlabel_graf.setText("Graficación 2D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tras)
                        .addGap(84, 84, 84)
                        .addComponent(btn_esc)
                        .addGap(80, 80, 80)
                        .addComponent(btn_rot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btn_ses)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Jlabel_graf)
                                .addGap(289, 289, 289))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_ima)
                                .addGap(48, 48, 48)
                                .addComponent(jLb_ima, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton6)
                                .addGap(214, 214, 214))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Jlabel_graf)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tras)
                            .addComponent(btn_esc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_rot)
                            .addComponent(btn_ses))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btn_ima)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jLb_ima, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imaActionPerformed
        String Ruta = " ";
        JFileChooser JFileChooser = new JFileChooser(); 
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "JPG","PNG","GIF");
        JFileChooser.setFileFilter(filtrado);
        
        int respuesta = JFileChooser.showOpenDialog(this);
        
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            Ruta = JFileChooser.getSelectedFile().getPath();
            
            Image mImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(jLb_ima.getWidth(), jLb_ima.getHeight(), Image.SCALE_SMOOTH));
            jLb_ima.setIcon(mIcono);
        }   
    }//GEN-LAST:event_btn_imaActionPerformed

        
    private void btn_rotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rotActionPerformed
       Rotacion rot = new Rotacion();
       rot.setVisible(true);
      
    }//GEN-LAST:event_btn_rotActionPerformed

    private void btn_escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escActionPerformed
        Escalamiento esc =  new Escalamiento();
        esc.setVisible(true);
    }//GEN-LAST:event_btn_escActionPerformed

    private void btn_trasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trasActionPerformed
        Traslacion tras = new Traslacion();
        tras.setVisible(true);
    }//GEN-LAST:event_btn_trasActionPerformed

    private void btn_sesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sesActionPerformed
        Sesgado ses= new Sesgado();
        ses.setVisible(true);
    }//GEN-LAST:event_btn_sesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Graficacion_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficacion_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficacion_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficacion_2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*se copio una perte del codigo por defecto del programa
        para que el explorador de archivos que apareciera fuera lo mas
        parecido al de nuestro S.O*/
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Graficacion_2D().setVisible(true);
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Graficacion_2D.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Graficacion_2D.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Graficacion_2D.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Graficacion_2D.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_graf;
    private javax.swing.JButton btn_esc;
    private javax.swing.JButton btn_ima;
    private javax.swing.JButton btn_rot;
    private javax.swing.JButton btn_ses;
    private javax.swing.JButton btn_tras;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLb_ima;
    // End of variables declaration//GEN-END:variables

    
}