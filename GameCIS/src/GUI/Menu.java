package GUI;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setForeground(new Color(139, 0, 0));
		setBounds(100, 100, 606, 475);
		contentPane = new JPanel();
		setBackground(new Color(0, 128, 128));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  WELCOME TO MATH TIME");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 17));
		lblNewLabel.setBounds(27, 0, 350, 36);
		getContentPane().add(lblNewLabel);
		
		JButton btnSignup = new JButton("Sign Up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSignup, "Please register from here");
				dispose();
				Register register =new Register();
				register.setVisible(true);
				
			}
		});
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSignup.setBounds(0, 192, 123, 30);
		getContentPane().add(btnSignup);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(0, 246, 123, 30);
		getContentPane().add(btnExit);
		
		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Instructions instructions = new Instructions();
				instructions.setVisible(true);
				
			}
		});
		btnInstructions.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInstructions.setBounds(0, 140, 123, 30);
		getContentPane().add(btnInstructions);
		
		JButton btnNewButton = new JButton("ADMIN PANEL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login= new Login();
				login.setVisible(true);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(0, 406, 123, 30);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dewanmini\\Downloads\\608c56b75cecb0342bb2eba612339f04.jpg"));
		lblNewLabel_1.setBounds(0, 0, 590, 436);
		getContentPane().add(lblNewLabel_1);
	}
}