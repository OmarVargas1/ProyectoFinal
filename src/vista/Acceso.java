
package vista;
import java.sql.Connection;//Conexión a base de datos.
//librerías de conexión.
import java.sql.Connection;//Conexión a base de datos.
import java.sql.DriverManager;//driver de conexión.
import java.sql.ResultSet;//resultado final de datos.
import java.sql.ResultSetMetaData;//resultado de metadatos.
import java.sql.SQLException;//Tratamiento de errores de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//Fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imágenes
import javax.swing.JOptionPane;//Ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import pojos.productos;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import vista.CRUDproducto;
import vista.Cliente;
/**
 *
 * @author misti
 */
public class Acceso extends javax.swing.JFrame {

    productos objproducto=new productos(); // generación de objeto equipo.
        //Clases de conexión y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    public Acceso() {
        initComponents();
    }

    public void conectarBase(){
        try{//inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/cervezas","root","");
            JOptionPane.showMessageDialog(null,"Conexion a BD OK\n\nVargas");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1:\n"+ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:\n"+e);
        }
    }//termina método conectar.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panCaptura = new javax.swing.JPanel();
        lblUsuarioAcceso = new javax.swing.JLabel();
        lblPasswordAcceso = new javax.swing.JLabel();
        txtUsuarioAcceso = new javax.swing.JTextField();
        btnEntrarSistema = new javax.swing.JButton();
        panRol = new javax.swing.JPanel();
        optAdministrador = new javax.swing.JRadioButton();
        optVendedor = new javax.swing.JRadioButton();
        txtPPasswordAcceso = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panCaptura.setBackground(new java.awt.Color(204, 51, 0));
        panCaptura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar Sesion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(204, 153, 255))); // NOI18N

        lblUsuarioAcceso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuarioAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioAcceso.setText("Usuario:");

        lblPasswordAcceso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPasswordAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordAcceso.setText("Contraseña:");

        txtUsuarioAcceso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnEntrarSistema.setBackground(new java.awt.Color(51, 51, 255));
        btnEntrarSistema.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEntrarSistema.setText("Iniciar");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        panRol.setBackground(new java.awt.Color(255, 255, 255));
        panRol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Como Iniciar:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 153, 255))); // NOI18N

        optAdministrador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        optAdministrador.setText("Administrador");

        optVendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        optVendedor.setText("Usuario");

        javax.swing.GroupLayout panRolLayout = new javax.swing.GroupLayout(panRol);
        panRol.setLayout(panRolLayout);
        panRolLayout.setHorizontalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optAdministrador)
                    .addComponent(optVendedor))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        panRolLayout.setVerticalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(optVendedor)
                .addContainerGap())
        );

        txtPPasswordAcceso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnSalir.setBackground(new java.awt.Color(255, 51, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCapturaLayout = new javax.swing.GroupLayout(panCaptura);
        panCaptura.setLayout(panCapturaLayout);
        panCapturaLayout.setHorizontalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuarioAcceso)
                    .addComponent(lblPasswordAcceso))
                .addGap(133, 133, 133)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnEntrarSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panCapturaLayout.setVerticalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAcceso)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordAcceso)
                    .addComponent(txtPPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarSistema)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int confirmaSalida=JOptionPane.showConfirmDialog(null,"¿Quieres salir?","Mensaje Importante",JOptionPane.YES_NO_OPTION);
        if (confirmaSalida==0) {
            System.exit(0);//cierra ventana
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        conectarBase();
        if (optAdministrador.isSelected()) {
            try {
                String usuarioAcceso=txtUsuarioAcceso.getText();
                String passwordAcceso=txtPPasswordAcceso.getText();

                boolean error=true;
                rs=stmt.executeQuery("SELECT * from entradas");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("nombre"))&&passwordAcceso.equals(rs.getString("contraseña"))){
                        error=false;

                        CRUDproducto ventanaCRUDProyecto = new CRUDproducto();
                        JOptionPane.showMessageDialog(null, "Bienvenido a sistema Administrador\n"+usuarioAcceso);
                        ventanaCRUDProyecto.setVisible(true);
                        this.hide();

                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuarioAcceso.setText(usuarioAcceso);
                    txtPPasswordAcceso.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }

        } else if(optVendedor.isSelected()){
            try {
                String usuarioAcceso=txtUsuarioAcceso.getText();
                String passwordAcceso=txtPPasswordAcceso.getText();

                boolean error=true;
                rs=stmt.executeQuery("SELECT * from accesos");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("nombreusu"))&&passwordAcceso.equals(rs.getString("contraseñausu"))){
                        error=false;

                        Cliente ventanaCliente = new Cliente();
                        JOptionPane.showMessageDialog(null, "Bienvenido a sistema admin\n"+usuarioAcceso);
                        ventanaCliente.setVisible(true);
                        this.hide();

                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuarioAcceso.setText(usuarioAcceso);
                    txtPPasswordAcceso.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }

        }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPasswordAcceso;
    private javax.swing.JLabel lblUsuarioAcceso;
    private javax.swing.JRadioButton optAdministrador;
    private javax.swing.JRadioButton optVendedor;
    private javax.swing.JPanel panCaptura;
    private javax.swing.JPanel panRol;
    private javax.swing.JPasswordField txtPPasswordAcceso;
    private javax.swing.JTextField txtUsuarioAcceso;
    // End of variables declaration//GEN-END:variables
}
