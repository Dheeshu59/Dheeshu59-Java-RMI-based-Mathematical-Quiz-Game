package CODE;

import java.rmi.RemoteException;

/**
 * 
 * @author dewanmini
 *
 */
public interface Game_Remote_Interface {
	public boolean gamelogin(String username,String password) throws RemoteException;

	public void addAnswer(int q1, int q2, int q3, int q4, int q5, int q6, int q7, int q8);

	public String barChart();

}