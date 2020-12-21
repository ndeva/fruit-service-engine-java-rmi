import java.rmi.RemoteException;
import java.util.Scanner;
public abstract class AddFruitPrice implements TaskInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object execute(Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add() throws RemoteException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	System.out.println("Enter the fruit name: ");
    	String inp = input.next();
    	System.out.println("This is the fruit added, " + inp);
		return 0;
	}


}
