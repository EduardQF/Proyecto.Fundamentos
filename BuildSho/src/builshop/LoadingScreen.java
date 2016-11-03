package  builshop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class LoadingScreen extends JFrame {

	private JPanel contentPane;
	private JLabel lblLoading;

	public LoadingScreen() {
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:/BuildShop/IMG/Logo32x32.png"));
		setUndecorated(true);
		setTitle("BuildShop");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 80);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBuildShop = new JLabel("BuildShop");
		lblBuildShop.setForeground(new Color(80, 80, 80));
		lblBuildShop.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblBuildShop.setBounds(66, 11, 202, 48);
		contentPane.add(lblBuildShop);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:/BuildShop/IMG/Logo40x40.png"));
		lblLogo.setBounds(10, 11, 46, 45);
		contentPane.add(lblLogo);

		lblLoading = new JLabel("Loading");
		lblLoading.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblLoading.setInheritsPopupMenu(false);
		lblLoading.setBounds(200, 58, 70, 14);
		contentPane.add(lblLoading);

		setLocationRelativeTo(null);
	}


}
