import java.io.Serializable;
import java.rmi.RemoteException;

public interface TaskInterface extends Serializable {
    Object execute(Object data);
    
    public int add () throws RemoteException;
    
    public int update () throws RemoteException;

    public int delete () throws RemoteException;
    
    public int fruitCost () throws RemoteException;
    
    public int cost () throws RemoteException;


}