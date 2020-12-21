import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class FruitComputeEngine extends UnicastRemoteObject implements ComputeInterface  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected FruitComputeEngine() throws RemoteException {
		super();
		// 
	}

	@Override
	public Object executeTask(TaskInterface t) throws RemoteException {
		// 
		return null;
	}
	
	public static void main(String[] args) {
		
		try {
			Registry myReg = LocateRegistry.getRegistry("127.0.0.1", 1099);
			TaskInterface t = (TaskInterface)myReg.lookup("myfruit");
			
			System.out.print("added fruit price =" + t.add());
			System.out.print("updated fruit price =" + t.update());
			System.out.print("delete fruit price =" + t.delete());
			System.out.print("total cost fruit price =" + t.cost());

		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	
	}


}
