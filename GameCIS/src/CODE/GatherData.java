package CODE;
import java.rmi.Naming;
import GUI.Answers;


public abstract class GatherData {

	//The main method of the class GatherData
	public static void main(String[] args) {
		
		//sending captured data to Service through Game_Interface;

		try {
			
			// Call the Game_Remote_Interface Interface class through the service and assign it to a variable
			Game_Remote_Interface send_data =(Game_Remote_Interface) Naming.lookup("rmi://127.0.0.1:2020/GameService2020");	
			
			// Initializing values by getting from Answers class
			int q1=Answers.getQ1();
			int q2=Answers.getQ2();
			int q3=Answers.getQ3();
			int q4=Answers.getQ4();
			int q5=Answers.getQ5();
			int q6=Answers.getQ6();
			int q7=Answers.getQ7();
			int q8=Answers.getQ8();
			
			System.out.println("\n");
			//Call the addAnswer method in Game_interface Interface class and pass values to the method
			send_data.addAnswer(q1, q2 ,q3, q4, q5, q6, q7, q8);

			
		} 
		
		catch (Exception e1) {

			//print the exceptions in console
			e1.printStackTrace();
			System.out.println("Error: "+e1.toString());
			
			
		}
		
		
		

	}

}

