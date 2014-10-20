package Vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import Controlador.Controlador;
import Modelo.Cliente;
import Modelo.Padecimiento;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;
import org.jfree.chart.ChartPanel;

public class Vista extends javax.swing.JFrame {

    public Vista(Controlador c) {
        this.control = c;
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Imagen/pgs-logo.png")).getImage();
        setIconImage(icon);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(screenSize);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        grupo_sexo.add(rb_masculino);
        grupo_sexo.add(rb_femenino1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_sexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jl_PGS = new javax.swing.JLabel();
        jL_imagen = new javax.swing.JLabel();
        jL_bienvenido = new javax.swing.JLabel();
        panel_registro_cliente = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        jbRegistrarCliente = new javax.swing.JButton();
        jbDesactivarCliente = new javax.swing.JButton();
        jbEditarCliente = new javax.swing.JButton();
        panel_datos = new javax.swing.JScrollPane();
        panel_reg_fisico = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTFLesion = new javax.swing.JTextField();
        jTFHernia = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTFQuebradura = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTFEnfCronica = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAOtro = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jLPadecimientos = new javax.swing.JLabel();
        jcbembarazo = new javax.swing.JComboBox();
        jcbpostembarazo = new javax.swing.JComboBox();
        jcbdiscapacidad = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_enfermedades = new javax.swing.JList();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jcbpresion = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLTelCelular = new javax.swing.JLabel();
        jLTelTrabajo = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFOcupacion = new javax.swing.JTextField();
        jTFTelHabitacion = new javax.swing.JTextField();
        jTFTelCelular = new javax.swing.JTextField();
        jTFTelTrabajo = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLFechaNac = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLOcupacion = new javax.swing.JLabel();
        jLTel = new javax.swing.JLabel();
        jLTelHabitacion = new javax.swing.JLabel();
        jTFMail = new javax.swing.JTextField();
        jLDatosPersonales = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jlnombre = new javax.swing.JLabel();
        jf_cedula = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTFTelEmergencia = new javax.swing.JTextField();
        jTFInfoMedico = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jBAddCliente = new javax.swing.JButton();
        jcbsangre = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jcbestadoSalud = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jcbcondiFisica = new javax.swing.JComboBox();
        jcbpregunta = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        jtf_altura = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        desactivar_Cliente = new javax.swing.JPanel();
        cedCliente = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        panel_registro_rutinas = new javax.swing.JPanel();
        panel_menu1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panel_datos1 = new javax.swing.JScrollPane();
        panel_crear_rutina = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        panel_asignar_rutina = new javax.swing.JPanel();
        cedCliente1 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        panel_registro_nutricional = new javax.swing.JPanel();
        panel_menu2 = new javax.swing.JPanel();
        btn_crear_perfil_Nutricional = new javax.swing.JButton();
        btn_asignar_pNutricional = new javax.swing.JButton();
        panel_datos4 = new javax.swing.JScrollPane();
        panel_crear_perfil_nutricional = new javax.swing.JPanel();
        jTFNombre2 = new javax.swing.JTextField();
        jLNombre2 = new javax.swing.JLabel();
        jLDatosPersonales2 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino1 = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        panel_asignar_perfil = new javax.swing.JPanel();
        cedCliente2 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        panel_control_pagos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        combo_filtro_cliente4 = new javax.swing.JComboBox();
        jLabel77 = new javax.swing.JLabel();
        combo_nombre_cliente_seguimiento3 = new javax.swing.JComboBox();
        label_fecha_seguimiento1 = new javax.swing.JLabel();
        dateChooserCombo3 = new datechooser.beans.DateChooserCombo();
        jLabel63 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        panel_seguimientos = new javax.swing.JPanel();
        label_cliente_seguimiento = new javax.swing.JLabel();
        combo_nombre_cliente_seguimiento = new javax.swing.JComboBox();
        label_fecha_seguimiento = new javax.swing.JLabel();
        panel_datos_seg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        combo_filtro_cliente1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        panel_busqueda = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jta_info_busqueda_cliente = new javax.swing.JTextArea();
        combo_filtro_cliente2 = new javax.swing.JComboBox();
        combo_nombre_cliente_seguimiento1 = new javax.swing.JComboBox();
        jb_salvar_en_archivo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        combo_filtro_cliente3 = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        combo_nombre_cliente_seguimiento2 = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jcb_proyec = new javax.swing.JComboBox();
        jp_chart = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        pane_otros = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Power Gym System");

        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(783, 399));

        jl_PGS.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jl_PGS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_PGS.setText("Power Gym System");

        jL_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/PGSBienvenida.png"))); // NOI18N

        jL_bienvenido.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jL_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_bienvenido.setText("Bienvenido");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jL_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_PGS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jl_PGS)
                .addGap(31, 31, 31)
                .addComponent(jL_bienvenido)
                .addGap(44, 44, 44)
                .addComponent(jL_imagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", panel_inicio);

        panel_menu.setBackground(new java.awt.Color(0, 0, 0));

        jbRegistrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        jbRegistrarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registro.jpg"))); // NOI18N
        jbRegistrarCliente.setText("Registro del Cliente");
        jbRegistrarCliente.setBorder(null);
        jbRegistrarCliente.setBorderPainted(false);
        jbRegistrarCliente.setContentAreaFilled(false);
        jbRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarClienteActionPerformed(evt);
            }
        });

        jbDesactivarCliente.setBackground(new java.awt.Color(0, 0, 0));
        jbDesactivarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbDesactivarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbDesactivarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/desacivar.png"))); // NOI18N
        jbDesactivarCliente.setText("Desactivar Cliente");
        jbDesactivarCliente.setBorder(null);
        jbDesactivarCliente.setBorderPainted(false);
        jbDesactivarCliente.setContentAreaFilled(false);
        jbDesactivarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesactivarClienteActionPerformed(evt);
            }
        });

        jbEditarCliente.setBackground(new java.awt.Color(0, 0, 0));
        jbEditarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registro.jpg"))); // NOI18N
        jbEditarCliente.setText("Editar Datos Cliente");
        jbEditarCliente.setBorder(null);
        jbEditarCliente.setBorderPainted(false);
        jbEditarCliente.setContentAreaFilled(false);
        jbEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEditarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jbRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jbDesactivarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos.setBorder(null);
        panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        panel_datos.setPreferredSize(new java.awt.Dimension(972, 600));

        panel_reg_fisico.setVisible(false);

        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));

        jLabel30.setText("Zona de lesión:");

        jLabel32.setText("Hernias. Localización:");

        jLabel33.setText("Otro");

        jTAOtro.setColumns(20);
        jTAOtro.setRows(5);
        jScrollPane2.setViewportView(jTAOtro);

        jLabel34.setText("Quebraduras. Localización:");

        jLPadecimientos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPadecimientos.setText("Padecimientos");

        jcbembarazo.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] {
                "N/A", "2 semanas",
                "1 mes", "2 meses",
                "3 meses","4 meses",
                "5 meses","6 meses",
                "7 meses","8 meses",
                "9 meses"
            }
        ));

        jcbpostembarazo.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] {
                "N/A","2 semanas", "1 mes",
                "2 meses", "3 meses",
                "4 meses", "5 meses",
                "6 meses", "7 meses",
                "8 meses", "9 meses"
            }
        ));

        jcbdiscapacidad.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] {"N/A", "Visual", "Auditiva" }
        ));
        jcbdiscapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbdiscapacidadActionPerformed(evt);
            }
        });

        jlist_enfermedades.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {
                "Cirujía", "Problemas respiratorios",
                "Diabetes", "Hábitos de fumado",
                "Obesidad", "Padecimientos nerviosos",
                "Colesterol", "Gastritis",
                "Úlceras", "Colitis",
                "Problemas de espalda", "Rehabilitación",
                "Antecedentes cardíacos", "Dificultad actividad física"
            };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlist_enfermedades);

        jLabel19.setText("Enfermedades y condiciones:");

        jLabel20.setText("Discapacidad:");

        jLabel21.setText("Presión:");

        jcbpresion.setModel(
            new javax.swing.DefaultComboBoxModel(
                new String[] {"N/A", "Alta", "Baja" }
            ));
            jcbpresion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jcbpresionActionPerformed(evt);
                }
            });

            jLabel22.setText("Embarazo (tiempo):");

            jLabel23.setText("Post-embarazo (tiempo):");

            jLabel24.setText("Enfermedad crónica:");

            jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel27.setText("Problemas musculares y/o articulares");

            javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
            jPanel12.setLayout(jPanel12Layout);
            jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbdiscapacidad, 0, 314, Short.MAX_VALUE)
                                .addComponent(jcbembarazo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbpresion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFEnfCronica)
                                .addComponent(jcbpostembarazo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel30)
                                .addComponent(jLabel32))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFHernia)
                                .addComponent(jTFQuebradura, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTFLesion))))
                    .addGap(156, 156, 156)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel33)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel19))
                    .addGap(30, 30, 30))
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLPadecimientos))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel27)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLPadecimientos)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jcbpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jcbdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jcbembarazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbpostembarazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFEnfCronica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel27)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel33)
                    .addGap(9, 9, 9)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel30)
                                .addComponent(jTFLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFQuebradura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jTFHernia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20))
            );

            jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(153, 153, 0)));

            jLTelCelular.setText("Celular:");

            jLTelTrabajo.setText("Trabajo:");

            jLMail.setText("E-Mail:");

            jTFNombre.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTFNombreActionPerformed(evt);
                }
            });

            jTFTelHabitacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTFTelHabitacionActionPerformed(evt);
                }
            });

            jTFTelCelular.setInheritsPopupMenu(true);

            jLNombre.setText("Nombre:");

            jLFechaNac.setText("Fecha de Nacimiento:");

            jLDireccion.setText("Dirección:");

            jLOcupacion.setText("Ocupación:");

            jLTel.setText("Teléfonos:");

            jLTelHabitacion.setText("Habitación:");

            jLDatosPersonales.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLDatosPersonales.setText("Datos Personales");

            dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
                new datechooser.view.appearance.ViewAppearance("custom",
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(0, 0, 255),
                        true,
                        true,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 255),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(128, 128, 128),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.LabelPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(0, 0, 255),
                        false,
                        true,
                        new datechooser.view.appearance.swing.LabelPainter()),
                    new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                        new java.awt.Color(0, 0, 0),
                        new java.awt.Color(255, 0, 0),
                        false,
                        false,
                        new datechooser.view.appearance.swing.ButtonPainter()),
                    (datechooser.view.BackRenderer)null,
                    false,
                    true)));
        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
        try {
            dateChooserCombo1.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }

        jlnombre.setText("Cédula:");

        try {
            jf_cedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jf_cedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDatosPersonales)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jlnombre)
                                    .addComponent(jLDireccion))
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(jf_cedula, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLMail)
                            .addComponent(jLOcupacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLTel)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTelHabitacion)
                            .addComponent(jLTelCelular)
                            .addComponent(jLTelTrabajo))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFTelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jTFTelHabitacion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFTelCelular, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLDatosPersonales)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLTelCelular)
                                .addComponent(jLTel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jTFTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelHabitacion)
                            .addComponent(jTFTelHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTelTrabajo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLOcupacion)
                            .addComponent(jTFOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jlnombre)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFechaNac))))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMail)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDireccion)
                    .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(153, 153, 0)));

        jLabel37.setText("Tipo de sangre:");

        jLabel38.setText("Teléfono en caso de emergencia:");

        jLabel39.setText("Sabe su médico si esta realizando alguna actividad aeróbica o anaeróbica:");

        jLabel40.setText("Información de su médico\":");

        jLabel41.setText("Al dar click en agregar se da por entendido que el cliente exime al al gimnasio Power Time de responsabilidad alguna. ");

        jBAddCliente.setBackground(new java.awt.Color(204, 51, 0));
        jBAddCliente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jBAddCliente.setForeground(new java.awt.Color(102, 0, 0));
        jBAddCliente.setText("Agregar Cliente");
        jBAddCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));
        jBAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddClienteActionPerformed(evt);
            }
        });

        jcbsangre.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] {
                "Tipo A", "Tipo B", "Tipo AB", "Tipo O"
            }));

            jLabel35.setText("Estado de Salud Actual:");

            jcbestadoSalud.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] {
                    "Excelente", "Muy Bueno", "Bueno", "Regular",
                    "Malo","Muy Malo", "Pésimo"
                }));

                jLabel36.setText("Condición Física Actual:");

                jcbcondiFisica.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] {
                        "Excelente", "Muy Bueno", "Bueno", "Regular",
                        "Malo","Muy Malo", "Pésimo" }
                ));

                jcbpregunta.setModel(new javax.swing.DefaultComboBoxModel(
                    new String[] {
                        "Si",
                        "No"
                    }));

                    jLabel74.setText("Altura:");

                    jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                    jLabel75.setText("mts.");

                    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                    jPanel5.setLayout(jPanel5Layout);
                    jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(jBAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbcondiFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbsangre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel35)
                                        .addComponent(jLabel74))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jtf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel75))
                                        .addComponent(jcbestadoSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTFTelEmergencia))
                                        .addComponent(jLabel39))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel41)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFInfoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel37))
                            .addContainerGap(67, Short.MAX_VALUE))
                    );
                    jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(jcbsangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel74)
                                .addComponent(jLabel75))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(jcbcondiFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35)
                                .addComponent(jcbestadoSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(jTFTelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(jTFInfoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel41)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBAddCliente)
                            .addContainerGap())
                    );

                    javax.swing.GroupLayout panel_reg_fisicoLayout = new javax.swing.GroupLayout(panel_reg_fisico);
                    panel_reg_fisico.setLayout(panel_reg_fisicoLayout);
                    panel_reg_fisicoLayout.setHorizontalGroup(
                        panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_reg_fisicoLayout.createSequentialGroup()
                            .addContainerGap(150, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(151, Short.MAX_VALUE))
                    );
                    panel_reg_fisicoLayout.setVerticalGroup(
                        panel_reg_fisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_reg_fisicoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0))
                    );

                    panel_datos.setViewportView(panel_reg_fisico);

                    desactivar_Cliente.setVisible(false);

                    cedCliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            cedClienteActionPerformed(evt);
                        }
                    });

                    jButton10.setText("Desactivar Cliente");
                    jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton10ActionPerformed(evt);
                        }
                    });

                    jLabel51.setText("Cedula del Cliente:");

                    javax.swing.GroupLayout desactivar_ClienteLayout = new javax.swing.GroupLayout(desactivar_Cliente);
                    desactivar_Cliente.setLayout(desactivar_ClienteLayout);
                    desactivar_ClienteLayout.setHorizontalGroup(
                        desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                            .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel51)
                                    .addGap(18, 18, 18)
                                    .addComponent(cedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(jButton10)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    desactivar_ClienteLayout.setVerticalGroup(
                        desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(desactivar_ClienteLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(desactivar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel51)
                                .addComponent(cedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addComponent(jButton10)
                            .addGap(48, 48, 48))
                    );

                    javax.swing.GroupLayout panel_registro_clienteLayout = new javax.swing.GroupLayout(panel_registro_cliente);
                    panel_registro_cliente.setLayout(panel_registro_clienteLayout);
                    panel_registro_clienteLayout.setHorizontalGroup(
                        panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                            .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                        .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                                .addGap(602, 602, 602)
                                .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    );
                    panel_registro_clienteLayout.setVerticalGroup(
                        panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_registro_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registro_clienteLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(desactivar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(531, Short.MAX_VALUE)))
                    );

                    jTabbedPane1.addTab("Registro del Cliente", panel_registro_cliente);

                    panel_registro_rutinas.setVisible(false);

                    panel_menu1.setBackground(new java.awt.Color(0, 0, 0));

                    jButton2.setBackground(new java.awt.Color(0, 0, 0));
                    jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    jButton2.setForeground(new java.awt.Color(255, 255, 255));
                    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
                    jButton2.setText("Editar Rutina");
                    jButton2.setBorder(null);
                    jButton2.setBorderPainted(false);
                    jButton2.setContentAreaFilled(false);
                    jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton2ActionPerformed(evt);
                        }
                    });

                    jButton3.setBackground(new java.awt.Color(0, 0, 0));
                    jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    jButton3.setForeground(new java.awt.Color(255, 255, 255));
                    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AsignarIcon.png"))); // NOI18N
                    jButton3.setText("Asignar Rutina");
                    jButton3.setBorder(null);
                    jButton3.setBorderPainted(false);
                    jButton3.setContentAreaFilled(false);
                    jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton3ActionPerformed(evt);
                        }
                    });

                    jButton1.setBackground(new java.awt.Color(0, 0, 0));
                    jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    jButton1.setForeground(new java.awt.Color(255, 255, 255));
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
                    jButton1.setText("Crear Rutina");
                    jButton1.setBorder(null);
                    jButton1.setBorderPainted(false);
                    jButton1.setContentAreaFilled(false);
                    jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton1ActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout panel_menu1Layout = new javax.swing.GroupLayout(panel_menu1);
                    panel_menu1.setLayout(panel_menu1Layout);
                    panel_menu1Layout.setHorizontalGroup(
                        panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu1Layout.createSequentialGroup()
                            .addGap(0, 32, Short.MAX_VALUE)
                            .addGroup(panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(35, Short.MAX_VALUE))
                    );
                    panel_menu1Layout.setVerticalGroup(
                        panel_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_menu1Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    panel_datos1.setBorder(null);

                    panel_crear_rutina.setVisible(false);

                    jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Elevacion de Talones", null, null, null},
                            {"Pantorillas de Sentado", null, null, null},
                            {"Pantorillas en Maquina Press", null, null, null},
                            {"Pantorilla con Mancuerna", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane14.setViewportView(jTable1);

                    jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel28.setText("Piernas");

                    jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel29.setText("Pantorillas");

                    jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Extension de piernas", null, null, null},
                            {"Sentadillas", null, null, null},
                            {"Hat Squat", null, null, null},
                            {"Flexion de Piernas", null, null, null},
                            {"Buenos dias barra", null, null, null},
                            {"Sentadillas por delante", null, null, null},
                            {"Desplante", null, null, null},
                            {"Abductores", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane3.setViewportView(jTable2);

                    jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel42.setText("Biceps");

                    jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable3.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Curl de Muñeca con Barra", null, null, null},
                            {"Curl Dorsal con Barra", null, null, null},
                            {"Curl de Muñecas por detras con barra", null, null, null},
                            {"Rollos", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane4.setViewportView(jTable3);

                    jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel43.setText("Triceps");

                    jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable4.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Curl con barra", null, null, null},
                            {"Curl con Mancuerna", null, null, null},
                            {"Curl Scott", null, null, null},
                            {"Curl Scott Mancuerna", null, null, null},
                            {"Curl Concentrado", null, null, null},
                            {"Curl Estilo 21", null, null, null},
                            {"Curl con Cable", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane5.setViewportView(jTable4);

                    jLabel44.setText("Nombre de la Rutina:");

                    jLabel45.setText("Codigo de la Rutina:");

                    jScrollPane6.setViewportView(jTextPane1);

                    jScrollPane7.setViewportView(jTextPane2);

                    jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel46.setText("Antebrazo");

                    jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable5.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Flexion con Barra", null, null, null},
                            {"Flexion con Mancuerna", null, null, null},
                            {"Flexion estilo Copa", null, null, null},
                            {"Press francés con barra", null, null, null},
                            {"Patada Tricep", null, null, null},
                            {"Polea Tricep", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane8.setViewportView(jTable5);

                    jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel47.setText("Hombros");

                    jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable6.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Press militar por delante", null, null, null},
                            {"Press militar por detras", null, null, null},
                            {"Press militar barra", null, null, null},
                            {"Press militar estilo Arnold", null, null, null},
                            {"Laterales con mancuernas", null, null, null},
                            {"Lateral inclinados", null, null, null},
                            {"Lateral a una mano con mancuerna", null, null, null},
                            {"Mancuernas al frente", null, null, null},
                            {"Barra al frente", null, null, null},
                            {"Mancuernas atras", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane9.setViewportView(jTable6);

                    jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel48.setText("Pecho");

                    jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable7.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Press de banca", null, null, null},
                            {"Press inclinado con barra", null, null, null},
                            {"Press declinado con barra", null, null, null},
                            {"Press declinado con mancuernas", null, null, null},
                            {"Voladoras", null, null, null},
                            {"Voladoras Inclinadas", null, null, null},
                            {"Pull Over con Barra", null, null, null},
                            {"Pull Over con mancuernas", null, null, null},
                            {"Fondos Disco", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane10.setViewportView(jTable7);

                    jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel49.setText("Espalda");

                    jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable8.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Polea por detrás", null, null, null},
                            {"Polea por delante", null, null, null},
                            {"Remo sentado con cable", null, null, null},
                            {"Remo Fijo", null, null, null},
                            {"Remo con barra fija", null, null, null},
                            {"Buenos dias con barra", null, null, null},
                            {"Remo con mancuernas", null, null, null},
                            {"Barra fija", null, null, null},
                            {"Rotaciones Olimpicas", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane11.setViewportView(jTable8);

                    jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                    jLabel50.setText("Trapecios");

                    jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                    jTable9.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Robin", null, null, null},
                            {"Encogimientos barra por delante", null, null, null},
                            {"Encogimientos con mancuernas", null, null, null},
                            {"Encogimientos barra por detrás", null, null, null}
                        },
                        new String [] {
                            "Ejercicio", "Serie", "Repeticion", "Peso"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                            false, true, true, true
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jScrollPane12.setViewportView(jTable9);

                    jButton8.setText("Crear Rutina");

                    javax.swing.GroupLayout panel_crear_rutinaLayout = new javax.swing.GroupLayout(panel_crear_rutina);
                    panel_crear_rutina.setLayout(panel_crear_rutinaLayout);
                    panel_crear_rutinaLayout.setHorizontalGroup(
                        panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel49)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel48)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_crear_rutinaLayout.createSequentialGroup()
                                        .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel45))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(jScrollPane7)))
                                    .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel43)
                                        .addComponent(jLabel46)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel47)))
                                .addComponent(jButton8))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel_crear_rutinaLayout.setVerticalGroup(
                        panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_crear_rutinaLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel44)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_crear_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45))
                            .addGap(35, 35, 35)
                            .addComponent(jLabel28)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel29)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel42)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel43)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel46)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel47)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel48)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel50)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                            .addComponent(jButton8)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    panel_datos1.setViewportView(panel_crear_rutina);

                    panel_asignar_rutina.setVisible(false);

                    cedCliente1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            cedCliente1ActionPerformed(evt);
                        }
                    });

                    jButton12.setText("Asignar Rutina");
                    jButton12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton12ActionPerformed(evt);
                        }
                    });

                    jLabel61.setText("Cedula del Cliente:");

                    jLabel17.setText("Rutina:");

                    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rutina 1", "Rutina 2", "Rutina 3", "Rutina 4" }));
                    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jComboBox1ActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout panel_asignar_rutinaLayout = new javax.swing.GroupLayout(panel_asignar_rutina);
                    panel_asignar_rutina.setLayout(panel_asignar_rutinaLayout);
                    panel_asignar_rutinaLayout.setHorizontalGroup(
                        panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel61)
                                .addComponent(jLabel17))
                            .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jButton12))
                                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cedCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(131, Short.MAX_VALUE))
                    );
                    panel_asignar_rutinaLayout.setVerticalGroup(
                        panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                            .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_asignar_rutinaLayout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel61)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignar_rutinaLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(cedCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)))
                            .addGroup(panel_asignar_rutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                            .addComponent(jButton12)
                            .addGap(46, 46, 46))
                    );

                    javax.swing.GroupLayout panel_registro_rutinasLayout = new javax.swing.GroupLayout(panel_registro_rutinas);
                    panel_registro_rutinas.setLayout(panel_registro_rutinasLayout);
                    panel_registro_rutinasLayout.setHorizontalGroup(
                        panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                            .addComponent(panel_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                        .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(panel_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    );
                    panel_registro_rutinasLayout.setVerticalGroup(
                        panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                            .addComponent(panel_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(panel_registro_rutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registro_rutinasLayout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(panel_asignar_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    );

                    jTabbedPane1.addTab("Registro de Rutinas", panel_registro_rutinas);

                    panel_menu2.setBackground(new java.awt.Color(0, 0, 0));

                    btn_crear_perfil_Nutricional.setBackground(new java.awt.Color(0, 0, 0));
                    btn_crear_perfil_Nutricional.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    btn_crear_perfil_Nutricional.setForeground(new java.awt.Color(255, 255, 255));
                    btn_crear_perfil_Nutricional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registroIcon.jpg"))); // NOI18N
                    btn_crear_perfil_Nutricional.setText("Crear Perfil Nutricional");
                    btn_crear_perfil_Nutricional.setBorderPainted(false);
                    btn_crear_perfil_Nutricional.setContentAreaFilled(false);
                    btn_crear_perfil_Nutricional.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            btn_crear_perfil_NutricionalActionPerformed(evt);
                        }
                    });

                    btn_asignar_pNutricional.setBackground(new java.awt.Color(0, 0, 0));
                    btn_asignar_pNutricional.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                    btn_asignar_pNutricional.setForeground(new java.awt.Color(255, 255, 255));
                    btn_asignar_pNutricional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AsignarIcon.png"))); // NOI18N
                    btn_asignar_pNutricional.setText("Asignar Perfil Nutricional");
                    btn_asignar_pNutricional.setBorder(null);
                    btn_asignar_pNutricional.setBorderPainted(false);
                    btn_asignar_pNutricional.setContentAreaFilled(false);
                    btn_asignar_pNutricional.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            btn_asignar_pNutricionalActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout panel_menu2Layout = new javax.swing.GroupLayout(panel_menu2);
                    panel_menu2.setLayout(panel_menu2Layout);
                    panel_menu2Layout.setHorizontalGroup(
                        panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_menu2Layout.createSequentialGroup()
                            .addComponent(btn_crear_perfil_Nutricional)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btn_asignar_pNutricional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    panel_menu2Layout.setVerticalGroup(
                        panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_menu2Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(btn_crear_perfil_Nutricional)
                            .addGap(29, 29, 29)
                            .addComponent(btn_asignar_pNutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    panel_datos4.setBorder(null);

                    panel_crear_perfil_nutricional.setVisible(false);

                    jTFNombre2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jTFNombre2ActionPerformed(evt);
                        }
                    });

                    jLNombre2.setText("Nombre del Perfil");

                    jLDatosPersonales2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                    jLDatosPersonales2.setText("Perfil Nutricional");

                    jLabel52.setText("Sexo");

                    rb_masculino.setText("Masculino");
                    rb_masculino.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            rb_masculinoActionPerformed(evt);
                        }
                    });

                    rb_femenino1.setText("Femenino");

                    jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                    jLabel53.setText("Datos del Cliente");

                    jLabel54.setText("Peso");

                    jTextField22.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jTextField22ActionPerformed(evt);
                        }
                    });

                    jLabel55.setText("Kgs.");

                    jLabel56.setText("Altura");

                    jLabel57.setText("mts.");

                    jLabel58.setText("% de Cal de Carbohidratos.");

                    jLabel59.setText("%");

                    jLabel60.setText("% de Cal de Proteinas.");

                    jLabel64.setText("%");

                    jLabel65.setText("% de Cal de Grasas.");

                    jLabel66.setText("%");

                    jButton11.setText("Crear Perfil Nutricional");
                    jButton11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton11ActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout panel_crear_perfil_nutricionalLayout = new javax.swing.GroupLayout(panel_crear_perfil_nutricional);
                    panel_crear_perfil_nutricional.setLayout(panel_crear_perfil_nutricionalLayout);
                    panel_crear_perfil_nutricionalLayout.setHorizontalGroup(
                        panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                            .addContainerGap(144, Short.MAX_VALUE)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                                    .addComponent(jLabel58)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                                    .addComponent(jLabel60)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel59)
                                                .addComponent(jLabel64)
                                                .addComponent(jLabel66)))
                                        .addComponent(jLDatosPersonales2)
                                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                            .addComponent(jLNombre2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel53)
                                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                            .addComponent(jLabel52)
                                            .addGap(43, 43, 43)
                                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rb_femenino1)
                                                .addComponent(rb_masculino))
                                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                                    .addGap(49, 49, 49)
                                                    .addComponent(jLabel54)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel55))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel56)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel57)))))
                                    .addGap(206, 206, 206))
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addComponent(jLabel65)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(195, Short.MAX_VALUE))))
                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                    );
                    panel_crear_perfil_nutricionalLayout.setVerticalGroup(
                        panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLDatosPersonales2)
                            .addGap(48, 48, 48)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLNombre2)
                                .addComponent(jTFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addComponent(jLabel53)
                            .addGap(27, 27, 27)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel52)
                                .addComponent(rb_masculino)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55)
                                .addComponent(jLabel54))
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rb_femenino1))
                                .addGroup(panel_crear_perfil_nutricionalLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel57))))
                            .addGap(30, 30, 30)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel58)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel59))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel60)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel64))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_crear_perfil_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel65)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel66))
                            .addGap(41, 41, 41)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(421, Short.MAX_VALUE))
                    );

                    jLDatosPersonales.setFont(new Font("Serif", Font.PLAIN, 18));

                    panel_datos4.setViewportView(panel_crear_perfil_nutricional);

                    panel_asignar_perfil.setVisible(false);

                    cedCliente2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            cedCliente2ActionPerformed(evt);
                        }
                    });

                    jButton13.setText("Asignar Perfil");
                    jButton13.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButton13ActionPerformed(evt);
                        }
                    });

                    jLabel62.setText("Cedula del Cliente:");

                    jLabel18.setText("Rutina:");

                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Perfil 1", "Perfil 2", "Perfil 3", "Perfil 4" }));
                    jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jComboBox2ActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout panel_asignar_perfilLayout = new javax.swing.GroupLayout(panel_asignar_perfil);
                    panel_asignar_perfil.setLayout(panel_asignar_perfilLayout);
                    panel_asignar_perfilLayout.setHorizontalGroup(
                        panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel62)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cedCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(163, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignar_perfilLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel_asignar_perfilLayout.setVerticalGroup(
                        panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                            .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_asignar_perfilLayout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel62)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_asignar_perfilLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(cedCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)))
                            .addGroup(panel_asignar_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addComponent(jButton13)
                            .addContainerGap(61, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout panel_registro_nutricionalLayout = new javax.swing.GroupLayout(panel_registro_nutricional);
                    panel_registro_nutricional.setLayout(panel_registro_nutricionalLayout);
                    panel_registro_nutricionalLayout.setHorizontalGroup(
                        panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                            .addComponent(panel_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(panel_datos4, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                            .addGap(0, 0, 0))
                        .addGroup(panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(panel_asignar_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(160, Short.MAX_VALUE)))
                    );
                    panel_registro_nutricionalLayout.setVerticalGroup(
                        panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_datos4, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                        .addGroup(panel_registro_nutricionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_registro_nutricionalLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(panel_asignar_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(562, Short.MAX_VALUE)))
                    );

                    jTabbedPane1.addTab("Registro Nutricional", panel_registro_nutricional);

                    jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));

                    jLabel76.setText("Parámetro:");

                    combo_filtro_cliente4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                    combo_filtro_cliente4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            combo_filtro_cliente4ActionPerformed(evt);
                        }
                    });
                    combo_filtro_cliente4.addActionListener(
                        e -> combo_nombre_cliente_seguimiento3.setModel(
                            new DefaultComboBoxModel(
                                control.getDao().RecuperaAtributosCliente(
                                    combo_filtro_cliente4.getSelectedItem().toString()))
                        )
                    );

                    jLabel77.setText("Valor:");

                    combo_nombre_cliente_seguimiento3.setModel(
                        new DefaultComboBoxModel(
                            new String[]{"valor de búsqueda no seleccionado"})
                    );
                    combo_nombre_cliente_seguimiento3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            combo_nombre_cliente_seguimiento3ActionPerformed(evt);
                        }
                    });

                    label_fecha_seguimiento1.setText("Fecha");

                    jLabel63.setText("Monto:");

                    jTextField17.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jTextField17ActionPerformed(evt);
                        }
                    });

                    jButton5.setText("Cancelar");
                    jButton5.setToolTipText("cancelar monto");
                    jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

                    jLabel31.setBackground(new java.awt.Color(255, 255, 255));
                    jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jLabel31.setForeground(new java.awt.Color(153, 0, 0));
                    jLabel31.setText("Cobro de mensualidad");
                    jLabel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));

                    jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
                    jLabel78.setText("Búsqueda del cliente");
                    jLabel78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true));

                    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                    jPanel4.setLayout(jPanel4Layout);
                    jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel77)
                                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combo_filtro_cliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo_nombre_cliente_seguimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel63)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(label_fecha_seguimiento1)
                                            .addGap(32, 32, 32)
                                            .addComponent(dateChooserCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(35, 35, 35)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(31, Short.MAX_VALUE))
                    );
                    jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel31)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel78)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateChooserCombo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(combo_filtro_cliente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel76)
                                            .addComponent(label_fecha_seguimiento1)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel77)
                                        .addComponent(combo_nombre_cliente_seguimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel63)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(68, 68, 68))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton5)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    );

                    jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));

                    jTable10.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null},
                            {null, null, null, null}
                        },
                        new String [] {
                            "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                    ));
                    jScrollPane15.setViewportView(jTable10);

                    jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jLabel79.setForeground(new java.awt.Color(153, 0, 0));
                    jLabel79.setText("Información de cobros");
                    jLabel79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 0), 1, true));

                    jLabel80.setText("Proyectar");

                    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(
                        new String[] {
                            "Clientes morosos", "Cancelan durante la semana",
                            "Clientes que están al día"
                        }));

                        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                        jPanel6.setLayout(jPanel6Layout);
                        jPanel6Layout.setHorizontalGroup(
                            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel79)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel80)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        );
                        jPanel6Layout.setVerticalGroup(
                            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel79)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel80)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );

                        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                        jPanel1.setLayout(jPanel1Layout);
                        jPanel1Layout.setHorizontalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        jPanel1Layout.setVerticalGroup(
                            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );

                        javax.swing.GroupLayout panel_control_pagosLayout = new javax.swing.GroupLayout(panel_control_pagos);
                        panel_control_pagos.setLayout(panel_control_pagosLayout);
                        panel_control_pagosLayout.setHorizontalGroup(
                            panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );
                        panel_control_pagosLayout.setVerticalGroup(
                            panel_control_pagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        );

                        jTabbedPane1.addTab("Control de Pagos", panel_control_pagos);

                        label_cliente_seguimiento.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                        label_cliente_seguimiento.setForeground(new java.awt.Color(0, 0, 153));
                        label_cliente_seguimiento.setText("Cliente");

                        combo_nombre_cliente_seguimiento.setModel(
                            new DefaultComboBoxModel(
                                new String[]{""})
                        );

                        label_fecha_seguimiento.setText("Fecha");

                        panel_datos_seg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(5, 100, 152), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));

                        jLabel1.setText("Brazo derecho");

                        jLabel2.setText("Brazo Izquierdo");

                        jLabel3.setText("Antebrazo Derecho");

                        jLabel4.setText("Antebrazo Izquierdo");

                        jLabel5.setText("Pecho");

                        jLabel6.setText("Espalda");

                        jLabel7.setText("Cadera");

                        jLabel8.setText("Cintura");

                        jLabel9.setText("Glúteos");

                        jLabel10.setText("Pierna Derecha");

                        jLabel11.setText("Pierna Izquierda");

                        jLabel12.setText("Pantorrilla Izquierda");

                        jLabel13.setText("Pantorrilla derecha");

                        jLabel14.setText("Peso");

                        jLabel15.setText("Grasa");

                        jLabel16.setText("IMC");

                        javax.swing.GroupLayout panel_datos_segLayout = new javax.swing.GroupLayout(panel_datos_seg);
                        panel_datos_seg.setLayout(panel_datos_segLayout);
                        panel_datos_segLayout.setHorizontalGroup(
                            panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)))
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                                    .addComponent(jTextField1)
                                                    .addComponent(jTextField3)
                                                    .addComponent(jTextField4)
                                                    .addComponent(jTextField5)))
                                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12))
                                                .addGap(28, 28, 28)
                                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField10)
                                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                    .addComponent(jTextField12)))
                                            .addComponent(jLabel1)
                                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(26, 26, 26)
                                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                                        .addContainerGap(47, Short.MAX_VALUE))))
                        );
                        panel_datos_segLayout.setVerticalGroup(
                            panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel10)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_datos_segLayout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel13))
                                        .addGroup(panel_datos_segLayout.createSequentialGroup()
                                            .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(25, Short.MAX_VALUE))
                        );

                        jTextField1 .addFocusListener(new FocusAdapter(){
                            public void focusLost(FocusEvent e) {
                                Cliente c = control.getDao().getCliente(
                                    combo_filtro_cliente1.getSelectedItem().toString(),
                                    combo_nombre_cliente_seguimiento.getSelectedItem().toString());
                                double p= Double.parseDouble(jTextField1 .getText())/
                                Math.pow(c.getAltura(), 2);
                                jTextField2 .setText(String.valueOf(p));
                            }
                        }
                    );

                    combo_filtro_cliente1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                    combo_filtro_cliente1.addActionListener(
                        e -> combo_nombre_cliente_seguimiento.setModel(
                            new DefaultComboBoxModel(
                                control.getDao().RecuperaAtributosCliente(
                                    combo_filtro_cliente1.getSelectedItem().toString()))
                        )
                    );

                    jLabel25.setText("Búsqueda");

                    jLabel26.setText("Valor");

                    jButton4.setText("Añadir Seguimiento");
                    jButton4.setToolTipText("haga click para añadir un nuevo seguimiento");

                    javax.swing.GroupLayout panel_seguimientosLayout = new javax.swing.GroupLayout(panel_seguimientos);
                    panel_seguimientos.setLayout(panel_seguimientosLayout);
                    panel_seguimientosLayout.setHorizontalGroup(
                        panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_seguimientosLayout.createSequentialGroup()
                            .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_seguimientosLayout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_cliente_seguimiento)
                                        .addGroup(panel_seguimientosLayout.createSequentialGroup()
                                            .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel26)
                                                .addComponent(label_fecha_seguimiento))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(combo_nombre_cliente_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(combo_filtro_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(panel_seguimientosLayout.createSequentialGroup()
                                    .addContainerGap(67, Short.MAX_VALUE)
                                    .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(66, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_seguimientosLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panel_seguimientosLayout.setVerticalGroup(
                        panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_seguimientosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label_cliente_seguimiento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(combo_filtro_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(combo_nombre_cliente_seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_seguimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_fecha_seguimiento)
                                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(jButton4)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    jTabbedPane1.addTab("Seguimientos", panel_seguimientos);

                    jLabel67.setText("Nombre del cliente");

                    jLabel68.setText("Valor");

                    jta_info_busqueda_cliente.setColumns(20);
                    jta_info_busqueda_cliente.setRows(5);
                    jScrollPane13.setViewportView(jta_info_busqueda_cliente);

                    combo_filtro_cliente2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                    combo_filtro_cliente2.addActionListener(
                        e -> combo_nombre_cliente_seguimiento1.setModel(
                            new DefaultComboBoxModel(
                                control.getDao().RecuperaAtributosCliente(
                                    combo_filtro_cliente2.getSelectedItem().toString()))
                        )
                    );

                    combo_nombre_cliente_seguimiento1.setModel(
                        new DefaultComboBoxModel(
                            new String[]{"valor de busqueda no seleccionado"})
                    );
                    combo_nombre_cliente_seguimiento1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            combo_nombre_cliente_seguimiento1ActionPerformed(evt);
                        }
                    });

                    jb_salvar_en_archivo.setText("Guardar en archivo");
                    jb_salvar_en_archivo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jb_salvar_en_archivoActionPerformed(evt);
                        }
                    });

                    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                    jPanel2.setLayout(jPanel2Layout);
                    jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combo_nombre_cliente_seguimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo_filtro_cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap(63, Short.MAX_VALUE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(64, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_salvar_en_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_filtro_cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel68)
                                .addComponent(combo_nombre_cliente_seguimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jb_salvar_en_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(42, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout panel_busquedaLayout = new javax.swing.GroupLayout(panel_busqueda);
                    panel_busqueda.setLayout(panel_busquedaLayout);
                    panel_busquedaLayout.setHorizontalGroup(
                        panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_busquedaLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(125, Short.MAX_VALUE))
                    );
                    panel_busquedaLayout.setVerticalGroup(
                        panel_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_busquedaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    jTabbedPane1.addTab("Búsqueda de clientes", panel_busqueda);

                    jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(102, 102, 0)));

                    jLabel69.setText("Parámetro:");

                    jLabel70.setText("Valor:");

                    combo_filtro_cliente3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cedula", "E-mail" }));
                    combo_filtro_cliente3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            combo_filtro_cliente3ActionPerformed(evt);
                        }
                    });
                    combo_filtro_cliente3.addActionListener(
                        e -> combo_nombre_cliente_seguimiento2.setModel(
                            new DefaultComboBoxModel(
                                control.getDao().RecuperaAtributosCliente(
                                    combo_filtro_cliente3.getSelectedItem().toString()))
                        )
                    );

                    jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jLabel71.setForeground(new java.awt.Color(102, 102, 0));
                    jLabel71.setText("Búsqueda del cliente ");

                    combo_nombre_cliente_seguimiento2.setModel(
                        new DefaultComboBoxModel(
                            new String[]{"valor de búsqueda no seleccionado"})
                    );
                    combo_nombre_cliente_seguimiento2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            combo_nombre_cliente_seguimiento2ActionPerformed(evt);
                        }
                    });

                    jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jLabel72.setForeground(new java.awt.Color(204, 0, 51));
                    jLabel72.setText(" Proyección de los cambios en medidas físicas y corporales del cliente");
                    jLabel72.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

                    jLabel73.setText("Atributo a proyectar del cliente ");

                    jcb_proyec.setModel(new javax.swing.DefaultComboBoxModel(
                        new String[] {
                            "Piernas",
                            "Brazos",
                            "Pantorrillas",
                            "Antebrazos",
                            "Cintura",
                            "Gluteos",
                            "Cadera",
                            "Espalda",
                            "Pecho",
                            "Grasa",
                            "Peso",
                            "IMC"
                        }));
                        jcb_proyec.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jcb_proyecActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                        jPanel7.setLayout(jPanel7Layout);
                        jPanel7Layout.setHorizontalGroup(
                            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_filtro_cliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel70)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_nombre_cliente_seguimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel73)
                                        .addGap(45, 45, 45)
                                        .addComponent(jcb_proyec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        jPanel7Layout.setVerticalGroup(
                            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel69)
                                    .addComponent(combo_filtro_cliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70)
                                    .addComponent(combo_nombre_cliente_seguimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel72)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_proyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel73))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );

                        jp_chart.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));

                        javax.swing.GroupLayout jp_chartLayout = new javax.swing.GroupLayout(jp_chart);
                        jp_chart.setLayout(jp_chartLayout);
                        jp_chartLayout.setHorizontalGroup(
                            jp_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
                        );
                        jp_chartLayout.setVerticalGroup(
                            jp_chartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 228, Short.MAX_VALUE)
                        );

                        jButton7.setText("Exportar gráfico");
                        jButton7.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                        jPanel3.setLayout(jPanel3Layout);
                        jPanel3Layout.setHorizontalGroup(
                            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jp_chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        jPanel3Layout.setVerticalGroup(
                            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jp_chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(443, 443, 443))
                        );

                        jTabbedPane1.addTab("Proyección", jPanel3);

                        javax.swing.GroupLayout pane_otrosLayout = new javax.swing.GroupLayout(pane_otros);
                        pane_otros.setLayout(pane_otrosLayout);
                        pane_otrosLayout.setHorizontalGroup(
                            pane_otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
                        );
                        pane_otrosLayout.setVerticalGroup(
                            pane_otrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
                        );

                        jTabbedPane1.addTab("Otros", pane_otros);

                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                        );
                        layout.setVerticalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
                        );

                        pack();
                    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarClienteActionPerformed
        if(!panel_reg_fisico.isVisible()){
            desactivar_Cliente.setVisible(false);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            panel_reg_fisico.setVisible(true);
            panel_reg_fisico.validate();
            panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
        } else {
            panel_reg_fisico.repaint();
        }
    }//GEN-LAST:event_jbRegistrarClienteActionPerformed

    private void jbEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarClienteActionPerformed
        if(!panel_reg_fisico.isVisible()){
            desactivar_Cliente.setVisible(false);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            panel_reg_fisico.setVisible(true);
            panel_reg_fisico.validate();
            panel_reg_fisico.paintComponents(panel_reg_fisico.getGraphics());
        } else {
            panel_reg_fisico.repaint();
        }
    }//GEN-LAST:event_jbEditarClienteActionPerformed

    private void jbDesactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarClienteActionPerformed
        if(!desactivar_Cliente.isVisible()){
            panel_reg_fisico.setVisible(false);
            panel_reg_fisico.validate();
            panel_datos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            panel_datos.validate();
            desactivar_Cliente.setVisible(true);
            desactivar_Cliente.validate();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
        } else {
            desactivar_Cliente.repaint();
            desactivar_Cliente.paintComponents(desactivar_Cliente.getGraphics());
        }
    }//GEN-LAST:event_jbDesactivarClienteActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFTelHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelHabitacionActionPerformed

    private void jBAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClienteActionPerformed
       
        Cliente cli = new Cliente(jTFNombre.getText(), jf_cedula.getText(), dateChooserCombo1.getText(),
                jTFDireccion.getText(), jTFOcupacion.getText(), jTFTelHabitacion.getText(),
                jTFTelCelular.getText(), jTFTelTrabajo.getText(), jTFTelEmergencia.getText(), jTFMail.getText(),
                jcbsangre.getSelectedItem().toString(), jcbcondiFisica.getSelectedItem().toString(),
                jcbestadoSalud.getSelectedItem().toString(), jcbpregunta.getSelectedItem().toString(),
                jTFInfoMedico.getText(), Double.valueOf(jtf_altura.getText()));
        control.getDao().setCliente(cli);//mete el cliente en la base de datos

        Padecimiento pad = new Padecimiento(jcbpresion.getSelectedItem().toString(),
                jcbdiscapacidad.getSelectedItem().toString(),
                jTFEnfCronica.getText(), jTFLesion.getText(), this.jTFHernia.getText(),
                jTFQuebradura.getText(), jcbembarazo.getSelectedItem().toString(),
                jcbpostembarazo.getSelectedItem().toString(),
                jTAOtro.getText(), cli);
        pad.setAtributos(jlist_enfermedades);
         control.getDao().setPadecimiento(pad);
         
          RegistroFisicoCliente rf = new RegistroFisicoCliente(control, cli);
        rf.setVisible(true);
        JOptionPane.showMessageDialog(null, "Usuario creado e ingresado");
    }//GEN-LAST:event_jBAddClienteActionPerformed

    private void cedClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedClienteActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jcbdiscapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbdiscapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbdiscapacidadActionPerformed

    private void combo_nombre_cliente_seguimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nombre_cliente_seguimiento1ActionPerformed
        Cliente c = control.getDao().getCliente(
            combo_filtro_cliente2.getSelectedItem().toString(),
            combo_nombre_cliente_seguimiento1.getSelectedItem().toString());
        this.jta_info_busqueda_cliente.setText(c.toString());        // TODO add your handling code here:
    }//GEN-LAST:event_combo_nombre_cliente_seguimiento1ActionPerformed

    private void jb_salvar_en_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvar_en_archivoActionPerformed
        String name = control.getDao().getCliente(
            combo_filtro_cliente2.getSelectedItem().toString(), combo_nombre_cliente_seguimiento1.getSelectedItem().toString()).getNombre();
        FileWriter fw;
        try {
            fw = new FileWriter(new File(name + ".txt"));
            fw.write(control.getDao().getCliente(
                combo_filtro_cliente2.getSelectedItem().toString(),
                combo_nombre_cliente_seguimiento1.getSelectedItem().toString()).toString());
        fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jb_salvar_en_archivoActionPerformed

    private void jcbpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbpresionActionPerformed

    private void jf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jf_cedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel_asignar_rutina.setVisible(false);
        panel_crear_rutina.setVisible(true);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panel_crear_rutina.setVisible(false);
        panel_asignar_rutina.setVisible(true);
        panel_asignar_rutina.paintComponents(panel_asignar_rutina.getGraphics());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panel_asignar_rutina.setVisible(false);
        panel_crear_rutina.setVisible(true);
        panel_crear_rutina.paintComponents(panel_crear_rutina.getGraphics());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cedCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedCliente1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_crear_perfil_NutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_perfil_NutricionalActionPerformed
        panel_asignar_perfil.setVisible(false);
        panel_crear_perfil_nutricional.setVisible(true);
        panel_crear_perfil_nutricional.paintComponents(panel_crear_perfil_nutricional.getGraphics());
    }//GEN-LAST:event_btn_crear_perfil_NutricionalActionPerformed

    private void btn_asignar_pNutricionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar_pNutricionalActionPerformed
        panel_crear_perfil_nutricional.setVisible(false);
        panel_asignar_perfil.setVisible(true);
        panel_asignar_perfil.paintComponents(panel_asignar_perfil.getGraphics());
    }//GEN-LAST:event_btn_asignar_pNutricionalActionPerformed

    private void jTFNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombre2ActionPerformed

    private void rb_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_masculinoActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cedCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedCliente2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void combo_filtro_cliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtro_cliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_filtro_cliente3ActionPerformed

    private void combo_nombre_cliente_seguimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nombre_cliente_seguimiento2ActionPerformed

    }//GEN-LAST:event_combo_nombre_cliente_seguimiento2ActionPerformed

    private void jcb_proyecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_proyecActionPerformed
        System.out.println( jcb_proyec.getSelectedItem().toString());
        Cliente c = control.getDao().getCliente(
            combo_filtro_cliente3.getSelectedItem().toString(),
            combo_nombre_cliente_seguimiento2.getSelectedItem().toString());
        System.out.println( c.toString());

        HashMap<String, Double> h =
        control.getDao().getFechasYValores(c,
            jcb_proyec.getSelectedItem().toString());
        String n= c.getNombre();
        ChartPanel ch = Chart.getChartPanel(jcb_proyec.getSelectedItem().toString(),
            control.getDao().getTipo_unidad(), h,
            n.indexOf(' ')!= -1 ? n.substring(0, n.indexOf(' ')) : n );
        ch.setSize(jp_chart.getSize());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jp_chart.removeAll();
                jp_chart.revalidate(); // This removes the old chart
                jp_chart.setLayout(new BorderLayout());
                jp_chart.add(ch);
                jp_chart.repaint();
            }
        }
        );
    }//GEN-LAST:event_jcb_proyecActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        control.useChooser(Chart.getJChart());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void combo_filtro_cliente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_filtro_cliente4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_filtro_cliente4ActionPerformed

    private void combo_nombre_cliente_seguimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nombre_cliente_seguimiento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_nombre_cliente_seguimiento3ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    public static void look() {
        try {//com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
    }

    private Controlador control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignar_pNutricional;
    private javax.swing.JButton btn_crear_perfil_Nutricional;
    private javax.swing.JTextField cedCliente;
    private javax.swing.JTextField cedCliente1;
    private javax.swing.JTextField cedCliente2;
    private javax.swing.JComboBox combo_filtro_cliente1;
    private javax.swing.JComboBox combo_filtro_cliente2;
    private javax.swing.JComboBox combo_filtro_cliente3;
    private javax.swing.JComboBox combo_filtro_cliente4;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento1;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento2;
    private javax.swing.JComboBox combo_nombre_cliente_seguimiento3;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateChooserCombo3;
    private javax.swing.JPanel desactivar_Cliente;
    private javax.swing.ButtonGroup grupo_sexo;
    private javax.swing.JButton jBAddCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLDatosPersonales;
    private javax.swing.JLabel jLDatosPersonales2;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLOcupacion;
    private javax.swing.JLabel jLPadecimientos;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLTelCelular;
    private javax.swing.JLabel jLTelHabitacion;
    private javax.swing.JLabel jLTelTrabajo;
    private javax.swing.JLabel jL_bienvenido;
    private javax.swing.JLabel jL_imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTAOtro;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFEnfCronica;
    private javax.swing.JTextField jTFHernia;
    private javax.swing.JTextField jTFInfoMedico;
    private javax.swing.JTextField jTFLesion;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFOcupacion;
    private javax.swing.JTextField jTFQuebradura;
    private javax.swing.JTextField jTFTelCelular;
    private javax.swing.JTextField jTFTelEmergencia;
    private javax.swing.JTextField jTFTelHabitacion;
    private javax.swing.JTextField jTFTelTrabajo;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton jbDesactivarCliente;
    private javax.swing.JButton jbEditarCliente;
    private javax.swing.JButton jbRegistrarCliente;
    private javax.swing.JButton jb_salvar_en_archivo;
    private javax.swing.JComboBox jcb_proyec;
    private javax.swing.JComboBox jcbcondiFisica;
    private javax.swing.JComboBox jcbdiscapacidad;
    private javax.swing.JComboBox jcbembarazo;
    private javax.swing.JComboBox jcbestadoSalud;
    private javax.swing.JComboBox jcbpostembarazo;
    private javax.swing.JComboBox jcbpregunta;
    private javax.swing.JComboBox jcbpresion;
    private javax.swing.JComboBox jcbsangre;
    private javax.swing.JFormattedTextField jf_cedula;
    private javax.swing.JLabel jl_PGS;
    private javax.swing.JList jlist_enfermedades;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JPanel jp_chart;
    private javax.swing.JTextArea jta_info_busqueda_cliente;
    private javax.swing.JTextField jtf_altura;
    private javax.swing.JLabel label_cliente_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento;
    private javax.swing.JLabel label_fecha_seguimiento1;
    private javax.swing.JPanel pane_otros;
    private javax.swing.JPanel panel_asignar_perfil;
    private javax.swing.JPanel panel_asignar_rutina;
    private javax.swing.JPanel panel_busqueda;
    private javax.swing.JPanel panel_control_pagos;
    private javax.swing.JPanel panel_crear_perfil_nutricional;
    private javax.swing.JPanel panel_crear_rutina;
    private javax.swing.JScrollPane panel_datos;
    private javax.swing.JScrollPane panel_datos1;
    private javax.swing.JScrollPane panel_datos4;
    private javax.swing.JPanel panel_datos_seg;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_menu1;
    private javax.swing.JPanel panel_menu2;
    private javax.swing.JPanel panel_reg_fisico;
    private javax.swing.JPanel panel_registro_cliente;
    private javax.swing.JPanel panel_registro_nutricional;
    private javax.swing.JPanel panel_registro_rutinas;
    private javax.swing.JPanel panel_seguimientos;
    private javax.swing.JRadioButton rb_femenino1;
    private javax.swing.JRadioButton rb_masculino;
    // End of variables declaration//GEN-END:variables
}
