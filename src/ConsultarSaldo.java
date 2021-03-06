
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author CrisRodFe
 */
public class ConsultarSaldo extends javax.swing.JDialog {   
    /**
     * Creates new form ConsultarSaldo
     * @param parent
     * @param modal
     */
    public ConsultarSaldo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        cuentaConsultar = new javax.swing.JTextField();
        nCuenta = new javax.swing.JLabel();
        mostrarSaldo = new javax.swing.JTextField();
        saldo = new javax.swing.JLabel();
        euro = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTAR SALDO");
        setAlwaysOnTop(true);
        setModal(true);

        nCuenta.setText("Nº de Cuenta");

        mostrarSaldo.setEditable(false);

        saldo.setText("Saldo");

        euro.setText("€");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saldo)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(cuentaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(euro)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpiar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuentaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldo)
                    .addComponent(euro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(Limpiar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Limpiará las casillas del panel.
     * @param evt 
     */
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        cuentaConsultar.setText("");
        mostrarSaldo.setText("");       
    }//GEN-LAST:event_LimpiarActionPerformed
    /**
     * Pide un número de cuenta por pantalla y muestra el saldo de las misma.
     * @param evt 
     */       
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
         //Cargamos el archivo con los datos de las cuentas en un ArrayList 
        String archivo = "datosClientes.dat";
        Serializar sr = new Serializar();
        ArrayList<CuentaBancaria> cuenta = (ArrayList<CuentaBancaria>)sr.leerObjeto(archivo); 
        boolean existe = false;//Creamos variable para registrar si se ha encontrado la cuenta indicada
        int a = 0;//Creamos variable para memorizar la posición en el array de la cuenta encontrada
        //Recorremos el Array donde están almacenados los datos de las cuentas.
        for(int i=0;i<cuenta.size();i++){
            //Si encuentra la cuenta memoriza su posición y su existencia  
            if(cuenta.get(i).numeroCuenta.equals(cuentaConsultar.getText())){                               
                existe = true;
                a = i;
            }
        }   
        //Si se ha encontrado la cuenta en el array se muestra su saldo, si no, se lanza una ventana informando de ello.
        if(existe){
            mostrarSaldo.setText(String.valueOf(cuenta.get(a).getSaldo())); 
            cuentaConsultar.setEditable(false);
            mostrarSaldo.setEditable(false);
        }else{
           //Lanza una ventana con un mensaje de error si el valor introducido no se ha encontrado en el array.
            JOptionPane.showMessageDialog(rootPane,"La cuenta introducida no existe","Error",JOptionPane.ERROR_MESSAGE);
        } 
      
    }//GEN-LAST:event_BuscarActionPerformed
                                                  
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
            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarSaldo dialog = new ConsultarSaldo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });               
                dialog.setVisible(true);
            }
        });
    }               
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField cuentaConsultar;
    private javax.swing.JLabel euro;
    private javax.swing.JTextField mostrarSaldo;
    private javax.swing.JLabel nCuenta;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
