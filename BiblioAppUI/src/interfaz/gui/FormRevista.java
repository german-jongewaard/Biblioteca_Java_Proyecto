package interfaz.gui;

/**
 * Created by German Jongewaard de Boer  
 */

import biblioteca.listas.Categoria;
import biblioteca.objetos.Revista;

import biblioteca.persistencia.Archivo;
import interfaz.modelos.ListaModeloCategorias;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class FormRevista extends javax.swing.JFrame {

    private FrmPrincipal frmParent;
    private Revista mRevista;

    public FormRevista() {
        initComponents();
        setLocationRelativeTo(null);

        mRevista = null;
        cargarCategorias();

    }

    public void setPadre(FrmPrincipal pPadre) {
        frmParent = pPadre;
    }

    public void setRevista(Revista revista) {
        mRevista = revista;
        lblTitulo.setText("Editar Revista");
        txtNombre.setText(mRevista.getNombre());
        txtGenero.setText(mRevista.getGenero());
        txtAño.setText(mRevista.getAno());            
        txtEdicion.setText(mRevista.getEdicion());
        int selected[] = new int[Archivo.getDatos().getCategorias().size()];
        int j=0;
        for (Categoria c : mRevista.getCategorias()) {
            selected[j++]= Archivo.getDatos().getCategorias().indexOf(c);
        }
        lstCategorias.setSelectedIndices(selected);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        tabDatos = new javax.swing.JTabbedPane();
        pnlInfo = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        lblEdicion = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        pnlCategorias = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCategorias = new javax.swing.JList();
        lblCategorias = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Revista");

        lblTitulo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitulo.setText("Crear Revista");

        lblNombre.setText("Nombre");

        lblGenero.setText("Genero");

        lblAño.setText("Año");

        lblEdicion.setText("Edición");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lblNombre)
                    .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lblGenero)
                    .addComponent(txtAño, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lblAño)
                    .addComponent(txtEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lblEdicion))
                .addContainerGap())
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEdicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        tabDatos.addTab("Información General", pnlInfo);

        lstCategorias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstCategorias);

        lblCategorias.setText("Seleccione las Categorias");

        javax.swing.GroupLayout pnlCategoriasLayout = new javax.swing.GroupLayout(pnlCategorias);
        pnlCategorias.setLayout(pnlCategoriasLayout);
        pnlCategoriasLayout.setHorizontalGroup(
            pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategorias)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCategoriasLayout.setVerticalGroup(
            pnlCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabDatos.addTab("Categorías", pnlCategorias);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        //Validar datos
        if (validar()) {
            Revista revista = null;

            if (mRevista != null) {
                revista = mRevista;                 
                revista.setNombre(txtNombre.getText());
                revista.setGenero(txtGenero.getText());
                revista.setAño(txtAño.getText());
                revista.setEdicion(txtEdicion.getText());
            } else {
                revista = new Revista(txtNombre.getText(), txtGenero.getText(),txtEdicion.getText(), txtAño.getText());                
                Archivo.getDatos().getItems().add(revista);                
            }

            for (Object item : Archivo.getDatos().getCategorias()) {

                revista.borrarCategoria((Categoria) item);
                
            }

            for (Object item : lstCategorias.getSelectedValuesList()) {
                if (!revista.getCategorias().contains(item)) {
                    revista.agregarCategoria(((Categoria) item));
                }
            }

            frmParent.refrescar();
            frmParent.cargarCategorias();

            Archivo.guardar();
            this.dispose();
        } else //Mostrar mensaje de error
        {
            JOptionPane.showMessageDialog(this, "Error en los datos del contacto...");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FormRevista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblEdicion;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList lstCategorias;
    private javax.swing.JPanel pnlCategorias;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTabbedPane tabDatos;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias() {
        ListModel modelo = new ListaModeloCategorias();
        lstCategorias.setModel(modelo);
        lstCategorias.setSelectedIndex(0);
    }

    private boolean validar() {
        return true;
    }
    
}