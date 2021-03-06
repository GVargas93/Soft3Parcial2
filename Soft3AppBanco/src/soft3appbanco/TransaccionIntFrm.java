package soft3appbanco;

import DAO.TransaccionDAO;
import DTO.TransaccionDTO;
import Factory.FactoryDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerardo
 */
public class TransaccionIntFrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form TransaccionIntFrm
     */
    public TransaccionIntFrm() {
        initComponents();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblNroCuenta = new javax.swing.JLabel();
        jCBoxCuenta = new javax.swing.JComboBox<>();
        jlblTransaccion = new javax.swing.JLabel();
        jCBoxTransaccion = new javax.swing.JComboBox<>();
        jlblMonto = new javax.swing.JLabel();
        jTxtMonto = new javax.swing.JTextField();
        jlblFecha = new javax.swing.JLabel();
        btnTransaccion = new javax.swing.JButton();
        jlblMotivoTransaccion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxAreaMotivo = new javax.swing.JTextArea();
        jfTxtFecha = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblTransacciones = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        lblNroCuenta.setText("Nro Cuenta :");

        jlblTransaccion.setText("Transaccion :");

        jlblMonto.setText("Monto");

        jlblFecha.setText("Fecha");

        btnTransaccion.setText("Realizar Transaccion");
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });

        jlblMotivoTransaccion.setText("Motivo De Transaccion");

        jtxAreaMotivo.setColumns(20);
        jtxAreaMotivo.setRows(5);
        jScrollPane2.setViewportView(jtxAreaMotivo);

        jLabel1.setText("yyyy/mm/dd");

        jtblTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtblTransacciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransaccion)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNroCuenta)
                            .addComponent(jlblTransaccion)
                            .addComponent(jlblMonto)
                            .addComponent(jlblFecha)
                            .addComponent(jlblMotivoTransaccion))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jfTxtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtMonto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBoxCuenta, javax.swing.GroupLayout.Alignment.LEADING, 0, 169, Short.MAX_VALUE)
                                    .addComponent(jCBoxTransaccion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNroCuenta)
                    .addComponent(jCBoxCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTransaccion)
                    .addComponent(jCBoxTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblMonto)
                    .addComponent(jTxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfTxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblFecha)
                        .addGap(51, 51, 51)
                        .addComponent(jlblMotivoTransaccion)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnTransaccion)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
        // TODO add your handling code here:
        //System.out.println(cmbidcategoria.getSelectedItem().toString());
        try {
            TransaccionDAO objDao = FactoryDao.getFactoryInstance().getNewTransaccionDAO();
            TransaccionDTO obj = new TransaccionDTO();
            obj.setMonto(jTxtMonto.getText());
            obj.setFecha(jfTxtFecha.getText());
            obj.setMotivoTransaccion(jtxAreaMotivo.getText());
            obj.setCategoriaIDFK(1);
            obj.setCuentaIDFK(1);

            objDao.insert(obj);
            System.out.println(obj);

        } catch (Exception ex) {
            //Logger.getLogger(TransaccionGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        llenarTabla();
    }//GEN-LAST:event_btnTransaccionActionPerformed

    public void llenarTabla() {

        DefaultTableModel newTabla = new DefaultTableModel();
        newTabla.addColumn("ID");
        newTabla.addColumn("Fecha Transaccion");
        newTabla.addColumn("Monto");
        newTabla.addColumn("Motivo Transaccion");
        newTabla.addColumn("Categoria");
        newTabla.addColumn("Cuenta");
        jtblTransacciones.setModel(newTabla);

        String[] datos = new String[6];
        TransaccionDAO objDao = FactoryDao.getFactoryInstance().getNewTransaccionDAO();
        List<TransaccionDTO> lista = new ArrayList();
        lista = objDao.getList();
        for (int i = 0; i < lista.size(); i++) {
            datos[0] = String.valueOf(lista.get(i).getTransaccionID());
            datos[1] = String.valueOf(lista.get(i).getFecha());
            datos[2] = lista.get(i).getMonto();
            datos[3] = lista.get(i).getMotivoTransaccion();
            datos[4] = String.valueOf(lista.get(i).getCategoriaIDFK());
            datos[5] = String.valueOf(lista.get(i).getCuentaIDFK());
            newTabla.addRow(datos);
        }

        jtblTransacciones.setModel(newTabla);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JComboBox<String> jCBoxCuenta;
    private javax.swing.JComboBox<String> jCBoxTransaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTxtMonto;
    private javax.swing.JFormattedTextField jfTxtFecha;
    private javax.swing.JLabel jlblFecha;
    private javax.swing.JLabel jlblMonto;
    private javax.swing.JLabel jlblMotivoTransaccion;
    private javax.swing.JLabel jlblTransaccion;
    private javax.swing.JTable jtblTransacciones;
    private javax.swing.JTextArea jtxAreaMotivo;
    private javax.swing.JLabel lblNroCuenta;
    // End of variables declaration//GEN-END:variables

}
