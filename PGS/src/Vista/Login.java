package Vista;

import Controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends JFrame {

    public Login(Controlador c) {
        super("Login PGS");
        this.control = c;
        this.ajustarComponentes();
        this.ajustarConfiguracion();
    }

    private void ajustarConfiguracion() {
        this.setSize(300, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Imagen/icon.png")).getImage();
        setIconImage(icon);
        try {//com.jtattoo.plaf.aero.AeroLookAndFeel
            // com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ajustarComponentes() {
        this.setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("/Imagen/pesas.jpg"))));

        this.setLayout(new GridBagLayout());
        conf = new GridBagConstraints();
        conf.gridy = 0;
        conf.gridx = 0;
        conf.gridwidth = 2;
        conf.insets = new Insets(0, 20, 15, 0);
        JLabel title = new JLabel("Login");
        title.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        title.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 18));
        title.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                title.setBorder(BorderFactory.createLineBorder(Color.green, 1));
                title.setForeground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                title.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
                title.setForeground(Color.black);
            }
        });
        this.add(title, conf);

        conf = new GridBagConstraints();
        conf.gridy = 1;
        conf.gridx = 0;
        user_label = new JLabel("Usuario");
        conf.insets = new Insets(0, 0, 0, 34);
        user_label.setForeground(Color.red);
        user_label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 17));
        user_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                user_label.setForeground(Color.orange);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                user_label.setForeground(Color.red);
            }
        });

        this.add(user_label, conf);

        conf.gridy = 2;
        conf.insets = new Insets(0, 0, 0, 13);
        password = new JLabel("Contraseña");
        password.setForeground(Color.red);
        password.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 17));
        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                password.setForeground(Color.orange);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                password.setForeground(Color.red);
            }
        });
        this.add(password, conf);

        conf.gridy = 1;
        conf.gridx = 1;
        conf.ipadx = 120;
        conf.insets = new Insets(0, 0, 8, 50);
        conf.anchor = GridBagConstraints.FIRST_LINE_START;
        user_field = new JTextField();
        this.add(user_field, conf);

        conf.gridy = 2;
        conf.gridx = 1;
        password_field = new JPasswordField();
        this.add(password_field, conf);

        conf = new GridBagConstraints();
        conf.gridy = 3;
        conf.gridx = 0;
        conf.gridwidth = 2;
        conf.ipadx = 60;
        conf.ipady = 10;
        conf.insets = new Insets(20, 0, 0, 0);
        ingresar = new JButton("Ingresar");
    
        ingresar.setFont(Font.getFont(Font.SANS_SERIF));
        ingresar.setBorder(BorderFactory.createEtchedBorder(new Color(234, 123, 67), new Color(134, 223, 120)));
        ingresar.setAlignmentX(Component.CENTER_ALIGNMENT);
        ingresar.addActionListener((ActionEvent e) -> {
            setVisible(false);

            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Vista(control).setVisible(true);
                }
            });
        });
        this.add(ingresar, conf);
    }

    public void mostrar() {
        this.setVisible(true);
    }

    private Controlador control;
    private GridBagConstraints conf;
    private JLabel user_label;
    private JTextField user_field;
    private JLabel password;
    private JPasswordField password_field;
    private JButton ingresar;

}
