package builshop;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

@SuppressWarnings({ "serial", "deprecation" })
public class LogIn extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwdPassword;
	private JTextField txtUsername;
	private JButton btnLogin;
	private JButton btnExit;
	private JLabel lblWrongUser;

	public LogIn() {
		setTitle("BuildShop");
		//setIconImage(
		//		Toolkit.getDefaultToolkit().getImage(LogIn.class.getResource("/buildshop/resources/Logo32x32.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pwdPassword = new JPasswordField();
		pwdPassword.setToolTipText("Password");
		pwdPassword.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick();
					onLogIn();
				}
			}
		});
		pwdPassword.setBounds(167, 141, 134, 20);
		contentPane.add(pwdPassword);

		txtUsername = new JTextField();
		txtUsername.setName("");
		txtUsername.setToolTipText("Username");
		txtUsername.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					pwdPassword.requestFocus();
				}
			}
		});
		txtUsername.setBounds(167, 110, 134, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setBounds(43, 110, 90, 20);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(43, 141, 90, 20);
		contentPane.add(lblPassword);

		JLabel lblNewLabel = new JLabel("BuildShop");
		lblNewLabel.setForeground(new Color(80, 80, 80));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblNewLabel.setBounds(99, 23, 202, 48);
		contentPane.add(lblNewLabel);

		btnLogin = new JButton("LogIn");
		btnLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				onLogIn();
			}
		});
		btnLogin.setBounds(218, 209, 89, 23);
		contentPane.add(btnLogin);

		btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(43, 209, 89, 23);
		contentPane.add(btnExit);

		JLabel lblLogo = new JLabel("");
		//lblLogo.setIcon(new ImageIcon(LogIn.class.getResource("/buildshop/resources/Logo40x40.png")));
		lblLogo.setBounds(43, 23, 46, 45);
		contentPane.add(lblLogo);
		
		lblWrongUser = new JLabel("Wrong Username and/or Password");
		lblWrongUser.setVisible(false);
		lblWrongUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrongUser.setInheritsPopupMenu(false);
		lblWrongUser.setForeground(new Color(255, 0, 0));
		lblWrongUser.setBounds(43, 172, 258, 14);
		contentPane.add(lblWrongUser);
		DataManager.hideLS();
		setLocationRelativeTo(null);
	}
	
	private void onLogIn() {
        String user = txtUsername.getText();
		String pass = pwdPassword.getText();
    	lblWrongUser.setVisible(true);
        if (DataManager.findUser(user, pass)){
            DataManager.showLS();
            dispose();
        } else {
            txtUsername.requestFocus();
        }
    }
	

}
