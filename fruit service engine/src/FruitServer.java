import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FruitServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			FruitComputeEngine f = new FruitComputeEngine();
			reg.rebind("myfruit", f);
			
			System.out.print("Server is ready...");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
