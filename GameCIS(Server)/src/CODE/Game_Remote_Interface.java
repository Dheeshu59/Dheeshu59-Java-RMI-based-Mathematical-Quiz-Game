package CODE;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 
 * @author dewanmini
 *
 */
public interface Game_Remote_Interface extends Remote {
	public boolean GameLogin(String username,String password) throws RemoteException;
	
	public void addAnswer(int q1, int q2,int q3,int q4,int q5,int q6,int q7,int q8) throws RemoteException;
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws RemoteException
	 * */
	
	
	public String barChart() throws RemoteException;	
	/**
	 * 
	 * @param cookie
	 * @return
	 * @throws RemoteException
	 */

	/**
	 * Outputs a Doughnut Chart about Viewer 
	 * @return
	 * @throws RemoteException 
	 */
	String Score() throws RemoteException;

}