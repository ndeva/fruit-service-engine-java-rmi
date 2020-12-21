import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ComputeInterface extends Remote {
    Object executeTask(TaskInterface t) throws RemoteException;
    // implements the the client tasks as done by the task interface
}
