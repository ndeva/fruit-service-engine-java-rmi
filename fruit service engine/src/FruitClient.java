import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FruitClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Registry myReg = LocateRegistry.getRegistry("127.0.0.1", 1099);
			TaskInterface f = (TaskInterface)myReg.lookup("myfruit");
			
			System.out.print("added fruit price =" + f.add());
			System.out.print("updated fruit price =" + f.update());
			System.out.print("delete fruit price =" + f.delete());
			System.out.print("total cost fruit price =" + f.cost());



		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	
	}

}
