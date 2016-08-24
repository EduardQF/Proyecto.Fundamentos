package pBuildShop;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class LogIn extends javax.swing.JFrame {

	public LogIn() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        try {
			readDB(DefaultData.defFolder+"/DB", "/users.buildshop");
			System.out.println("Data Loaded");
		} catch (NoSuchFileException e){
			DefaultData.newData(e);
		} catch (IOException e){	}
        p_StartScreen2.setVisible(false);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("C:/BuildShop/IMG/Logo64x64.png");
        return retValue;
    }

    private void initComponents() {
        p_StartScreen = new javax.swing.JPanel();
        t_username = new javax.swing.JTextField();
        l_username = new javax.swing.JLabel();
        l_password = new javax.swing.JLabel();
        l_incorrect = new javax.swing.JLabel();
        b_LogIn = new javax.swing.JButton();
        b_Exit = new javax.swing.JButton();
        l_buildshop = new javax.swing.JLabel();
        l_bsIcon = new javax.swing.JLabel();
        t_password = new javax.swing.JPasswordField();
        p_StartScreen2 = new javax.swing.JPanel();
        l_background = new javax.swing.JLabel();
        p_LoadingScreen = new javax.swing.JPanel();
        l_loading = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuildShop v0.1");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(10000, 10000));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(336, 266));
        setResizable(false);
        p_StartScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_StartScreen.setMaximumSize(new java.awt.Dimension(328, 265));
        p_StartScreen.setMinimumSize(new java.awt.Dimension(328, 265));
        p_StartScreen.setOpaque(false);
        t_username.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t_username.setName(""); // NOI18N
        t_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_usernameKeyReleased(evt);
            }
        });
        l_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_username.setText("Username");
        l_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_password.setText("Password");
        l_incorrect.setBackground(new java.awt.Color(255, 0, 0));
        l_incorrect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_incorrect.setForeground(new java.awt.Color(255, 0, 0));
        l_incorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_incorrect.setText(" ");
        l_incorrect.setFocusable(false);
        l_incorrect.setInheritsPopupMenu(false);
        b_LogIn.setText("LogIn");
        b_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LogInActionPerformed(evt);
            }
        });
        b_Exit.setText("Exit");
        b_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ExitActionPerformed(evt);
            }
        });
        l_buildshop.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        l_buildshop.setForeground(new Color(80,80,80));
        l_buildshop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_buildshop.setText("BuildShop");
        l_bsIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_bsIcon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l_bsIcon.setFocusable(false);
        t_password.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_passwordKeyReleased(evt);
            }
        });
        javax.swing.GroupLayout _StartScreenLayout = new javax.swing.GroupLayout(p_StartScreen);
        p_StartScreen.setLayout(_StartScreenLayout);
        _StartScreenLayout.setHorizontalGroup(
            _StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_StartScreenLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l_incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(_StartScreenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _StartScreenLayout.createSequentialGroup()
                        .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_username)
                            .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_username)
                            .addComponent(t_password, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _StartScreenLayout.createSequentialGroup()
                        .addComponent(b_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _StartScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_bsIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_buildshop, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        _StartScreenLayout.setVerticalGroup(
            _StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_StartScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_buildshop, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_bsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_incorrect)
                .addGap(37, 37, 37)
                .addGroup(_StartScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        p_StartScreen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_StartScreen2.setFocusable(false);
        p_StartScreen2.setPreferredSize(new java.awt.Dimension(304, 243));
        l_background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        javax.swing.GroupLayout _StartScreen2Layout = new javax.swing.GroupLayout(p_StartScreen2);
        p_StartScreen2.setLayout(_StartScreen2Layout);
        _StartScreen2Layout.setHorizontalGroup(
            _StartScreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_StartScreen2Layout.createSequentialGroup()
                .addComponent(l_background, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        _StartScreen2Layout.setVerticalGroup(
            _StartScreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_StartScreen2Layout.createSequentialGroup()
                .addComponent(l_background, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        l_loading.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        l_loading.setForeground(new Color(80,80,80));
        l_loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_loading.setText("BuildShop");
        javax.swing.GroupLayout _LoadingScreenLayout = new javax.swing.GroupLayout(p_LoadingScreen);
        p_LoadingScreen.setLayout(_LoadingScreenLayout);
        p_LoadingScreen.setMaximumSize(new java.awt.Dimension(200, 100));
        p_LoadingScreen.setMinimumSize(new java.awt.Dimension(200, 100));
        p_LoadingScreen.setOpaque(false);
        _LoadingScreenLayout.setHorizontalGroup(
            _LoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _LoadingScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_loading, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        _LoadingScreenLayout.setVerticalGroup(
            _LoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_LoadingScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_loading)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_StartScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(p_StartScreen2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p_LoadingScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_StartScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(p_StartScreen2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p_LoadingScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pack();
        ImageIcon backgroundIcon = new ImageIcon("C:/BuildShop/IMG/.png");
        l_background.setIcon(backgroundIcon);
        ImageIcon iIcon = new ImageIcon("C:/BuildShop/IMG/Logo40x45.png");
        l_bsIcon.setIcon(iIcon);
        p_LoadingScreen.setVisible(false);
    }

    @SuppressWarnings("deprecation")
	private void b_LogInActionPerformed(java.awt.event.ActionEvent evt) {
        String user = t_username.getText();
        String pass = t_password.getText();
        if (getUser(user, pass)){
            l_incorrect.setForeground(new Color(0,100,0));
            l_incorrect.setText("Success!");
            loadingS();
        } else {
            l_incorrect.setForeground(Color.red);
            l_incorrect.setText("Wrong Username and/or Password");
            t_username.requestFocus();
        }
    }

    private void b_ExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void t_usernameKeyReleased(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            t_password.requestFocus();
         }
    }

    private void t_passwordKeyReleased(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            b_LogInActionPerformed(null);
         }
    }

    public static void readDB(String folder, String file) throws IOException {
    	String text_raw = new String(Files.readAllBytes(Paths.get(folder+file)));
    	String[] text_clean = text_raw.split("¦»»»¦");
    	db_users = new String[text_clean.length/db_users.length][db_users.length];
    	int c = 0;
    	for (int s = 0; s < db_users.length; s++){
    		for (int S = 0; S < db_users[s].length; S++){
    			db_users[s][S] = text_clean[c];
    			c++;
    		}
    	}
    }

	public void loadingS(){
    	p_StartScreen.removeAll();
    	p_StartScreen.setVisible(false);
    	p_StartScreen2.removeAll();
    	p_StartScreen2.setVisible(false);
    	p_LoadingScreen.setVisible(true);
    	setSize(220, 70);
    	revalidate();
    	setLocationRelativeTo(null);
    	//mainMenu();
    }
    
    public static boolean getUser(String user, String pass) {
		for (int i = 0; i < db_users.length; i++) {
			if (user.equalsIgnoreCase(db_users[i][0]) && pass.equals(db_users[i][1])) {
				TempData.user_id = i;
				if (db_users[i][2].equals("admin")){
					TempData.user_access[0] = true; TempData.user_access[1] = true; 
					TempData.user_access[2] = true;
				} else if (db_users[i][2].equals("fulluser")){
					TempData.user_access[0] = true; TempData.user_access[1] = true; 
					TempData.user_access[2] = false;
				} else if (db_users[i][2].equals("inventory")){
					TempData.user_access[0] = false; TempData.user_access[1] = true; 
					TempData.user_access[2] = false;
				} else if (db_users[i][2].equals("seller")){
					TempData.user_access[0] = true; TempData.user_access[1] = false; 
					TempData.user_access[2] = false;
				}
				return true;
			}
		}
		return false;
	}
    
    public static void main(String args[])  {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new LogIn().setVisible(true);
				} catch (IOException e) {	}
            }
        });
    }
    
    public static String[][] db_users = new String[7][10];
    private javax.swing.JPanel p_LoadingScreen;
    private javax.swing.JPanel p_StartScreen;
    private javax.swing.JPanel p_StartScreen2;
    private javax.swing.JButton b_Exit;
    private javax.swing.JButton b_LogIn;
    private javax.swing.JLabel l_incorrect;
    private javax.swing.JLabel l_loading;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_username;
    private javax.swing.JLabel l_buildshop;
    private javax.swing.JLabel l_background;
    private javax.swing.JPasswordField t_password;
    private javax.swing.JTextField t_username;
    private javax.swing.JLabel l_bsIcon;
}
