package gameserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



import CODE.Game_Remote_Interface;

public  class Game_Implementation extends UnicastRemoteObject implements Game_Remote_Interface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6206675329947693695L;
	private static Connection conn;
	
	protected Game_Implementation() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean GameLogin(String username, String password) throws RemoteException {
		// TODO Auto-generated method stub
		boolean result=false;
		try 
		{			
			
			String sql = "SELECT * FROM login WHERE userName = '" + username + "' AND password= '" + password +"'";
			
			PreparedStatement  pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();

					while (rs.next()) {
						if (rs.getString("password").equalsIgnoreCase(password)) {				
							result = true;														 
						} else {
							result = false;
							
						}
					}
						return result; //result		
	
			} 
			catch(Exception e) 
			{
				System.out.println("Implementation error in cath clouse");
				System.out.println(e.getMessage().toString());
				return false;
			}
	}

	@Override
	public void addAnswer(int q1, int q2, int q3, int q4, int q5, int q6, int q7, int q8) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String barChart() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Score() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

  
}