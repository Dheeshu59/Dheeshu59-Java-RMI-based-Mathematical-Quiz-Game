package GUI;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CODE.Game_Remote_Interface;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwelcomeback = new JLabel("ADMIN LOGIN");
		lblwelcomeback.setForeground(new Color(255, 255, 255));
		lblwelcomeback.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblwelcomeback.setBounds(30, 27, 169, 32);
		contentPane.add(lblwelcomeback);
		
		textUsername = new JTextField();
		textUsername.setBounds(144, 106, 271, 32);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(144, 81, 129, 32);
		contentPane.add(lblUsername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setForeground(new Color(255, 255, 255));
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpassword.setBounds(144, 153, 106, 32);
		contentPane.add(lblpassword);
		
		JButton btnSignin = new JButton("SIGN IN");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username=textUsername.getText();
				String Password=passwordField.getText();
try
				{
					Game_Remote_Interface GameLogin=(Game_Remote_Interface) Naming.lookup("rmi://127.0.0.1:2021/GameService2021");
					
					if(Password.contains("123")&& Username.contains("admin"))
					{	
						AdminPanel adminPanel =new AdminPanel();
						adminPanel.setVisible(true);
						dispose();

					}
					else {
						JOptionPane.showMessageDialog(null, "Password do not match");
					}
				}
				catch (Exception e1)
				{
					// TODO: handle exception				
		            e1.printStackTrace();
		            System.out.println("Is the Gameserver running?");
		            System.out.println("An error occured: "+e1.toString());	
				}
			}
				
		});
		btnSignin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignin.setBounds(313, 282, 89, 32);
		contentPane.add(btnSignin);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setForeground(new Color(0, 0, 0));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnMenu, "Come Back Again");
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMenu.setBounds(165, 282, 89, 32);
		contentPane.add(btnMenu);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 184, 271, 32);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dewanmini\\Downloads\\space-planet-background-planets-surface-with-craters-stars-comets-dark-space_53562-8705.jpg"));
		lblNewLabel.setBounds(0, 0, 590, 436);
		contentPane.add(lblNewLabel);
	}

}