import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FruitComputeTaskRegistry {

	public static void main(String[] args) {

		
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			FruitComputeEngine f = new FruitComputeEngine();
			reg.rebind("myfruit", f);
			
			System.out.print("Compute registry is ready...");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
