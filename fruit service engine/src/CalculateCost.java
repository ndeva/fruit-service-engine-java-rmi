import java.rmi.RemoteException;
import java.util.Scanner;

public abstract class CalculateCost implements TaskInterface {

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
	public int cost() throws RemoteException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in); 
	    String fruitname = null;
	    String maxfruit = null;
	    int fruitSum = 0;
	    int totalSum = 0; 
	    int max = 0; 

	    System.out.print("Fruit name, " + "price in killogram, number of killogram sold: "); 


	    while(!(fruitname = input.next()).equals("stop")){
	        fruitSum = input.nextInt() * input.nextInt();
	        totalSum += fruitSum;
	        if(fruitSum > max){
	            maxfruit = fruitname;
	            max = fruitSum;
	        }

	    }

	    System.out.println("the earned money of all fruits is " + totalSum); 
	    System.out.println("fruit that achieved the largest profit is "+ maxfruit);
		return 0;
	}
}
