package GUI;



import java.awt.EventQueue;
import java.awt.Image;

import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdminPanel extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ChartDisplay = new JLabel("");
		ChartDisplay.setBounds(134, 23, 456, 402);
		contentPane.add(ChartDisplay);
		
		JButton btnNewButton = new JButton("View Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      
				try{
					Image image = null;
					URL url = new URL("https://quickchart.io/chart?c=%7B%0A%20%20type%3A%20%27bar%27%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B%27Q1%27%2C%20%27Q2%27%2C%20%27Q3%27%2C%20%27Q4%27%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20%27Users%27%2C%0A%20%20%20%20%20%20data%3A%20%5B50%2C%2060%2C%2070%2C%20180%5D%0A%20%20%20%20%7D%2C%20%7B%0A%20%20%20%20%20%20label%3A%20%27Revenue%27%2C%0A%20%20%20%20%20%20data%3A%20%5B100%2C%20200%2C%20300%2C%20400%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A");
					image = ImageIO.read(url).getScaledInstance(ChartDisplay.getWidth(), ChartDisplay.getHeight(), image.SCALE_SMOOTH);	
		                        ImageIcon icon = new ImageIcon(image); 			
					ChartDisplay.setIcon(icon);
		                        
		        } catch ( MalformedURLException | RemoteException ex) {
		            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
		        } catch (IOException ex) {
		            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
		        }
		        
				
			}
		});
		btnNewButton.setBounds(21, 69, 103, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(21, 361, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Score");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Image image = null;
					URL url = new URL("https://quickchart.io/sandbox/#%7B%0A%20%20type%3A%20'pie'%2C%0A%20%20data%3A%20%7B%0A%20%20%20%20labels%3A%20%5B'Q1'%2C%20'Q2'%2C%20'Q3'%2C%20'Q4'%5D%2C%0A%20%20%20%20datasets%3A%20%5B%7B%0A%20%20%20%20%20%20label%3A%20'Users'%2C%0A%20%20%20%20%20%20data%3A%20%5B50%2C%2060%2C%2070%2C%20180%5D%0A%20%20%20%20%7D%2C%20%7B%0A%20%20%20%20%20%20label%3A%20'Revenue'%2C%0A%20%20%20%20%20%20data%3A%20%5B100%2C%20200%2C%20300%2C%20400%5D%0A%20%20%20%20%7D%5D%0A%20%20%7D%0A%7D%0A");
					image = ImageIO.read(url).getScaledInstance(ChartDisplay.getWidth(), ChartDisplay.getHeight(), image.SCALE_SMOOTH);	
		                        ImageIcon icon = new ImageIcon(image); 			
					ChartDisplay.setIcon(icon);
		                        
		        } catch ( MalformedURLException | RemoteException ex) {
		            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
		        } catch (IOException ex) {
		            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
		        }
		        
			}
		});
		btnNewButton_2.setBounds(21, 161, 103, 23);
		contentPane.add(btnNewButton_2);
	}
}