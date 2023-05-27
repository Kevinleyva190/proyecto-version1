package Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JLabel lblId;
    private JLabel lblnombre;
    private JLabel lblclasificacion;
    private JLabel lblTipo;
    private JLabel lblFamoso;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtnombre;
    private JTextField txtclasificacion;
    private JTextField txtTipo;
    private JTextField txtFamoso;
    private JTextField txtUrl;
    private JButton btnagregar;
    private JButton btncargar;
    private JTable tblinstrumento;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout= new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        // panel 1
        p1=new JPanel(new FlowLayout());
        p1.setBackground(new Color(239,200,200));
        lblId= new JLabel("ID");
        lblnombre= new JLabel("Nombre");
        lblclasificacion= new JLabel("Clasificacion");
        txtId =new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtnombre =new JTextField(15);
        txtclasificacion =new JTextField(15);
        btnagregar= new JButton("Agregar");
        lblTipo= new JLabel("Tipo");
        lblFamoso= new JLabel("Instrumentista Famoso");
        lblUrl= new JLabel("Url para imagen");
        txtTipo=new JTextField(10);
        txtFamoso=new JTextField(15);
        txtUrl=new JTextField(15);




        p1.add(lblId);
        p1.add(txtId);
        p1.add(lblnombre);
        p1.add(txtnombre);
        p1.add(lblclasificacion);
        p1.add(txtclasificacion);
        p1.add(lblTipo);
        p1.add(txtTipo);
        p1.add(lblFamoso);
        p1.add(txtFamoso);
        p1.add(lblUrl);
        p1.add(txtUrl);

        p1.add(btnagregar);
        // panel 2
        p2=new JPanel(new FlowLayout());
        p2.setBackground(new Color(209,241,193));
        btncargar=new JButton("Cargar");
        p2.add(btncargar);
        tblinstrumento= new JTable();
        scrollPane=new JScrollPane(tblinstrumento);
        p2.add(scrollPane);

        // panel 3
        p3=new JPanel(new FlowLayout());
        p3.setBackground(new Color(200,239,232));
        // panel 4
        p4=new JPanel(new FlowLayout());
        p4.setBackground(new Color(213,200,239));

        // Agrgar
        this.getContentPane().add(p1,0);
        this.getContentPane().add(p2,1);
        this.getContentPane().add(p3,2);
        this.getContentPane().add(p4,3);

        this.setDefaultCloseOperation( EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblnombre() {
        return lblnombre;
    }

    public void setLblnombre(JLabel lblnombre) {
        this.lblnombre = lblnombre;
    }

    public JLabel getLblclasificacion() {
        return lblclasificacion;
    }

    public void setLblclasificacion(JLabel lblclasificacion) {
        this.lblclasificacion = lblclasificacion;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblFamoso() {
        return lblFamoso;
    }

    public void setLblFamoso(JLabel lblFamoso) {
        this.lblFamoso = lblFamoso;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxtclasificacion() {
        return txtclasificacion;
    }

    public void setTxtclasificacion(JTextField txtclasificacion) {
        this.txtclasificacion = txtclasificacion;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtFamoso() {
        return txtFamoso;
    }

    public void setTxtFamoso(JTextField txtFamoso) {
        this.txtFamoso = txtFamoso;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnagregar() {
        return btnagregar;
    }

    public void setBtnagregar(JButton btnagregar) {
        this.btnagregar = btnagregar;
    }

    public JButton getBtncargar() {
        return btncargar;
    }

    public void setBtncargar(JButton btncargar) {
        this.btncargar = btncargar;
    }

    public JTable gettblinstrumento() {
        return tblinstrumento;
    }

    public void settblinstrumento(JTable tblinstrumento) {
        this.tblinstrumento = tblinstrumento;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getP1() {
        return p1;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public JPanel getP3() {
        return p3;
    }

    public void setP3(JPanel p3) {
        this.p3 = p3;
    }

    public JPanel getP4() {
        return p4;
    }

    public void setP4(JPanel p4) {
        this.p4 = p4;
    }
    public void limpiar(){
        txtnombre.setText("");
        txtclasificacion.setText("");
        txtTipo.setText("");
        txtFamoso.setText("");
        txtUrl.setText("");
    }
}
