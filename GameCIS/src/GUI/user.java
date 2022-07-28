package GUI;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class user extends JFrame {

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
					user frame = new user();
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
	public user() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwelcomeback = new JLabel("WELCOME BACK");
		lblwelcomeback.setForeground(new Color(255, 255, 255));
		lblwelcomeback.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblwelcomeback.setBounds(30, 27, 169, 32);
		contentPane.add(lblwelcomeback);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(182, 93, 209, 27);
		contentPane.add(lblNewLabel);
		
		textUsername = new JTextField();
		textUsername.setBounds(182, 117, 226, 32);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(182, 179, 100, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSignin = new JButton("SIGN IN");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					
					     Class.forName("com.mysql.cj.jdbc.Driver");
					     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/game","root","");
					     Statement stmt=con.createStatement();
					     String sql="Select * from user where username='"+textUsername.getText()+"'and password='"+passwordField.getText()+"'";
					     ResultSet rs=stmt.executeQuery(sql);
					     if(rs.next())
					     {
					    	 Start ad=new Start();
								ad.setVisible(true);
								dispose();
					                  
					     }else
					     {
					      JOptionPane.showMessageDialog(null,"Incorrect user");
					     }
					     
				}
				catch (Exception w){System.out.print(w);}
			}
		});
		btnSignin.setBounds(382, 324, 89, 23);
		contentPane.add(btnSignin);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register =new Register();
				register.setVisible(true);
				dispose();
			}
		});
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnBack.setBounds(89, 324, 89, 23);
		contentPane.add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 205, 226, 32);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\dewanmini\\Downloads\\94c37df1fdc086ede0ca411dda289407.jpg"));
		lblNewLabel_2.setBounds(0, 0, 590, 436);
		contentPane.add(lblNewLabel_2);

		
		
	}
}
